package com.ef.springboot.service;

public interface StudentService {
    /*将值存放在redis接口中*/

    void put(String key, String value);

    String get(String key);
}
