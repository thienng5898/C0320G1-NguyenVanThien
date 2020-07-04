package com.codegym.blog.services.Impl;

import com.codegym.blog.models.Category;
import com.codegym.blog.repositories.CategoryRepository;
import com.codegym.blog.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository ;

    @Override
    public List<Category> getAllCategory() {
            return categoryRepository.findAllByIsDeleteIsFalse() ;
    }

    @Override
    public void saveCategory(Category category) {
        category.setDelete(false);
        categoryRepository.save(category);
    }

    @Override
    public Category getAllCategoryById(Long id) {
        return categoryRepository.findAllByIdAndIsDeleteIsFalse(id);
    }

    @Override
    public Category updateCategory(Category category) {
        category.setDelete(false);
        return categoryRepository.save(category);
    }

    @Override
    public void deleteCategory(Category category) {
        category.setDelete(true);
        categoryRepository.save(category) ;
    }


}
