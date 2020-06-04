package StudentSystem.Controller;

import StudentSystem.Model.Department;
import StudentSystem.Model.Student;
import StudentSystem.Repository.DepartmentRepository;
import StudentSystem.Repository.StudentRepository;
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
public class StudentController {

    private StudentRepository studentRepository;
    private DepartmentRepository departmentRepository;

    public StudentController(StudentRepository studentRepository, DepartmentRepository departmentRepository) {
        this.studentRepository = studentRepository;
        this.departmentRepository = departmentRepository;
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
        if (studentRepository.existsById(student.getId())) {
            return "error";
        }
        studentRepository.save(student);
        return "redirect:/student";
    }

    @ModelAttribute("dropdown")
    public List<Department> departmentList() {
        return departmentRepository.findAll();
    }
}
