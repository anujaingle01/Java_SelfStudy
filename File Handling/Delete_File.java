package com.example.File_Handling;

import java.io.File;

public class Delete_File {                                                      // Delete_File
    public static void main(String[] args) {

    File obj = new File("NNKC.txt");
    if (obj.delete()){
        System.out.println("File Deleted = "+obj.getName());
    }
    else {
        System.out.println("Failed !  To Delete File");
    }

    }
}
