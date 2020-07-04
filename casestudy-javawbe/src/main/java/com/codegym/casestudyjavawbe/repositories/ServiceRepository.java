package com.codegym.casestudyjavawbe.repositories;

import com.codegym.casestudyjavawbe.models.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceRepository extends JpaRepository<Service,Long> {

    Page<Service> getAllServiceByFlashDeleteIsFalseAndServiceNameContaining(Pageable pageable, String s);

    List<Service> getAllServiceByFlashDeleteIsFalse();

    Service getServiceByIdAndFlashDeleteIsFalse(Long id);
}
