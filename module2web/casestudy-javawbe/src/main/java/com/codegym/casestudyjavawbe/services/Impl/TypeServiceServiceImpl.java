package com.codegym.casestudyjavawbe.services.Impl;

import com.codegym.casestudyjavawbe.models.TypeService;
import com.codegym.casestudyjavawbe.repositories.TypeServiceRepository;
import com.codegym.casestudyjavawbe.services.TypeServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TypeServiceServiceImpl implements TypeServiceService {
    @Autowired
    private TypeServiceRepository typeServiceRepository ;
    @Override
    public List<TypeService> getAllTypeService() {
        return typeServiceRepository.findAll();
    }

    @Override
    public TypeService findTypeServiceById(Long id) {
        return typeServiceRepository.findById(id).orElse(null);
    }
}
