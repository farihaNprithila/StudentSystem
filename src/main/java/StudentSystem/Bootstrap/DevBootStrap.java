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
        Course course=new Course(101,"Programmimng Language I","TBA");
        courseRepository.save(course);
        //courseRepository.delete(course);
        course=new Course(102,"Programmimng Language II","TBA");
        courseRepository.save(course);
        //courseRepository.deleteById(102L);


    }
}
