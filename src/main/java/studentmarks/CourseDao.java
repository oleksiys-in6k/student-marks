package studentmarks;

import java.util.List;

public interface CourseDao {

    public abstract void create(List listCourses);

    public abstract List findAll();

}
