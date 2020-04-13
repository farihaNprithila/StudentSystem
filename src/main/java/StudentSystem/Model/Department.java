package StudentSystem.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
//
/**
 * Created by Fariha Nawaz on 13,Apr,2020.
 */
@Entity
@Table(name = "department")
public class Department {

    @Column(name = "department_id")
    private long departmentId;
    @Column(name = "department_name")
    private String departmentName;
}
