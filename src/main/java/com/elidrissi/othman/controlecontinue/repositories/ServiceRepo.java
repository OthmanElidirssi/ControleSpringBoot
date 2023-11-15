package com.elidrissi.othman.controlecontinue.repositories;

import com.elidrissi.othman.controlecontinue.entities.Employee;
import com.elidrissi.othman.controlecontinue.entities.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ServiceRepo extends JpaRepository<Service,Long> {


    @Query("SELECT e FROM Employee e where e.service.id=:serviceId")
    List<Employee> getEmployeeParService(int serviceId);


}

