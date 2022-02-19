package com.ef.springboot.service;

//public interface StudentService {
//}

import com.ef.springboot.model.Student;

public interface StudentService {
    /**
     * 根据学生标识获取学生详情
     * @param id
     * @return
     */
    Student queryStudentById(Integer id); }