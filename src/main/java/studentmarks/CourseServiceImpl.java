package studentmarks;

import java.util.List;

/**
 * Created by employee on 5/27/15.
 */
public class CourseServiceImpl implements CourseService {
    @Override
    public void processCourse(List<Course> courses) {
        CourseDao dao = new CourseDaoImpl(); // tightly coupled
        dao.create(courses);
        List<Course> list = dao.findAll();
        System.out.println("The saved courses are --> " + list);

    }
}
