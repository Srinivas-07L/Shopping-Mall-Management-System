package com.projectdemo.employee.repository; 
import com.projectdemo.employee.model.Employee; 
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
   
}