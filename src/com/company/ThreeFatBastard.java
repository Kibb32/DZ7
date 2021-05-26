package com.company;

import java.util.Scanner;

public class ThreeFatBastard {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int fatOne;
        int fattwo;
        int fatThree;
        int maxFat=727;

        fatOne = input.nextInt();
        fattwo = input.nextInt();
        fatThree = input.nextInt();

        if (fatOne>maxFat || fattwo>maxFat || fatThree>maxFat){
            System.out.println("Error");
        }else if (fatOne>=fattwo && fatOne>=fatThree){
            System.out.print(fatOne);
        }else if (fattwo>=fatOne && fattwo >=fatThree){
            System.out.print(fattwo);
        }else {System.out.print(fatThree);
        }

    }
}
