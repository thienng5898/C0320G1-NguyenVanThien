package com.codegym.casestudyjavawbe.services;

import com.codegym.casestudyjavawbe.models.TypeService;

import java.util.List;

public interface TypeServiceService {
    List<TypeService> getAllTypeService() ;
    TypeService findTypeServiceById(Long id) ;
}
