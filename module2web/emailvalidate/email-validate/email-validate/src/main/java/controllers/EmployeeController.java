package controllers;

import model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("employee/")
public class EmployeeController {
    @GetMapping("showform")
    public String showForm(ModelMap model){
        model.addAttribute("employee",new Employee());
        return "employee/create";
    }
    @PostMapping("addEmployee")
    public String submit(@ModelAttribute("employee") Employee employee , BindingResult result,ModelMap modelMap){
        modelMap.addAttribute("name",employee.getName());
        modelMap.addAttribute("contactNumber",employee.getContactNumber());
        modelMap.addAttribute("id",employee.getId());
        return "employee/info";
    }
}
