package com.task;
import com.sun.istack.internal.Nullable;
import sun.invoke.empty.Empty;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * Created by Ира on 13.02.2016.
 */
public class Second {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);// создаём объект класса Scanner
        ArrayList<Human> list = new ArrayList<Human>();// создаем список
        Human user = new Human("Mincho",17,"email@example.com");
        list.add(user);
        // Делается выбор юзера
        System.out.println("1. Add new person\n2. Search people");
        System.out.println("Please input your choose:");
        String f = sc.nextLine();//выбор действия
        int c = Integer.parseInt(f);//преобразование сроки в число типа int

// Добавление юзеров
        if (c == 1) {
            while (list.size() <= 5) {
                System.out.println("Input your name, please: ");
                String name = sc.nextLine();
                System.out.println("Input your age, please: ");
                String sn = sc.nextLine();

                System.out.println("Input your E-mail, please: ");
                String email = sc.nextLine();

//проврека на пустые поля
                if (Validation.isValidName(name) && Validation.isValidAge(sn)) {
                    int age = Integer.parseInt(sn);//преобразование сроки в число типа int
                    list.add(new Human(name, age, email));
                }

//проврека на валидность значения  возраста



              //  else  if (Validation.isValidAge(age) ) {

                //}


            }
        }
        // поиск юзеров
            else if(c==2) {
                System.out.println("Search");
            System.out.println("Input your value of search, please: ");
            String sv = sc.nextLine();
            for(Human h: list){
    if(h.getName().equals(sv)){
        System.out.println(h.getName()+ " " +h.getAge()+ " " +h.getEmail());
        break;
    }
                else{
        System.out.println("Such user not found");
    }
            }
            }
        else{
            System.out.println("Please,try again, type '1' or '2'");
        }
            // System.out.println("Result array:");
            //for(Human human: list){
            //  human.printArray();
        }
    }


