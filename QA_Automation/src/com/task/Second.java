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
            System.out.println("1. Add new person\n2. Search people\n0. Exit");
            System.out.println("Please input your choose:");
            String f = sc.nextLine();//выбор действия
            int c = Integer.parseInt(f);//преобразование сроки в число типа int

            switch (c) {
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
                    System.out.println("Input your value of search, please: ");
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
                case 0:
                    System.exit(0);
                    default:
                    System.out.println("Please,try again, type '1' or '2'");
                    break;

            }
        }
    }
}


