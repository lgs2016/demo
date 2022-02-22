package com.ef.springboot.model;

public class Student {
    private Integer id;

    private String Name;

    private Integer Age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String stuName) {
        this.Name = Name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer stuAge) {
        this.Age = Age;
    }
}