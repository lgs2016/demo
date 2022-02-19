package com.springboot.web;

import com.springboot.config.ConfigInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;





@Controller
public class SpringBootController {
//    @Value("${school.name}")
//    private String schoolName;
//
//    @Value("${websit}")
//    private String websit;
    @Autowired
    private ConfigInfo configInfo;

    @RequestMapping(value = "/springBoot/config")
    public @ResponseBody String say(){
        return configInfo.getName()+"===="+configInfo;
    }



}
