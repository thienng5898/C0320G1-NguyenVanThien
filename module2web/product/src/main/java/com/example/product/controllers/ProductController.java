package com.example.product.controllers;


import com.example.product.model.Product;
import com.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/")
    public ModelAndView getHomeProduct() {
        return new ModelAndView("index", "products", productService.findAll());
    }

    @GetMapping("/product/create")
    public String add(Model model) {
        model.addAttribute("product", new Product());
        return "create";
    }

    @PostMapping("/product/create")
    public String save(Product product, RedirectAttributes redirectAttributes) {
        product.setId((int) (Math.random() * 1000));
        productService.save(product);
        redirectAttributes.addFlashAttribute("success", "saved Success!");
        return "redirect:/";
    }

    @GetMapping("/product/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "edit";
    }

    @PostMapping("product/update")
    public String update(Product product, RedirectAttributes redirectAttributes) {
        productService.update(product.getId(), product);
        redirectAttributes.addFlashAttribute("success", "update Success!");
        return "redirect:/";
    }
    @GetMapping("product/{id}/delete")
    public String delete(@PathVariable int id ,Model model) {
        model.addAttribute("product",productService.findById(id));
        return "delete";
    }
    @PostMapping("product/delete")
    public String delete(Product product,RedirectAttributes redirectAttributes){
        productService.remove(product.getId());
        redirectAttributes.addFlashAttribute("success","Delete success") ;
        return "redirect:/" ;
    }
    @GetMapping("product/{id}/view")
    public String show(@PathVariable int id , Model model) {
        model.addAttribute("product",productService.findById(id));
        return "view" ;
    }

}
