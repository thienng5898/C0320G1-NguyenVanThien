package com.example.product.repository;

import java.util.List;

public interface Repository<T> {
    List<T> findAll() ;
    T findById(int id);
    void delete (int id) ;
    void save (T t) ;
    void update(int id,T t);
}
