package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Creator{

    public static void Act(){

        System.out.println("Hello! It a program for automatic crate a labs files.");
        Scanner in = new Scanner(System.in);
        System.out.println("Please, input a count of labs: ");
        int labCount = in.nextInt();
        new File("/Users/admin/Desktop/AutoLab").mkdirs();

        for (int i = 1; i <= labCount; i++) {
            File lFile = new File("/Users/admin/Desktop/AutoLab/Lab " + i + ".docx");
            try {
                boolean created = lFile.createNewFile();
                if (created)
                    System.out.println("File number " + i + " has been created");
            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }
        }
    }
}
