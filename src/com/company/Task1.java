package com.company;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        String a = sc.nextLine();
        int l = a.length();
        for (int i = 0; i < l; i++) {
            Character c = a.charAt(i);
            int b = Integer.parseInt(c.toString());
            switch (b) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                default:
                    System.out.println("I don't know!");
            }
        }
    }
}



   /* Пользователь вводит с клавиатуры целое число. Компьютер понимает только "0" и "1".
        Если пользователь вводит "0", программа печатает "zero", если "1", то "one", в противном случае
        "I don't know"
    */