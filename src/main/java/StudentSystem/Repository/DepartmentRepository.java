package StudentSystem.Repository;

import StudentSystem.Model.Department;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Fariha Nawaz on 15,Apr,2020.
 */
public interface DepartmentRepository extends CrudRepository<Department, Long> {
}
