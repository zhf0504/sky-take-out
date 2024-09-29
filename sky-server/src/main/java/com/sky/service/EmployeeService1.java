package com.sky.service;

import com.sky.dto.EmployeeLoginDTO;
import com.sky.entity.Employee;

public interface EmployeeService1 {
    Employee login(EmployeeLoginDTO employeeLoginDTO);
}
