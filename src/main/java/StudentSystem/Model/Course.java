package StudentSystem.Model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

/**
 * Created by Fariha Nawaz on 13,Apr,2020.
 */
@Entity
@Table(name = "course")
public class Course {

    @Id
    @Column(name = "id", nullable = false, updatable = false)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "instructor", nullable = false)
    private String instructor;

    @ManyToMany(mappedBy = "courses")
    private List<Student> students;

    @ManyToOne
    @JoinColumn(name = "dep_id", nullable = false)
    private Department department;

    public Course() {
    }

    public Course(long id, String name, String instructor) {
        this.id = id;
        this.name = name;
        this.instructor = instructor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return id == course.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
