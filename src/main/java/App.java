import studentmarks.Course;
import studentmarks.CourseService;
import studentmarks.CourseServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Course> courses = new ArrayList<Course>(10);

        Course c1 = new Course();
        c1.setName("John");
        c1.setCourse("Java");
        courses.add(c1);

        Course c2 = new Course();
        c2.setName("Peter");
        c2.setCourse("Hibernate");
        courses.add(c2);

        CourseService service = new CourseServiceImpl(); // tightly coupled
        service.processCourse(courses);
    }
}
