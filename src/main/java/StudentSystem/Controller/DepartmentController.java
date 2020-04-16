package StudentSystem.Controller;

import StudentSystem.Repository.DepartmentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
