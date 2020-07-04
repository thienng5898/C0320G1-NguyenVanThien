package com.codegym.blog.controllers;

import com.codegym.blog.models.Category;
import com.codegym.blog.models.Post;
import com.codegym.blog.services.CategoryService;
import com.codegym.blog.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("post")
public class PostController {
    @Autowired
    private PostService postService;
    @Autowired
    private CategoryService categoryService;

    @ModelAttribute("categories")
    public List<Category> getCategory() {
        return categoryService.getAllCategory();
    }

    @GetMapping("")
    public ModelAndView showListPost(Pageable pageable, @RequestParam(value = "s", required = false, defaultValue = "") String s) {
        if (s == null) {
            s = "";
        }
        Page<Post> postPage = postService.getAllPostByTitle(pageable, s);
            ModelAndView modelAndView = new ModelAndView("/post/list", "posts", postPage);
            modelAndView.addObject("s", s);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showFormCreatePost() {
        ModelAndView modelAndView = new ModelAndView("post/create", "posts", new Post());
        return modelAndView;
    }

    @PostMapping("/create")
    public String createBlog(@Valid @ModelAttribute("posts") Post post, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "post/create";
        }
        if (post == null) {
            return "404";
        }
        try {
            postService.savePost(post);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "redirect:" ;
    }
    @GetMapping("/edit/{id}")
    public ModelAndView showFormEditPost(@PathVariable Long id){
        ModelAndView modelAndView = new ModelAndView("post/edit", "posts", postService.getPostById(id));
        return modelAndView ;
    }
    @PostMapping("/edit")
    public String editPost(@Valid @ModelAttribute("posts") Post post, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "post/edit";
        }
        if (post == null) {
            return "404";
        }
        try {
            postService.updatePost(post);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "redirect:";
    }

    @GetMapping("/show/{id}")
    public ModelAndView showBlog(@PathVariable Long id){
        ModelAndView modelAndView = new ModelAndView("post/view", "posts", postService.getPostById(id));
        return modelAndView ;
        }

    @GetMapping("/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id){
       return new ModelAndView("post/delete","posts",postService.getPostById(id)) ;
    }

    @PostMapping("/delete")
    public String deletePost(@ModelAttribute("posts") Post post, RedirectAttributes redirectAttributes){
        try{
           postService.deletePost(post);
        } catch (Exception e) {
            return  "500" ;
        }
        redirectAttributes.addFlashAttribute("message","Delete SuccessFully");
        return "redirect:" ;
    }



}
