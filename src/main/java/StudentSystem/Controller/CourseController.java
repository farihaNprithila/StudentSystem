package StudentSystem.Controller;

import StudentSystem.Repository.CourseRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Fariha Nawaz on 16,Apr,2020.
 */
@Controller
public class CourseController {

    private CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @GetMapping("/course")
    public String showCourses(Model model) {
        model.addAttribute("courses",courseRepository.findAll());
        return "course";
    }
}
