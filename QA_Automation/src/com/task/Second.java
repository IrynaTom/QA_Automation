package com.task;
import com.sun.istack.internal.Nullable;
import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import sun.invoke.empty.Empty;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * Created by Ира on 13.02.2016.
 */
public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// создаём объект класса Scanner
        ArrayList<Human> list = new ArrayList<Human>();// создаем список
        while (true) {
            // Делается выбор юзера
            System.out.println("0. Exit\n4. Show all\n1. Add new person\n2. Search people by name\n3. Search people by e-mail\n5. Search people by age");
            System.out.println("Please input your choose:");
            String f = sc.nextLine();//выбор действия
            int c = Integer.parseInt(f);//преобразование сроки в число типа int
            switch (c) {
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Please,try again, type '1' or '2'");
                    break;
                case 1:
                    System.out.println("Input your name, please: ");
                    String name = sc.nextLine();
                    System.out.println("Input your age, please: ");
                    String sn = sc.nextLine();
                    System.out.println("Input your E-mail, please: ");
                    String email = sc.nextLine();

                    if (Validation.isValidName(name) && Validation.isValidStringAge(sn)) {
                        int age = Integer.parseInt(sn);//преобразование сроки в число типа int
                        if (Validation.isValidAge(age)) {
                            list.add(new Human(name, age, email));
                        }
                    }
                    break;
                case 2:
                    System.out.println("Input your value(name) of search, please: ");
                    String sv = sc.nextLine();
                    for (Human h : list) {
                        if (h.getName().equals(sv)) {
                            System.out.println(h.getName() + " " + h.getAge() + " " + h.getEmail());
                            break;
                        } else {
                            System.out.println("Such user not found");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Input your value(email) of search, please: ");
                    String sv1 = sc.nextLine();
                    for (Human h : list) {
                        if(h.getEmail().equals(sv1)){
                            System.out.println(h.getName() + " " + h.getAge() + " " + h.getEmail());
                            break;
                        } else {
                            System.out.println("Such user not found");
                        }
                    }
                    break;
                case 4:
                    System.out.println("List of people: ");
                    for (Human h : list) {
                            System.out.println(h.getName() + " " + h.getAge() + " " + h.getEmail());
                    }
                    break;
                case 5:
                    System.out.println("Input your value(age) of search, please: ");
                    String sv2 = sc.nextLine();
                    int sv22 = Integer.parseInt(sv2);//преобразование сроки в число типа int
                    for (Human h : list) {
                            if(h.getAge()==sv22){
                            System.out.println(h.getName() + " " + h.getAge() + " " + h.getEmail());
                            break;
                        } else {
                            System.out.println("Such user not found");
                        }
                    }
                    break;
            }

            try{
            f = sc.nextLine();
            c = Integer.parseInt(f);
            }
            catch(NumberFormatException e){
            System.out.print("Input number,please");
            }


        }

    }
    public enum Menu {Exit_0, Show_all_1, Add_2, Search_by_name_3, Search_by_age_4, Search_by_email_5}

}


