package com.tutorial.poc.controller;


import com.tutorial.poc.config.Helper;
import com.tutorial.poc.entity.Employee;
import com.tutorial.poc.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductRestController {

    @Autowired
    private EmpService service;

    @Autowired
    private Helper helper;

    @GetMapping("/findAll")
    ResponseEntity<List<Employee>> findAllEmployees() {
        Employee employee = Employee.builder().empId(100).name("Akshya").salary(12000).build();

        return ResponseEntity.ok(Arrays.asList(employee));
    }


    @GetMapping("/test")
    String testApi() {
        return helper.getMessage();
    }

    @PostMapping("/save-emp")
    ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
        Employee emp = service.saveEmployee(employee);
        return ResponseEntity.status(HttpStatus.OK).body(emp);
    }
}
