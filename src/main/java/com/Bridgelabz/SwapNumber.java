package com.Bridgelabz;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        // Getting input from user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the 2st number: ");
        int num2 = sc.nextInt();

        System.out.println("Before Swapping numbers are: ");
        System.out.println("The 1st Number is = " + num1);
        System.out.println("The 2nd Number is = " + num2);

        // Use a temporary variable to swap the numbers.
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swapping numbers are: ");
        System.out.println("The 1st Number is = " + num1);
        System.out.println("The 2nd Number is = " + num2);
    }
}
