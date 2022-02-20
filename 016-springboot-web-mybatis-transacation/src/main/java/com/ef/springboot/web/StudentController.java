package com.ef.springboot.web;
import com.ef.springboot.service.StudentService;
import com.ef.springboot.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/student")
    public @ResponseBody Object student(Integer id) {
        Student student = studentService.queryStudentById(id);
        return student;
    }
    @RequestMapping(value = "/springboot/modify")
    public @ResponseBody Object modifyStudent() {
        int count = 0;
        try {
            Student student = new Student();
            student.setId(1);
            student.setStuName("Jack");
            student.setStuAge(10);
            count = studentService.modifyStudentById(student);
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
        return count; }
}
