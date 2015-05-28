package studentmarks.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import studentmarks.Entitys.Course;

import java.util.List;

public class CourseDaoImpl implements UniversityDao {

    private static final SessionFactory sessionFactory;

    static {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            sessionFactory = new Configuration().configure().buildSessionFactory();
        }
        catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    @Override
    public void create(List listCourses) {
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        for (Object course : listCourses) {
            session.save(course);
        }

        session.getTransaction().commit();
    }

    public List findAll() {
        Session session = sessionFactory.openSession();
        List<Course> list = session.createQuery("From Course").list();
        return list;
    }
}
