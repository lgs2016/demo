package com.ef.springboot.service;

import com.ef.springboot.model.Student;
import org.springframework.transaction.annotation.Transactional;

public interface StudentService {
    /**
     * 更新学生信息
     * @param student
     * @return
     */
    int modifyStudentById(Student student);

    /**
     * 根据学生标识获取学生详情
     * @param id
     * @return
     */



    Student queryStudentById(Integer id);
//
//    @Transactional
//        //添加此注解说明该愿意付出添加的事务管理
//    int update(Student student);
}