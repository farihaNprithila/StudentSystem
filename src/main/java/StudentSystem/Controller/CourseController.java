package StudentSystem.Controller;

import StudentSystem.Model.Course;
import StudentSystem.Repository.CourseRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

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
        model.addAttribute("courses", courseRepository.findAll());
        return "course";
    }

    @GetMapping("/addcourse")
    public String newCourse(Model model) {
        model.addAttribute("courseAdd", new Course());
        return "courseForm";
    }

    @PostMapping("/addcourse")
    public String addCourse(@Valid @ModelAttribute("courseAdd") Course course, BindingResult result) {
        if (result.hasErrors()) {
            return "error";
        }
        courseRepository.save(course);
        return "redirect:/course";
    }
}
