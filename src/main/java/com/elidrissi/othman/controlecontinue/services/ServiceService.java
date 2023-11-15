package com.elidrissi.othman.controlecontinue.services;
import com.elidrissi.othman.controlecontinue.entities.Employee;
import com.elidrissi.othman.controlecontinue.entities.Service;
import com.elidrissi.othman.controlecontinue.repositories.ServiceRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;


@org.springframework.stereotype.Service
public class ServiceService {

    @Autowired
    private ServiceRepo serviceRepo;

    public Service create(Service service){
        service.setId(0L);
        return serviceRepo.save(service);
    }

    public List<Service> getAll(){
        return serviceRepo.findAll();
    }
    public Service delete(Service service){
        Optional<Service> optional=serviceRepo.findById(service.getId());
        if(optional.isPresent()){
            serviceRepo.delete(service);
            return service;
        }else{
            return null;
        }
    }
    public Service update(Service service){
        return serviceRepo.save(service);
    }

    public List<Employee> getEmployeeParService(int servivceId){
        return serviceRepo.getEmployeeParService(servivceId);
    }
}
