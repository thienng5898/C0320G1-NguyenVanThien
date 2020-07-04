package com.codegym.casestudyjavawbe.services.Impl;

import com.codegym.casestudyjavawbe.models.TypeRent;
import com.codegym.casestudyjavawbe.repositories.TypeRentRepository;
import com.codegym.casestudyjavawbe.services.TypeRentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeRentServiceImpl implements TypeRentService {
    @Autowired
    private TypeRentRepository typeRentRepository;
    @Override
    public List<TypeRent> getAllTypeRent() {
        return typeRentRepository.findAll();
    }

    @Override
    public TypeRent findTypeRentById(Long id) {
        return typeRentRepository.findById(id).orElse(null);
    }
}
