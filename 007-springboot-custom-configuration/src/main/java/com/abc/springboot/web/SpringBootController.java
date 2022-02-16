package com.abc.springboot.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringBootController {
    @Value("${school.name}")
    private String schoolName;

    @Value("${websit}")
    private String websit;

    @RequestMapping(value = "/springBoot/say")
    public @ResponseBody String say(){
        return schoolName+"----"+websit;
    }

}
