package com.task;
import java.util.Scanner;

/**
 * Created by Ира on 10.02.2016.
 */
public class First {
    public static void main (String[] args) {
        int count=0;
        int array[] = new int[5];//созддание масива
        while (array.length > count) {
            System.out.println("Input a number, please: ");
            Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
            String s = sc.nextLine();

            int num = Integer.parseInt(s);//преобразование сроки в число типа int

            if (num > 10 || num < 0) {
                System.out.println("Wrong data, try again");
                continue;
            }

            array[count] = num;
            count++;
        }
        System.out.println("Array is over. Result array:");
        printArray(array);
    }
    private static void printArray(int[] array){

        for(int i: array){
            System.out.print(i + " ");
        }
    }
}
