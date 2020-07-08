package com.example.restcustomer.repositories;

import com.example.restcustomer.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer, Long> {
}
