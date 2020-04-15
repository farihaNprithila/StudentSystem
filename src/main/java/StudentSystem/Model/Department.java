package StudentSystem.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;
//
/**
 * Created by Fariha Nawaz on 13,Apr,2020.
 */
@Entity
@Table(name = "department")
public class Department {

    @Id
    @Column(name = "id",  nullable = false,updatable = false)
    private long id;

    @Column(name = "name",  nullable = false)
    private String departmentName;

    public Department() {
    }

    public Department(long id, String departmentName) {
        this.id = id;
        this.departmentName = departmentName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
