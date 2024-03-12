package com.example.File_Handling;

import java.io.File;
import java.io.IOException;

public class Create_File_Path {                                             // Create_File_Path
    public static void main(String[] args){

        try {                                                               // try
            File obj = new File("C:\\Users\\anuja\\IdeaProjects\\JavaPractice\\NNKC.txt");
            if(obj.createNewFile()){                                            // File exist = T or F
                System.out.println("File Created :- "+ obj.getName());          // Create File
                System.out.println("File Path :- "+ obj.getAbsolutePath());     // File Path
            }else {
                System.out.println("File already Exists");
            }
        }

        catch (IOException e){                                              // catch
            System.out.println("An error Occurred");
            e.printStackTrace();
        }

    }
}