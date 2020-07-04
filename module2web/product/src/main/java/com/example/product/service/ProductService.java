package com.example.product.service;

import com.example.product.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    void save(Product p0roduct);

    Product findById(int id);

    void update(int id, Product product);

    void remove(int id);
}
