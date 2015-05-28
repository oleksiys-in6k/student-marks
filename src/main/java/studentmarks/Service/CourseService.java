package studentmarks.Service;

import studentmarks.Entitys.Course;
import studentmarks.Entitys.Student;

import java.util.List;

public interface CourseService {
    public abstract void processCourse(List<Course> courses);

}
