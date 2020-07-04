package com.valid.spirngvalidate.controllers;

import com.valid.spirngvalidate.models.PhoneNumber;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class PhoneController {
    @GetMapping("/phone")
    public ModelAndView showPhone() {
        ModelAndView modelAndView = new ModelAndView("phoneValid");
        modelAndView.addObject("number", new PhoneNumber());
        return modelAndView;
    }

    @PostMapping("/phone")
    public ModelAndView checkValidatePhone(@Valid @ModelAttribute("number") PhoneNumber phoneNumber, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            ModelAndView modelAndView = new ModelAndView("phoneValid");
            return modelAndView;
        }
        ModelAndView modelAndView = new ModelAndView("phoneSuccess");
        return modelAndView;
    }
}
