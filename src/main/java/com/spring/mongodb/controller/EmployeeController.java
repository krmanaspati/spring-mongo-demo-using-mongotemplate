package com.spring.mongodb.controller;

import com.spring.mongodb.entity.EmployeeEntity;
import com.spring.mongodb.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/v1/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value="/save", method= RequestMethod.POST, produces= MediaType.APPLICATION_JSON_VALUE)
    public void addEmployee(@RequestBody EmployeeEntity emp){
        employeeService.saveEmp(emp);
    }

    @GetMapping(value="/getemplist")
    public List<EmployeeEntity> getEmp()
    {
        return employeeService.getEmp();
    }
}
