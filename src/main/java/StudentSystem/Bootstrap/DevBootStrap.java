package StudentSystem.Bootstrap;

import StudentSystem.Model.Course;
import StudentSystem.Repository.CourseRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by Fariha Nawaz on 16,Apr,2020.
 */
@Component
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent> {
    private CourseRepository courseRepository;

    public DevBootStrap(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        Course course = new Course(110, "Programming Language I", "TBA");
        courseRepository.save(course);
        course = new Course(111, "Programming Language II", "TBA");
        courseRepository.save(course);
        course = new Course(220, "Data Structure", "TBA");
        courseRepository.save(course);
        course = new Course(221, "Algorithm", "TBA");
        courseRepository.save(course);
        //courseRepository.deleteById(101L);
        //courseRepository.deleteById(102L);


    }
}
