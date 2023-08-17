package com.tutorial.poc.service;



import com.tutorial.poc.entity.Employee;
import com.tutorial.poc.repositary.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
   @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        String name = null;
        System.out.println(name.toLowerCase());
        return employeeRepository.save(employee);

    }

    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }
    public List<Employee> getAllEmployee(String name) {
        return employeeRepository.findAll();
    }
    public List<Employee> getAllEmployee(int val) {
        return employeeRepository.findAll();
    }

    @Override
   public String turnAlarmOff() {
        return "Turning the vehicle alarm off.";
    }
}
