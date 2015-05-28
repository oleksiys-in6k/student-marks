package studentmarks.Entitys;

import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @Column(name = "student_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String firstName;
    private String lastName;

    private double avgMark;

    public Student(String firstName, String lastName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Student() {
    }

    @Formula("(select avg(e.mark) from course e where e.student_id = idStudent)")
    public double getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(double avgMark) {
        this.avgMark = avgMark;
    }

    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private List<Course> courses;

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourse(List<Course> students) {
        this.courses = students;
    }

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
