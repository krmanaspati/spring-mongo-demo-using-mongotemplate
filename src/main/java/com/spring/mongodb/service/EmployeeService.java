package com.spring.mongodb.service;

import com.spring.mongodb.entity.EmployeeEntity;
import com.spring.mongodb.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public void saveEmp(EmployeeEntity emp){
        employeeRepository.saveEmployee(emp);
    }

    public List<EmployeeEntity> getEmp()
    {
        return employeeRepository.getEmp();

    }

}
