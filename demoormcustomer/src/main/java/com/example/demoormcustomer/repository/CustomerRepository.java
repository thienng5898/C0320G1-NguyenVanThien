package com.example.demoormcustomer.repository;


import com.example.demoormcustomer.models.Customer;
import com.example.demoormcustomer.models.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer,Long> {
    Iterable<Customer> findAllByProvince(Province province) ;
    Page<Customer> findAllByFirstNameContaining(Pageable pageable,String s);

}
