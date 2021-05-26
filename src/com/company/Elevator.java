package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);


        int max_floor = 0;
        int min_floor = 0;
        int current_floor = 0;

        for (char c : input.next().toCharArray()) {
            if (c == '1') {
                current_floor++;
            } else if (c == '2') {
                current_floor--;
            } else {
                System.out.println("WTF");
            }
            max_floor = Math.max(max_floor, current_floor);
            min_floor = Math.min(min_floor, current_floor);
        }
            System.out.print(max_floor-min_floor +1);
}
}
