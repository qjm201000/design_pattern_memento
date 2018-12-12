package com.pattern;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("张三",15);
        System.out.println(person.toString());
        CareTaker careTaker = new CareTaker(person.createMemento());//person创建一个备份，交给careTaker来管理

        person.setAge(16);//修改age
        System.out.println(person.toString());
        //回滚
        person.callback(careTaker.getMemento());
        System.out.println(person.toString());
    }
}
