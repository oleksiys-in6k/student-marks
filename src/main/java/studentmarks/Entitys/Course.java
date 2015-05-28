package studentmarks.Entitys;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "course" )
public class Course {

    @Id
    @Column(name = "course_id")

    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String title;
    private float mark;

    @ManyToOne
    @JoinColumn(name = "id_student")
    private Student student;

    public Course(String title, float mark) {
        this.title = title;
        this.setMark(mark);
    }

    public Course(String title, float mark, Student student) {
        this.title = title;
        this.setMark(mark);
    }



    public Course() {
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Float getMark() {
        return mark;
    }

    public void setMark(Float mark) {
        this.mark = mark;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title + "\t" + mark;
    }
}
