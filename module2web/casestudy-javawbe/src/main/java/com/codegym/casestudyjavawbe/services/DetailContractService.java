package com.codegym.casestudyjavawbe.services;

import com.codegym.casestudyjavawbe.models.DetailContract;


import java.util.List;

public interface DetailContractService {
    List<DetailContract> getAllDetailContract() ;

    DetailContract findDetailContractById(Long id) ;

    void save(DetailContract detailContract);
}
