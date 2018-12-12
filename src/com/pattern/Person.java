package com.pattern;

/**
 * 原生类
 */
public class Person {
    private String name;//姓名
    private int age;//年龄

    public Person(String name,int age){
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

    //创建一个备份
    public Memento createMemento(){
        return new Memento(name,age);
    }

    //回滚备份
    public void callback(Memento memento){
        this.name = memento.getName();
        this.age = memento.getAge();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
