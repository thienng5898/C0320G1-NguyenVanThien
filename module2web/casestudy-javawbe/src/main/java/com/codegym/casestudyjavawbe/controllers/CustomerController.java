package com.codegym.casestudyjavawbe.controllers;

import com.codegym.casestudyjavawbe.models.Customer;
import com.codegym.casestudyjavawbe.models.Service;
import com.codegym.casestudyjavawbe.models.TypeCustomer;
import com.codegym.casestudyjavawbe.services.CustomerService;
import com.codegym.casestudyjavawbe.services.TypeCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    private TypeCustomerService typeCustomerService;

    @Autowired
    private CustomerService customerService;

    @ModelAttribute("listTypeCustomer")
    public List<TypeCustomer> getTypeCustomer() {
        return typeCustomerService.getAllTypeCustomer();
    }

    @GetMapping("")
    public ModelAndView showListCustomer(@PageableDefault(value = 2) Pageable pageable, @RequestParam(value = "name", required = false, defaultValue = "") String name,
                                         @RequestParam(value = "code", required = false, defaultValue = "") String code,
                                         @RequestParam(value = "address", required = false, defaultValue = "") String address) {
        ModelAndView modelAndView = new ModelAndView("customer/list");
        modelAndView.addObject("customers",customerService.getAllCustomerByFlashDeleteIsFalseAndNameContainingAndCodeCustomerContainingAndAddressContaining(pageable, name, code, address));
        modelAndView.addObject("name",name);
        modelAndView.addObject("code",code);
        modelAndView.addObject("address",address);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showFormCreateService() {
        ModelAndView modelAndView = new ModelAndView("customer/create");
        modelAndView.addObject("customers", new Customer());
        return modelAndView;
    }

    @PostMapping("/create")
    public String createCustomer(@Valid @ModelAttribute("customers") Customer customer, BindingResult bindingResult,RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "customer/create";
        }
        if (customer == null) {
            return "404";
        }
        try {
            customerService.saveCustomer(customer);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        redirectAttributes.addFlashAttribute("message", "Create SuccessFully");
        return "redirect:/customer";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showFormEditCustomer(@PathVariable Long id) {
        return new ModelAndView("customer/edit", "customers", customerService.getCustomerById(id));
    }

    @PostMapping("/edit")
    public String editCustomer(@Valid @ModelAttribute("customers") Customer customer, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "customer/edit";
        }
        if (customer == null) {
            return "404";
        }
        try {
            customerService.updateCustomer(customer);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "redirect:";
    }

    @GetMapping("/delete/{id}")
    public ModelAndView showFormDeleteCustomer(@PathVariable Long id) {
        return new ModelAndView("customer/delete", "customers", customerService.getCustomerById(id));
    }

    @PostMapping("/delete")
    public String deleteCustomer(@ModelAttribute("customers") Customer customer, RedirectAttributes redirectAttributes) {
        try {
            customerService.deleteCustomer(customer);
        } catch (Exception e) {
            return "500";
        }
        redirectAttributes.addFlashAttribute("message", "Delete SuccessFully");
        return "redirect:/customer";
    }

}
