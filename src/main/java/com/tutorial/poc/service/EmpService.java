package com.tutorial.poc.service;


import com.tutorial.poc.entity.Employee;

import java.util.List;

public interface EmpService {
    Employee saveEmployee(Employee employee);


    List<Employee> getAllEmployee();

    List<Employee> getAllEmployee(String s);

    List<Employee> getAllEmployee(int n);

    default String turnAlarmOn() {
        return "Turning the vehicle alarm on.";
    }

    default String turnAlarmOff() {
        return "Turning the vehicle alarm off.";
    }
}
