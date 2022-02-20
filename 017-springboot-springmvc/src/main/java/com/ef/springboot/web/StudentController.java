package com.ef.springboot.web;


import ch.qos.logback.core.boolex.EvaluationException;
import com.ef.springboot.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController  //相当于控制层都是类上加@Controller+方法上加@ResposeBody
//意味着当前控制层中所有方法返还这的都是JSON对象

public class StudentController {

    @RequestMapping(value = "/student")
    public Object student(){
//        @ResponseBody
        Student student = new Student();
        student.setId(1001);
        student.setName("zhangsan");
        return student;

    }
    //该方法请求方式支持:GET和POST
    @RequestMapping(value = "/studentDetial")
    public Object queryStudentById(Integer id){
        Student student = new Student();
        student.setId(id);
        return student;
    }

//    @RequestMapping(value = "/queryStudentById2",method = RequestMethod.GET)
    @GetMapping(value = "/queryStudentById2") //相当于上一句话，只接收get请求，如果请求方式不对，报405
    //该注解通过在查询 数据的时候使用-----》查询
    public Object queryStudentById2(){
        return "Only GET Method";
    }

//    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @PostMapping(value = "/insert") //相当于上一名话
    //该注解通过在新增数据的时候使用----》新增
    public Object insert(){
        return "Insert success";
    }
//    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    @DeleteMapping(value = "/delete")   //相当于上一句话
    //该没理解通常在删除数据的时候使用---》删除
    public Object delete(){
        return "Delete Student";
    }

//    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    @PutMapping(value = "/update")  //相当于上一句话
    //该注解通常在修改数据的时候使用----》更新
    public Object update(){
        return "update student info";
    }

}
