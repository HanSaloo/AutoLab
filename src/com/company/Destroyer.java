package com.company;

import java.io.File;
import java.util.Scanner;

public class Destroyer {

    public static void main() {
        String folder = "/Users/admin/Desktop/AutoLab";
        String inFolder = "/Users/admin/Desktop/AutoLab/";
        String keyCode = "null";
        int swt = 0;

        System.out.println("Chose mode: ");
        System.out.println("9 - delete folder");
        System.out.println("8 - delete files in folder");

        Scanner in = new Scanner(System.in);

        do {
            swt = in.nextInt();

            switch (swt) {
                case 9:
                    recDeleteFolder(new File(folder));
                    break;
                case 8:
                    recDeleteInFolder(new File(inFolder));
                    break;
                default:
                    System.out.println("Make a chose, plsease");
                    keyCode = in.nextLine();
            }
        }while (keyCode != "f");
    }

        ///////////////////////////////////////////////
        public static void recDeleteFolder (File file){
            int del = 0;
            if (!file.exists())
                return;

            if (file.isDirectory()) {
                for (File f : file.listFiles()) {
                    recDeleteFolder(f);
                    del++;
                }
            }
            file.delete();
            System.out.println("File deleted: " + file.getAbsolutePath());

            if (file.exists())
                System.out.println("Deleted " + del + " files.");

        }
//////////////////////////////////////////////////////
public static void recDeleteInFolder (File file){
    int del = 0;
    if (!file.exists())
        return;

    if (file.isDirectory()) {
        for (File f : file.listFiles()) {
            recDeleteInFolder(f);
            del++;
        }
    }
    file.delete();
    System.out.println("File deleted: " + file.getAbsolutePath());

    if (file.exists())
        System.out.println("Deleted " + del + " files.");

}
}

