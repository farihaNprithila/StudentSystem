package StudentSystem.Model;

import org.hibernate.annotations.Table;

import javax.persistence.Column;

/**
 * Created by Fariha Nawaz on 13,Apr,2020.
 */
@Table()
public class Course {
    @Column(name = "")
    private long courseId;
    @Column(name = "")
    private String courseName;
    @Column(name = "")
    private String courseInstructor;
}
