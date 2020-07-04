package com.codegym.casestudyjavawbe.services;

import com.codegym.casestudyjavawbe.models.TypeCustomer;

import java.util.List;

public interface TypeCustomerService   {
    List<TypeCustomer> getAllTypeCustomer() ;
    TypeCustomer findTypeCustomerById(Long id) ;
}
