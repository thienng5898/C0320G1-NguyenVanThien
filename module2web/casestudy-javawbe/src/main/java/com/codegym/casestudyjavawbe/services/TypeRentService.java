package com.codegym.casestudyjavawbe.services;

import com.codegym.casestudyjavawbe.models.TypeRent;


import java.util.List;

public interface TypeRentService {
    List<TypeRent> getAllTypeRent() ;
    TypeRent findTypeRentById(Long id) ;
}
