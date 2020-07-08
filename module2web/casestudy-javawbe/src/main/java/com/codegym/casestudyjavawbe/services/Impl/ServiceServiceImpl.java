package com.codegym.casestudyjavawbe.services.Impl;

import com.codegym.casestudyjavawbe.repositories.ServiceRepository;
import com.codegym.casestudyjavawbe.services.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceServiceImpl implements ServiceService {
    @Autowired
    private  ServiceRepository serviceRepository ;
    @Override
    public Page<com.codegym.casestudyjavawbe.models.Service>getAllServiceByFlashDeleteIsFalseAndServiceNameContaining(Pageable pageable, String s) {
    pageable = PageRequest.of(pageable.getPageNumber(), 2, Sort.by("serviceName"));
        return serviceRepository.getAllServiceByFlashDeleteIsFalseAndServiceNameContaining(pageable, s);
}

    @Override
    public List<com.codegym.casestudyjavawbe.models.Service> getAllServiceByFlashDeleteIsFalse() {
        return serviceRepository.getAllServiceByFlashDeleteIsFalse();
    }


    @Override
    public void saveService(com.codegym.casestudyjavawbe.models.Service service) {
        service.setFlashDelete(false);
        serviceRepository.save(service) ;
    }

    @Override
    public com.codegym.casestudyjavawbe.models.Service getServiceById(Long id) {
        return serviceRepository.getServiceByIdAndFlashDeleteIsFalse(id);
    }

    @Override
    public void updateService(com.codegym.casestudyjavawbe.models.Service service) {
        service.setFlashDelete(false);
        serviceRepository.save(service) ;
    }

    @Override
    public void deleteService(com.codegym.casestudyjavawbe.models.Service service) {
        service.setFlashDelete(true);
        serviceRepository.save(service);
    }


}
