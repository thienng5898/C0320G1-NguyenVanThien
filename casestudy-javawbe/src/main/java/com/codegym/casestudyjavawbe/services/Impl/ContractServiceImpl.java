package com.codegym.casestudyjavawbe.services.Impl;

import com.codegym.casestudyjavawbe.models.Contract;
import com.codegym.casestudyjavawbe.repositories.ContractRepository;
import com.codegym.casestudyjavawbe.services.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContractServiceImpl implements ContractService {
    @Autowired
    private ContractRepository contractRepository ;

    @Override
    public void save(Contract contract) {
        contract.setFlashDelete(false);
        contractRepository.save(contract) ;
    }
}
