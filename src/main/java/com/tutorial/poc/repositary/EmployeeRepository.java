package com.tutorial.poc.repositary;


import com.tutorial.poc.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
