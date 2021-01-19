package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Creator{

    public static void Act(){

        System.out.println("Hello! It a program for automatic crate a labs files.");
        Scanner in = new Scanner(System.in);

        System.out.print("Type name of your files: ");
        String name = in.nextLine();

        System.out.print("Input type of files (any, for example .txt or .xml): ");
        String type = in.nextLine();

        System.out.print("Please, input a count of labs: ");
        int labCount = in.nextInt();

        new File("/Users/admin/Desktop/AutoLab").mkdirs();

        for (int i = 1; i <= labCount; i++) {
         File lFile = new File("/Users/admin/Desktop/AutoLab/"+ name +" " + i + type);
         try {
                boolean created = lFile.createNewFile();
                if (created)
                    System.out.println("File number " + i + " with name"+ name +" and "+ type +" type, has been created!");
            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }
        }
    }
}
