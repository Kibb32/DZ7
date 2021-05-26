package com.company;

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int watermelons;
        int i=0;
        int max=0;
        int min=32000;
        int watermelon;

        System.out.print("Кол-во арбузов: ");
        watermelons = input.nextInt();

        while (i<watermelons){
            watermelon = input.nextInt();
            if (watermelon>max){
                max = watermelon;
            } if (watermelon<min){
                min = watermelon;
            }
            i++;
        }
        System.out.println(min +" "+ max);
    }
}
