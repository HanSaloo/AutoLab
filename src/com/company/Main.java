package com.company;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        System.out.println("Hello! I'm are update! I get more functions!");
        System.out.println("Press f for exit!");
        System.out.println("Type 1 for create files");
        System.out.println("Type 2 for remove created files");
        Scanner in = new Scanner(System.in);


        String keyCode = "null";

        do {
            int actions = in.nextInt();
            switch (actions) {
                case 1:
                    Creator.Act();
                    break;
                case 2:
                    Destroyer.main();
                    break;
                default:
                    System.out.println("WRONG! Chose normal, please!");
                    keyCode = in.nextLine();
            }
        } while(keyCode != "f");
    }
}