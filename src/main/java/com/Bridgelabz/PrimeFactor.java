package com.Bridgelabz;

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {

        int num;
        System.out.print("Enter the No. : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("Number is: " + num);

        for (int i = 2; (i * i) <= num; i++) {
            while (num % i == 0) {
                System.out.println("facrtor is :" + i);
                num = num / i;

            }

        }
        if (num > 1) {
            System.out.println(num);
        } else {
            System.out.println("");
        }

    }

}
