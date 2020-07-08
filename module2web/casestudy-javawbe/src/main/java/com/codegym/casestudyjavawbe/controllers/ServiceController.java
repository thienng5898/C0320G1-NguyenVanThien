package com.codegym.casestudyjavawbe.controllers;

import com.codegym.casestudyjavawbe.models.*;
import com.codegym.casestudyjavawbe.repositories.ServiceRepository;
import com.codegym.casestudyjavawbe.repositories.TypeRentRepository;
import com.codegym.casestudyjavawbe.repositories.TypeServiceRepository;
import com.codegym.casestudyjavawbe.services.ServiceService;
import com.codegym.casestudyjavawbe.services.TypeRentService;
import com.codegym.casestudyjavawbe.services.TypeServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
@RequestMapping("service")
public class ServiceController {
    @Autowired
    private ServiceService serviceService;

    @Autowired
    private TypeServiceService typeServiceService;

    @Autowired
    private TypeRentService typeRentService;

    @ModelAttribute("listTypeService")
    public List<TypeService> getTypeService() {
        return typeServiceService.getAllTypeService();
    }

    @ModelAttribute("listTypeRent")
    public List<TypeRent> getTypeRent() {
        return typeRentService.getAllTypeRent();
    }

    @GetMapping("")
    public ModelAndView showListService(Pageable pageable, @RequestParam(value = "s", required = false, defaultValue = "") String s) {
        if (s == null) {
            s = "";
        }
        Page<Service> servicePage = serviceService.getAllServiceByFlashDeleteIsFalseAndServiceNameContaining(pageable, s);
        ModelAndView modelAndView = new ModelAndView("/service/list", "services", servicePage);
        modelAndView.addObject("s", s);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showFormCreateService() {
        ModelAndView modelAndView = new ModelAndView("service/create");
        modelAndView.addObject("services", new Service());
        return modelAndView;
    }

    @PostMapping("/create")
    public String createService(@Valid @ModelAttribute("services") Service service, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "service/create";
        }
        if (service == null) {
            return "404";
        }
        try {
            serviceService.saveService(service);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "redirect:";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showFormEditService(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("service/edit", "services", serviceService.getServiceById(id));
        return modelAndView;
    }

    @PostMapping("/edit")
    public String editCustomer(@Valid @ModelAttribute("services") Service service, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "service/edit";
        }
        if (service == null) {
            return "404";
        }
        try {
            serviceService.updateService(service);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "redirect:";
    }

    @GetMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable Long id ) {
        Service service = serviceService.getServiceById(id) ;
      if (service == null){
          return "500" ;
      }
      serviceService.deleteService(service) ;
        return "redirect:/service";
    }
}
