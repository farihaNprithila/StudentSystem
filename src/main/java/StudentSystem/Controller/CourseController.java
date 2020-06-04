package StudentSystem.Controller;

import StudentSystem.Model.Course;
import StudentSystem.Model.Department;
import StudentSystem.Repository.CourseRepository;
import StudentSystem.Repository.DepartmentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Fariha Nawaz on 16,Apr,2020.
 */
@Controller
public class CourseController {

    private CourseRepository courseRepository;
    private DepartmentRepository departmentRepository;

    public CourseController(CourseRepository courseRepository, DepartmentRepository departmentRepository) {
        this.courseRepository = courseRepository;
        this.departmentRepository = departmentRepository;
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
        if((courseRepository.existsById(course.getId()))){
            return"error";
        }
        courseRepository.save(course);
        return "redirect:/course";
    }

    @ModelAttribute("dropdown")
    public List<Department> departmentList() {
        return departmentRepository.findAll();
    }
}
