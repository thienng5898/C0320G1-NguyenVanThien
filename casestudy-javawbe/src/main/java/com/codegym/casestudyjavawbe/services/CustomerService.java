package com.codegym.casestudyjavawbe.services;

import com.codegym.casestudyjavawbe.models.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CustomerService {
    Page<Customer> getAllCustomerByFlashDeleteIsFalseAndNameContaining(Pageable pageable,String s);

    void saveCustomer(Customer customer);

    Customer getCustomerById(Long id);

    void updateCustomer(Customer customer);

    void deleteCustomer(Customer customer);


    Page<Customer> getAllCustomerByFlashDeleteIsFalseAndNameContainingAndCodeCustomerContainingAndAddressContaining(Pageable pageable,String name,String code,String address);

    List<Customer> getCustomerByFlashDeleteIsFalse();
}
