package com.spring.mongodb.repository;

import com.spring.mongodb.entity.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepository {

    @Autowired
    MongoTemplate mongoTemplate;

    EmployeeRepository(MongoTemplate mongoTemplate){
        this.mongoTemplate= mongoTemplate;
    }
    public void saveEmployee(EmployeeEntity emp){
        mongoTemplate.save(emp);
    }

    public List<EmployeeEntity> getEmp()
    {
        EmployeeEntity nemp= null;
        return mongoTemplate.findAll(EmployeeEntity.class);

    }
}
