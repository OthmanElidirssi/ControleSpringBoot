package com.elidrissi.othman.controlecontinue.repositories;

import com.elidrissi.othman.controlecontinue.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {
}
