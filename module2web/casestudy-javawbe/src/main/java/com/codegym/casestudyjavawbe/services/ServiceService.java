package com.codegym.casestudyjavawbe.services;

import com.codegym.casestudyjavawbe.models.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ServiceService {
    Page<Service> getAllServiceByFlashDeleteIsFalseAndServiceNameContaining(Pageable pageable, String s);

    List<Service> getAllServiceByFlashDeleteIsFalse();

    void saveService(Service service) ;

    Service getServiceById(Long id);

    void updateService(Service service);

    void deleteService(Service service);
}
