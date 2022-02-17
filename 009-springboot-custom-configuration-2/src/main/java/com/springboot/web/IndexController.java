package com.springboot.web;


import com.springboot.config.Abc;
import com.springboot.config.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.Action;

@Controller

public class IndexController {

    @Autowired
    private School school;

    @Autowired
    private Abc abc;

    @RequestMapping(value = "/say")
    public @ResponseBody String say(){

        return "school.name="+school.getName()+"-----school.websit"+school.getWebsit()
                +"abc.name="+abc.getName()+"---=============---abc.websit"+abc.getWebsit();
    }
}
