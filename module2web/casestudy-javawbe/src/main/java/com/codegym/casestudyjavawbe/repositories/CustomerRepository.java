package com.codegym.casestudyjavawbe.repositories;

import com.codegym.casestudyjavawbe.models.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    List<Customer> getAllCustomerByFlashDeleteIsFalse(Pageable pageable) ;

    Page<Customer> getAllCustomerByFlashDeleteIsFalseAndNameContaining(Pageable pageable,String s);

    Customer getCustomerByFlashDeleteIsFalseAndId(Long id);

    Page<Customer> getAllCustomerByFlashDeleteIsFalseAndNameContainingAndCodeCustomerContainingAndAddressContaining(Pageable pageable,String name,String code,String address);

    List<Customer> getAllCustomerByFlashDeleteIsFalse();
}
