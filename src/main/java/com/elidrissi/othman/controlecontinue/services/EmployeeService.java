package com.elidrissi.othman.controlecontinue.services;


import com.elidrissi.othman.controlecontinue.entities.Employee;
import com.elidrissi.othman.controlecontinue.repositories.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {


    @Autowired
    private EmployeeRepo employeeRepo;


    public Employee create(Employee employee){
        employee.setId(0L);
        return employeeRepo.save(employee);
    }

    public List<Employee> getAllEmployees(){
        return employeeRepo.findAll();
    }

    public Employee deleteEmployee(Employee employee){
        Optional<Employee> optional=employeeRepo.findById(employee.getId());
        if(optional.isPresent()){
            employeeRepo.delete(employee);
            return employee;
        }else{
            return null;
        }
    }
    public Employee updateEmployee(Employee employee){
        employeeRepo.save(employee);
        return employeeRepo.save(employee);
    }


}
