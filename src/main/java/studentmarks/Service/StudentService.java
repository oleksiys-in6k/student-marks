package studentmarks.Service;

import studentmarks.Entitys.Course;
import studentmarks.Entitys.Student;

import java.util.List;

public interface StudentService {
    public abstract void processStudent(List<Student> students);

}
