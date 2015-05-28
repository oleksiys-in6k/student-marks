import studentmarks.Entitys.Course;
import studentmarks.Entitys.Student;
import studentmarks.Service.StudentService;
import studentmarks.Service.StudentServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        List<Course> courses = new ArrayList<Course>();

        //ToDo

        Student student = new Student();
        student.setFirstName("FirstName");
        student.setLastName("lastName");
        students.add(student);


        StudentService studentService = new StudentServiceImpl();
        studentService.processStudent(students);

//        CourseService courseService = new CourseServiceImpl();
//        courseService.processCourse(courses);

    }
}
