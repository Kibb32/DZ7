package com.company;

import java.util.Scanner;

public class Perepis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int humans;
        int age;
        int gender;
        int i=0;

        System.out.println("humans = ");
        humans = input.nextInt();

        while (i<humans){
            age = input.nextInt();
            System.out.print(" ");
            gender = input.nextInt();

        }
        Math.max(age,gender);
    }
}
