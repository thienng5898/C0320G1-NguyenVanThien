package com.codegym.casestudyjavawbe.repositories;

import com.codegym.casestudyjavawbe.models.TypeService;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeServiceRepository extends JpaRepository<TypeService,Long> {
}
