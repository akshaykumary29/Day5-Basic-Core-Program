package com.Bridgelabz;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        num1 = sc.nextInt();
        System.out.println("Enter the second Number: ");
        num2 = sc.nextInt();
        System.out.println("Enter the third Number: ");
        num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3)
            System.out.println("Largest Number Is: " + num1);
        else if (num2 > num3)
            System.out.println("Largest Number Is: " + num2);
        else
            System.out.println("Largest Number Is: " + num3);
    }
}
