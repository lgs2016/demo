package com.ef.springboot.service.impl;

import com.ef.springboot.mapper.StudentMapper;
import com.ef.springboot.service.StudentService;


import com.ef.springboot.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//public class StudentServiceImpl {
//}
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    @Transactional //添加此注解说明该愿意付出添加的事务管理
    public int modifyStudentById(Student student){
        int modifyCount=studentMapper.updateByPrimaryKeySelective(student);

        System.out.println("更新结果："+modifyCount);

        int a=10/0;
        return modifyCount;
    }


    @Override
    public Student queryStudentById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }

//    @Override
//    public int modifyStudentById(Student student) {
//        return 0;
//    }




}
