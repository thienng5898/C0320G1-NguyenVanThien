package com.codegym.casestudyjavawbe.services.Impl;

import com.codegym.casestudyjavawbe.models.Customer;
import com.codegym.casestudyjavawbe.repositories.CustomerRepository;
import com.codegym.casestudyjavawbe.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Page<Customer> getAllCustomerByFlashDeleteIsFalseAndNameContaining(Pageable pageable, String s) {
        pageable = PageRequest.of(pageable.getPageNumber(), 2, Sort.by("name"));
        return customerRepository.getAllCustomerByFlashDeleteIsFalseAndNameContaining(pageable, s);
    }

    @Override
    public void saveCustomer(Customer customer) {
        customer.setFlashDelete(false);
        customerRepository.save(customer);
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
    public void deleteCustomer(Customer customer) {
        customer.setFlashDelete(true);
        customerRepository.save(customer) ;
    }


    @Override
    public Page<Customer> getAllCustomerByFlashDeleteIsFalseAndNameContainingAndCodeCustomerContainingAndAddressContaining(Pageable pageable, String name, String code, String address) {
        return customerRepository.getAllCustomerByFlashDeleteIsFalseAndNameContainingAndCodeCustomerContainingAndAddressContaining(pageable,name,code,address);
    }

    @Override
    public List<Customer> getCustomerByFlashDeleteIsFalse() {
        return customerRepository.getAllCustomerByFlashDeleteIsFalse();
    }


}
