package studentmarks.Entitys;

import javax.persistence.*;
import java.util.List;



@Entity
@Table(name = "student")
public class Student {

    @Id
    @Column(name = "ID")
    @GeneratedValue
//    @OneToMany
    private int id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

//    public List<Course> getCourses() {
//        return courses;
//    }
//
//    public void setCourse(List<Course> students) {
//        this.courses = students;
//    }

//    private List<Course> courses;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return new StringBuffer().append("firstName=" + getFirstName()).append(",lastName=" + getLastName()).toString();
    }

}
