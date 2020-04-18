package StudentSystem.Controller;

import StudentSystem.Model.Student;
import StudentSystem.Repository.StudentRepository;
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

    @GetMapping("/addstudent")
    public String newStudent(Model model) {
        model.addAttribute("studentAdd", new Student());
        return "studentForm";
    }

    @PostMapping("/addstudent")
    public String addStudent(@Valid @ModelAttribute("studentAdd") Student student, BindingResult result) {
        if (result.hasErrors()) {
            return "error";
        }
        studentRepository.save(student);
        return "redirect:/student";
    }
}
