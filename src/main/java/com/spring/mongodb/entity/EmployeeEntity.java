package com.spring.mongodb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class EmployeeEntity {

    private String name;
    private String mobileNumber;
    private String dept;
    private Address add;

}