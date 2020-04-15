package StudentSystem.Repository;

import StudentSystem.Model.Student;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Fariha Nawaz on 15,Apr,2020.
 */
public interface StudentRepository extends CrudRepository<Student, Long> {
}
