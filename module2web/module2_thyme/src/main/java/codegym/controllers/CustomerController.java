package codegym.controllers;
import codegym.model.Customer;
import codegym.service.CustomerService;
import codegym.service.CustomerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class CustomerController {
    private CustomerService customerService = new CustomerServiceImpl();

    @GetMapping("/customer")
    public String index(Model model){
        List<Customer> customers =customerService.findAll();
        model.addAttribute("customers",customers);
        return "customer/view";
    }
    @GetMapping("/customer/create")
    public String create(Model model) {
        model.addAttribute("customer",new Customer());
        return "customer/create";
    }
    @PostMapping("/customer/save")
    public String save(Customer customer, RedirectAttributes redirectAttributes){
        customer.setId((int)(Math.random()*1000));
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("success","saved Success!");
        return "redirect:/customer" ;
    }
    @GetMapping("/customer/{id}/edit")
    public String edit(@PathVariable int id,Model model){
        model.addAttribute("customer",customerService.findById(id));
        return "/customer/edit" ;
    }
    @PostMapping("/customer/update")
    public  String update(Customer customer,RedirectAttributes redirectAttributes){
        customerService.update(customer.getId(),customer);
        redirectAttributes.addFlashAttribute("success","Update Success");
        return "redirect:/customer" ;
    }
    @GetMapping("customer/{id}/delete")
    public String delete(@PathVariable int id ,Model model){
        model.addAttribute("customer",customerService.findById(id));
        return "customer/delete" ;
    }
    @PostMapping("customer/delete")
    public String delete(Customer customer,RedirectAttributes redirectAttributes){
        customerService.remove(customer.getId());
        redirectAttributes.addFlashAttribute("success","removed Success");
        return "redirect:/customer" ;
    }
    @GetMapping("/customer/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "customer/show";
    }

}
