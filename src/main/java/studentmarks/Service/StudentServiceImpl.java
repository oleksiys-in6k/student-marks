package studentmarks.Service;

import studentmarks.Dao.StudentDaoImpl;
import studentmarks.Dao.UniversityDao;
import studentmarks.Entitys.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Override
    public void processStudent(List<Student> students) {
        UniversityDao dao = new StudentDaoImpl(); // tightly coupled
        dao.create(students);
        List<Student> list = dao.findAll();
        System.out.println("The saved students are --> " + list);

    }
}
