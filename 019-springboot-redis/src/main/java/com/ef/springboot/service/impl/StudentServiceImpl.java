package com.ef.springboot.service.impl;

import com.ef.springboot.service.StudentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

public class StudentServiceImpl implements StudentService {

    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

    @Override
    public void put(String key, String value) {

        redisTemplate.opsForValue().set(key,value);

    }
}
