package com.example.product.repository.Impl;

import com.example.product.model.Product;
import com.example.product.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class ProductRepositoryImpl implements ProductRepository {
    private static Map<Integer, Product> listProduct;

    static {
        listProduct = new HashMap<>();
        listProduct.put(1, new Product(1, "IphoneXS", "15.000.000", "Hàng trả góp", "Apple"));
        listProduct.put(2, new Product(2, "ReiMi5", "6.000.000", "Hàng trả góp", "Huawei"));
        listProduct.put(3, new Product(3, "J7Prime", "5.000.000", "Hàng cũ", "Samsung"));
        listProduct.put(4, new Product(4, "Bphone", "15.000.000", "Hàng tồn kho", "BKAV"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(listProduct.values());
    }

    @Override
    public Product findById(int id) {
        return listProduct.get(id);
    }

    @Override
    public void delete(int id) {
        listProduct.remove(id);
    }

    @Override
    public void save(Product product) {
        listProduct.put(product.getId(), product);
    }

    @Override
    public void update(int id, Product product) {
        listProduct.put(id, product);
    }
}
