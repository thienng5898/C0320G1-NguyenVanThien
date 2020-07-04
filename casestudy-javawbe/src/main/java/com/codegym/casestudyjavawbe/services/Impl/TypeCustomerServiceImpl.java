package com.codegym.casestudyjavawbe.services.Impl;

import com.codegym.casestudyjavawbe.models.TypeCustomer;
import com.codegym.casestudyjavawbe.repositories.TypeCustomerRepository;
import com.codegym.casestudyjavawbe.services.TypeCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TypeCustomerServiceImpl implements TypeCustomerService {
    @Autowired
    private TypeCustomerRepository typeCustomerRepository ;

    @Override
    public List<TypeCustomer> getAllTypeCustomer() {
        return typeCustomerRepository.findAll();
    }

    @Override
    public TypeCustomer findTypeCustomerById(Long id) {
        return typeCustomerRepository.findById(id).orElse(null);
    }
}
