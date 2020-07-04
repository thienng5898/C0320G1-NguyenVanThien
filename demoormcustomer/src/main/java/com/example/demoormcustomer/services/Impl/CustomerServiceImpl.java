package com.example.demoormcustomer.services.Impl;

import com.example.demoormcustomer.models.Customer;
import com.example.demoormcustomer.models.Province;
import com.example.demoormcustomer.repository.CustomerRepository;
import com.example.demoormcustomer.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository ;
    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void delete(Long id) {
      customerRepository.deleteById(id);
    }

    @Override
    public Iterable<Customer> findAllByProvince(Province province) {
        return customerRepository.findAllByProvince(province);
    }

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        pageable= PageRequest.of(pageable.getPageNumber(),4, Sort.by("firstName")) ;
        return customerRepository.findAll(pageable);
    }

    @Override
    public Page<Customer> getAllCustomerByName(Pageable pageable, String s) {
        pageable= PageRequest.of(pageable.getPageNumber(),5, Sort.by("firstName"));
        return customerRepository.findAllByFirstNameContaining(pageable,s);
    }

//    @Override
//    public void update(Long id, Customer customer) {
//     customerRepository.(id,customer);
//    }
}
