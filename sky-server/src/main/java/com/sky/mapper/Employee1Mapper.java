package com.sky.mapper;

import com.sky.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface Employee1Mapper {
    @Select({})
    Employee getByUserName(String userName);
}
