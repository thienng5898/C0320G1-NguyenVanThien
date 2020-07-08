package com.codegym.casestudyjavawbe.repositories;

import com.codegym.casestudyjavawbe.models.TypeCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeCustomerRepository extends JpaRepository<TypeCustomer,Long> {
}
