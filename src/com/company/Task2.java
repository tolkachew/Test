
package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0,a = 0, b = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0 && i % 3 == 0){
                count++;
            }else if (i%2 ==0){
                count++;
            }else if (i%3 ==0){
                count++;
            }
        }
        System.out.printf("The number of numbers that are divisible by 2 and 3 : %d",count);
    }
}


