package com.codegym.casestudyjavawbe.repositories;

import com.codegym.casestudyjavawbe.models.DetailContract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailContractRepository extends JpaRepository<DetailContract,Long> {
}
