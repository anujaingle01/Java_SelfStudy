package com.example.File_Handling;

import java.io.File;

public class Get_File_Info {                                                    // Get_File_Info
    public static void main(String[] args){

        File obj = new File("MCA.txt");
        if (obj.exists()){
            System.out.println("File Name = "+obj.getName());
            System.out.println("File Path = "+obj.getAbsolutePath());
            System.out.println("Writable = "+obj.canWrite());
            System.out.println("Readable = "+obj.canRead());
            System.out.println("File Size = "+obj.length());
        }
        else {
            System.out.println("File Does not Exist");
        }

    }
}
