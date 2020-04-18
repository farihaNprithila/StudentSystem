package StudentSystem.Controller;

import StudentSystem.Model.Department;
import StudentSystem.Repository.DepartmentRepository;
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
public class DepartmentController {
    private DepartmentRepository departmentRepository;

    public DepartmentController(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @GetMapping("/department")
    public String showDepartment(Model model) {
        model.addAttribute("departments", departmentRepository.findAll());
        return "department";
    }

    @GetMapping("/adddepartment")
    public String newDepartment(Model model) {
        model.addAttribute("departmentAdd", new Department());
        return "departmentForm";
    }

    @PostMapping("/adddepartment")
    public String addDepartment(@Valid @ModelAttribute("departmentAdd") Department department, BindingResult result) {
        if (result.hasErrors()) {
            return "error";
        }
        departmentRepository.save(department);
        return "redirect:/department";
    }
}
