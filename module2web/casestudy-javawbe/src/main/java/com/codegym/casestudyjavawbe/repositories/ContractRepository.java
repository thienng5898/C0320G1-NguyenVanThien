package com.codegym.casestudyjavawbe.repositories;

import com.codegym.casestudyjavawbe.models.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepository extends JpaRepository<Contract,Long> {
}
