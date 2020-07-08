package com.exam.javwbe.controllers;

import com.exam.javwbe.entity.Customer;
import com.exam.javwbe.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("")
    public ModelAndView showListCustomer(@PageableDefault(value = 2) Pageable pageable, @RequestParam(value = "name", required = false, defaultValue = "") String name,
                                         @RequestParam(value = "code", required = false, defaultValue = "") String code )
                                      {
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("customers",customerService.getAllCustomerByFlashDeleteIsFalseAndNameContainingAndCodeCustomerContaining(pageable, name, code));
        modelAndView.addObject("name",name);
        modelAndView.addObject("code",code);
        return modelAndView;
    }
    @GetMapping("/create")
    public ModelAndView showFormCreateService() {
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("customers", new Customer());
        return modelAndView;
    }

    @PostMapping("/create")
    public String createCustomer(@Valid @ModelAttribute("customers") Customer customer, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        customer.validate(customer,bindingResult);
        if (bindingResult.hasErrors()) {
            return "create";
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
        return new ModelAndView("edit", "customers", customerService.getCustomerById(id));
    }

    @PostMapping("/edit")
    public String editCustomer(@Valid @ModelAttribute("customers") Customer customer, BindingResult bindingResult,RedirectAttributes redirectAttributes) {
        customer.validate(customer,bindingResult);
        if (bindingResult.hasErrors()) {
            return "edit";
        }
        if (customer == null) {
            return "404";
        }
        try {
            customerService.updateCustomer(customer);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        redirectAttributes.addFlashAttribute("message", "Edit SuccessFully");
        return "redirect:/customer";
    }

        @GetMapping("/delete/{id}")
        public String deleteCustomer(@PathVariable Long id,RedirectAttributes redirectAttributes ) {
           Customer customer = customerService.getCustomerById(id) ;
            if (customer == null){
                return "500" ;
            }
            customerService.delete(customer) ;
            redirectAttributes.addFlashAttribute("message", "Delete SuccessFully");
            return "redirect:/customer";
        }
    }


