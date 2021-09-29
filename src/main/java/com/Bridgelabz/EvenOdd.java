package com.Bridgelabz;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter an Integer Number: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        // check number is even or odd
        if (number % 2 == 0)
            System.out.println("Enter Number is Even");
        else
            System.out.println("Enter Number is Odd");

    }
}
