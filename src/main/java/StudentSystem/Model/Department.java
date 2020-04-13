package StudentSystem.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//
/**
 * Created by Fariha Nawaz on 13,Apr,2020.
 */
@Entity
@Table(name = "department")
public class Department {

    @Id
    @Column(name = "department_id",  nullable = false)
    private long departmentId;
    @Column(name = "department_name",  nullable = false)
    private String departmentName;

    public Department(long departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
