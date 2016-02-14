package com.task;
import java.util.Scanner;


/**
 * Created by Ира on 13.02.2016.
 */
public class Second {
    public static void main (String[] args) {
        int count=0;
        Human[] array= new Human[5];
        while (array.length > count) {
            System.out.println("Input your name, please: ");
            Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
            String name = sc.nextLine();
            System.out.println("Input your age, please: ");
            String sn = sc.nextLine();

            int age = Integer.parseInt(sn);//преобразование сроки в число типа int


            if (age > 100 || age < 0 ||name.length()<4) {
                System.out.println("Wrong data, try again");
                continue;
            }

            array[count] = new Human(name, age);
            count++;
        }
        System.out.println("Array is over. Result array:");
        for(Human human: array){
            human.printArray();
        }
    }

}

