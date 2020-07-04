package com.exam.javwbe.repositories;

import com.exam.javwbe.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Page<Customer> getAllCustomerByFlashDeleteIsFalseAndNameCustomerContainingAndCodeCustomerContaining(Pageable pageable, String name, String code);

    Customer getCustomerByFlashDeleteIsFalseAndId(Long id);
}
