package com.ef.springboot.service.impl;

import com.ef.springboot.mapper.StudentMapper;
import com.ef.springboot.model.Student;
import com.ef.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//public class StudentServiceImpl {
//}
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Student queryStudentById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    } }