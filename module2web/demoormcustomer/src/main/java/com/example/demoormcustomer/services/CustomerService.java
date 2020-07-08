package com.example.demoormcustomer.services;

import com.example.demoormcustomer.models.Customer;
import com.example.demoormcustomer.models.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface CustomerService {
    Iterable<Customer> findAll() ;
    Customer findById(Long id) ;
    void save(Customer customer) ;
    void delete(Long id) ;
    Iterable<Customer> findAllByProvince(Province province);
    Page<Customer> findAll(Pageable pageable);
    Page<Customer> getAllCustomerByName(Pageable pageable, String s);
}
