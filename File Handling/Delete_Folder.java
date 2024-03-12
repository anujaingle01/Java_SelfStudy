package com.example.File_Handling;

import java.io.File;

public class Delete_Folder {                                                      // Delete_File
    public static void main(String[] args) {

        File obj = new File("C:\\Users\\anuja\\IdeaProjects\\JavaPractice\\ICEM.txt");
        if (obj.delete()){
            System.out.println("Folder Deleted = "+obj.getName());
        }
        else {
            System.out.println("Failed !  To Delete Folder");
        }

    }
}
