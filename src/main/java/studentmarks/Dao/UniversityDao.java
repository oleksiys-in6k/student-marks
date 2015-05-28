package studentmarks.Dao;

import java.util.List;

public interface UniversityDao {

    public abstract void create(List list);

    public abstract List findAll();

}
