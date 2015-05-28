import org.hibernate.Session;
import org.hibernate.SessionFactory;
import studentmarks.Entitys.Course;
import studentmarks.Entitys.Student;
import studentmarks.Service.HibernateUtils;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        List<Course> courses = new ArrayList<Course>();

        SessionFactory sf = HibernateUtils.getSessionFactory();
        Session session = sf.openSession();

        session.beginTransaction();

        Student student = new Student("Ivan","Ivanov");
        students.add(student);
        session.save(student);

        Course course1 = new Course("Math",(float) 5);
        courses.add(course1);
//        student.getCourses().add(course1);

        System.out.println(course1);

        session.save(course1);

        Course course2 = new Course("History",(float) 2);
        courses.add(course2);
        course2.setStudent(student);
        session.save(course2);

        Course course3 = new Course("English",(float) 3);
        courses.add(course3);
        course3.setStudent(student);
        session.save(course3);

        System.out.println(student);

        System.out.println(course1);
        System.out.println(course2);
        System.out.println(course3);

        course1.setStudent(student);

        //student.getCourses().add(course1);


        session.getTransaction().commit();


        session.close();
//        session.flush();

    }

}
