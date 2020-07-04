package com.exam.javwbe.services.Impl;

import com.exam.javwbe.entity.Customer;
import com.exam.javwbe.repositories.CustomerRepository;
import com.exam.javwbe.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Page<Customer> getAllCustomerByFlashDeleteIsFalseAndNameContainingAndCodeCustomerContaining(Pageable pageable, String name, String code) {
        return customerRepository.getAllCustomerByFlashDeleteIsFalseAndNameCustomerContainingAndCodeCustomerContaining(pageable,name,code);
    }

    @Override
    public void saveCustomer(Customer customer) {
        customer.setFlashDelete(false);
        customerRepository.save(customer) ;
    }

    @Override
    public Customer getCustomerById(Long id) {
        return customerRepository.getCustomerByFlashDeleteIsFalseAndId(id);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customer.setFlashDelete(false);
        customerRepository.save(customer) ;
    }

    @Override
    public void delete(Customer customer) {
        customer.setFlashDelete(true);
        customerRepository.save(customer) ;
    }
}
