package studentmarks.Service;

import studentmarks.Dao.CourseDaoImpl;
import studentmarks.Dao.UniversityDao;
import studentmarks.Entitys.Course;

import java.util.List;

public class CourseServiceImpl implements CourseService {
    @Override
    public void processCourse(List<Course> courses) {
        UniversityDao dao = new CourseDaoImpl(); // tightly coupled
        dao.create(courses);
        List<Course> list = dao.findAll();
        System.out.println("The saved courses are --> " + list);

    }
}
