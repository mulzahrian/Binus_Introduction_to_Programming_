package com.week5;

import java.util.Random;
import java.util.Scanner;

public class randomAngka {
    public static void main(String[] args) {
        char ulang;
        Scanner input = new Scanner(System.in);
        do {
            Random randI = new Random();
            int myRandInt = randI.nextInt(100);
            myRandInt = myRandInt + 1;
            System.out.println(myRandInt);
            System.out.print("melanjutkan (y/n)? ");
            ulang = input.next().charAt(0);
        }
        while (ulang!= 'n');
        System.out.println("Terimakasih...");

    }

}
