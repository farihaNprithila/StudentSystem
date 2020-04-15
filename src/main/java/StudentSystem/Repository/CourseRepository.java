package StudentSystem.Repository;

import StudentSystem.Model.Course;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Fariha Nawaz on 15,Apr,2020.
 */
public interface CourseRepository extends CrudRepository<Course, Long> {
}
