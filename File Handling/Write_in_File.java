package com.example.File_Handling;

import java.io.FileWriter;
import java.io.IOException;

public class Write_in_File {                                             // Write in File
    public static void main(String[] args){

        try {                                                               // try
           FileWriter writer = new FileWriter("MCA.txt");
           writer.write("Master of Computer Application, Pune.");
           writer.close();

            System.out.println("Successfully Written in MCA File...");
        }

        catch (IOException e){                                              // catch
            System.out.println("An error Occurred");
            e.printStackTrace();
        }
    }

}
