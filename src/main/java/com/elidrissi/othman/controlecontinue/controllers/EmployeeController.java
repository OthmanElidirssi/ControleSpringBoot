package com.elidrissi.othman.controlecontinue.controllers;


import com.elidrissi.othman.controlecontinue.entities.Employee;
import com.elidrissi.othman.controlecontinue.repositories.EmployeeRepo;
import com.elidrissi.othman.controlecontinue.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employees")
public class EmployeeController {



    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/create")
    public Employee create(@RequestBody Employee employee){
        return  employeeService.create(employee);
    }

    @GetMapping("/all")
    public List<Employee> getAll(){
        return employeeService.getAllEmployees();
    }
    @DeleteMapping("/delete")
    public Employee delete(@RequestBody Employee employee){
        return employeeService.deleteEmployee(employee);
    }

    @PutMapping("/update")
    public Employee update(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }
}
