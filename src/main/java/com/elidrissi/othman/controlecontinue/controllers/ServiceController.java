package com.elidrissi.othman.controlecontinue.controllers;


import com.elidrissi.othman.controlecontinue.entities.Employee;
import com.elidrissi.othman.controlecontinue.entities.Service;
import com.elidrissi.othman.controlecontinue.services.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/services")
public class ServiceController {


    @Autowired

    private ServiceService service;


    @PostMapping("/create")
    public Service create(@RequestBody Service service){
        return this.service.create(service);
    }
    @GetMapping("/all")
    public List<Service> getAll(){
        return this.service.getAll();
    }

    @DeleteMapping("/delete")
    public Service deleteService(@RequestBody Service service){
        return this.service.delete(service);
    }

    @PutMapping("/update")
    public Service update(@RequestBody Service service){
        return this.service.update(service);
    }

    @GetMapping("/employees/{serviceId}")
    public List<Employee> getEmployeeParService(@PathVariable int serviceId){
        return this.service.getEmployeeParService(serviceId);
    }
}
