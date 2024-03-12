package com.example.File_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read_File {                                                              // Read File
    public static void main(String[] args){

        try {                                                                         // try
            File obj = new File("MCA.txt");
            Scanner read = new Scanner(obj);
            while (read.hasNextLine()) {
                String data = read.nextLine();
                System.out.println(data);
            }
            read.close();
        }

        catch (FileNotFoundException e){                                             // catch
            System.out.println("An error Occurred");
            e.printStackTrace();
        }

    }

}
