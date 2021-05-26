package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int bus = 437;
        int bridge;
        int i = 0;
        int bridgeNumber;

        System.out.println("Введите кол-во мостов: ");
        bridgeNumber = input.nextInt();

        while (i < bridgeNumber) {
            System.out.print("Введите высоту моста: ");
            bridge = input.nextInt();
            i++;
            if (bus >= bridge) {
                System.out.println("Crash" + i);
                return;
            } else {
                System.out.println("No Crash");


            }
        }
    }
}