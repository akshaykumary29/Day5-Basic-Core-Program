package com.Bridgelabz;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        System.out.println("Enter only Alphabet - ");
        Scanner sc = new Scanner(System.in);
        char alphabet = sc.next().charAt(0);

        if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u')
            System.out.println(alphabet + " - is a vowel");
        else
            System.out.println(alphabet + " - is a Consonant");
    }
}
