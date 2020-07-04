package com.codegym.casestudyjavawbe.services.Impl;

import com.codegym.casestudyjavawbe.models.DetailContract;
import com.codegym.casestudyjavawbe.repositories.DetailContractRepository;
import com.codegym.casestudyjavawbe.services.DetailContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailContractServiceImpl implements DetailContractService {
    @Autowired
    private DetailContractRepository detailContractRepository ;

    @Override
    public List<DetailContract> getAllDetailContract() {
        return detailContractRepository.findAll();
    }

    @Override
    public DetailContract findDetailContractById(Long id) {
        return detailContractRepository.findById(id).orElse(null);
    }

    @Override
    public void save(DetailContract detailContract) {
        detailContractRepository.save(detailContract) ;
    }
}
