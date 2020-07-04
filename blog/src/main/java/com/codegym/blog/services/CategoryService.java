package com.codegym.blog.services;

import com.codegym.blog.models.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategory();

    void saveCategory(Category category);

    Category getAllCategoryById(Long id);

    Category updateCategory(Category category);

    void deleteCategory(Category category);
}
