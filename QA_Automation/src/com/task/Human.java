package com.task;

/**
 * Created by Ира on 13.02.2016.
 */
public class Human {
    private String name;
    private int age;
    private String email;

    public Human(String name, int age,String email){
        this.name = name;
        this.age=age;
        this.email=email;
    }
    public void printArray(){
        System.out.println("Name" + " " + this.name + " " + "Age" + " " + this.age + " " +"E-mail" + " "+this.email );
    }
}
