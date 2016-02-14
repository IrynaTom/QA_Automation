package com.task;

/**
 * Created by Ира on 13.02.2016.
 */
public class Human {
    private String name;
    private int age;

    public Human(String name, int age){
        this.name = name;
        this.age=age;
    }
    public void printArray(){
        System.out.println("Name" + " " + this.name + " " + "Age" + " " + this.age);
    }
}
