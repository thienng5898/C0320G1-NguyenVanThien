package com.codegym.casestudyjavawbe.controllers;

import com.codegym.casestudyjavawbe.models.*;
import com.codegym.casestudyjavawbe.services.ContractService;
import com.codegym.casestudyjavawbe.services.CustomerService;
import com.codegym.casestudyjavawbe.services.DetailContractService;
import com.codegym.casestudyjavawbe.services.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class ContractAndDetailContractController {
    @Autowired
    private ContractService contractService ;

    @Autowired
    private DetailContractService detailContractService;

    @Autowired
    private ServiceService serviceService;

    @Autowired
    private CustomerService customerService;

    @ModelAttribute("listCustomer")
    public List<Customer> getListCustomer() {
        return customerService.getCustomerByFlashDeleteIsFalse();
    }

    @ModelAttribute("listService")
    public List<Service> getListService() {
        return serviceService.getAllServiceByFlashDeleteIsFalse();
    }

    @GetMapping("/detailcontract/create")
    public ModelAndView showFormCreateDetailContract() {
        ModelAndView modelAndView = new ModelAndView("detailcontract/create");
        modelAndView.addObject("detailcontracts", new DetailContract());
        return modelAndView;
    }

    @PostMapping("/detailcontract/create")
    public String createDetailContract(@Valid @ModelAttribute("detailcontracts") DetailContract detailContract, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "detailcontract/create";
        }
        if (detailContract == null) {
            return "404";
        }
        try {
            detailContractService.save(detailContract);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "redirect:/detailcontract/create";
    }

    @GetMapping("/contract/create")
    public ModelAndView showFormCreateContract() {
        ModelAndView modelAndView = new ModelAndView("contract/create");
        modelAndView.addObject("contracts", new Contract());
        return modelAndView;
    }
    @PostMapping("/contract/create")
    public String createContract(@Valid @ModelAttribute("contracts") Contract contract, BindingResult bindingResult) {
        contract.validate(contract,bindingResult);
        if (bindingResult.hasErrors()) {
            return "contract/create";
        }
        if (contract == null) {
            return "404";
        }
        try {
            contractService.save(contract);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "redirect:/contract/create";
    }


}
