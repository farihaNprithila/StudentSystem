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
import java.util.ArrayList;
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
        model.addAttribute("department", departmentRepository.findAll());
        return "studentForm";
    }

    @ModelAttribute("allDepartments")
    public List<Department> populateDepartments() {
        ArrayList<Department> departments = new ArrayList<Department>();
        List<Department> ndep = new ArrayList<Department>();
        departmentRepository.findAll().forEach(ndep::add);
        departments.add(new Department(-1, "Select Department"));
        departments.addAll(ndep);
        return departments;
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
