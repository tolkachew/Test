
package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0 && i % 3 == 0){
                a++;
                b++;
            }else if (i%2 ==0){
                a++;
            }else if (i%3 ==0){
                b++;
            }
        }
        System.out.printf("The number of numbers that are divisible by 2 : %d, by 3 : %d",a,b);
    }
}


