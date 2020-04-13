package StudentSystem.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

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

    public Course(long courseId, String courseName, String courseInstructor) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseInstructor = courseInstructor;
    }

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseInstructor() {
        return courseInstructor;
    }

    public void setCourseInstructor(String courseInstructor) {
        this.courseInstructor = courseInstructor;
    }

}
