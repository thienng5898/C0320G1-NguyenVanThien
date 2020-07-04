package com.codegym.blog.controllers;

import com.codegym.blog.models.Category;
import com.codegym.blog.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("")
    public ModelAndView showListCategory() {
        List<Category> categories = categoryService.getAllCategory();
        return new ModelAndView("category/list", "categories", categories);
    }

    @GetMapping("/create")
    public ModelAndView showFormCreateCategory() {
        ModelAndView modelAndView = new ModelAndView("category/create", "categories", new Category());
        return modelAndView;
    }

    @PostMapping("/create")
    public String createCategory(@Valid @ModelAttribute("categories") Category category, BindingResult bindingResult) {
        if (category == null) {
            return "404";
        }
        if (bindingResult.hasFieldErrors()) {
            return "category/create";
        }
        try {
            categoryService.saveCategory(category);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "redirect:";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEditCategory(@PathVariable Long id) {
        return new ModelAndView("category/edit", "categories", categoryService.getAllCategoryById(id));
    }

    @PostMapping("/edit")
    public ModelAndView EditCategory(@ModelAttribute("categories") Category category) {
        ModelAndView modelAndView = new ModelAndView("redirect:", "categories", categoryService.updateCategory(category));
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView showDeleteCategory(@PathVariable Long id){
        return new ModelAndView("category/delete","categories",categoryService.getAllCategoryById(id));
    }

    @PostMapping("/delete")
    public String deleteCategory(@ModelAttribute("categories")Category category, RedirectAttributes redirectAttributes){
        try{
        categoryService.deleteCategory(category);
    } catch (Exception e) {
            return  "500" ;
        }
        redirectAttributes.addFlashAttribute("message","Delete SuccessFully");
        return "redirect:" ;
    }

}
