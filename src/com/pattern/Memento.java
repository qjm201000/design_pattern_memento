package com.pattern;

/**
 * 备份类
 */
public class Memento {
    private String name;//姓名
    private int age;//年龄

    public Memento(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
