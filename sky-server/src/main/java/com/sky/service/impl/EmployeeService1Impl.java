package com.sky.service.impl;

import com.sky.dto.EmployeeLoginDTO;
import com.sky.entity.Employee;
import com.sky.mapper.Employee1Mapper;
import com.sky.service.EmployeeService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService1Impl implements EmployeeService1 {
    @Autowired
    private Employee1Mapper employee1Mapper;
    @Override
    public Employee login(EmployeeLoginDTO employeeLoginDTO) {
        String username = employeeLoginDTO.getUsername();
        String password = employeeLoginDTO.getPassword();
        Employee employee = employee1Mapper.getByUserName(username);
        return employee;
    }
}
