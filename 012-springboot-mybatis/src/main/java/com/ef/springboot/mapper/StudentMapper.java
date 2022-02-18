package com.ef.springboot.mapper;

import com.ef.springboot.model.Student;

public interface StudentMapper {
    int insert(Student record);

    int insertSelective(Student record);
}