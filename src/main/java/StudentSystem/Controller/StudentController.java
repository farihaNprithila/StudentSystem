package StudentSystem.Controller;

import StudentSystem.Repository.StudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Fariha Nawaz on 16,Apr,2020.
 */
@Controller
public class StudentController {
    private StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/student")
    public String showStudents(Model model) {
        model.addAttribute("students", studentRepository.findAll());
        return "student";
    }
}
