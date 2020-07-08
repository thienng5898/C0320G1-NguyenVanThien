package com.exam.javwbe.services;

import com.exam.javwbe.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    Page<Customer> getAllCustomerByFlashDeleteIsFalseAndNameContainingAndCodeCustomerContaining(Pageable pageable, String name, String code);

    void saveCustomer(Customer customer);

    Customer getCustomerById(Long id);

    void updateCustomer(Customer customer);

    void delete(Customer customer);
}
