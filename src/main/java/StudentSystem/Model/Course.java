package StudentSystem.Model;

import org.hibernate.annotations.Table;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by Fariha Nawaz on 13,Apr,2020.
 */
@Entity
@Table(name= "course")
public class Course {
    @Column(name = "")
    private long courseId;
    @Column(name = "")
    private String courseName;
    @Column(name = "")
    private String courseInstructor;
}
