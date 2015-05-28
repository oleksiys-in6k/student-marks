package studentmarks.Entitys;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "course" )
public class Course {

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private long id;
    private String title;
    private float mark;

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
