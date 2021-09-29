package com.Bridgelabz;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        // variables  harmonic expression starts with 1 always
        double harmonicNumber = 0.0;
        int number;
        System.out.println("Enter the number to Check Harmonic expression (1+ 1/2 + 1/3 + ....+ 1/N) ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        // execute only if number > 0
        if (number != 0) {
            for (int i = 1; i <= number; i++) {
                System.out.println("i value:" + i);
                harmonicNumber += 1.0 / i;
                System.out.println(harmonicNumber);
            }
            System.out.println("Harmonic Value of Number " + number + " is :  " + harmonicNumber);
        }
    }
}
