package com.example.Patterns;

public class RhombusPattern {
    public static void main(String[] args){

//        for(int i=1;i<=5;i++){  //Solid Rectangle
//
//            for (int j =1;j<=5-i;j++){
//                System.out.print(" "); // For Spaces
//            }
//
//            for (int j=1;j<=5;j++){
//                System.out.print("*"); // For Star
//            }
//
//            System.out.println();
//        }


        for(int i=1;i<=5;i++){  //Hollow Rectangle

            for (int j =1;j<=5-i;j++){
                System.out.print(" "); // For Spaces
            }

            for (int j=1;j<=5;j++){
               if(i==1 || i==5 || j==1 || j==5){
                   System.out.print("*");
               }
               else {
                   System.out.print(" ");
               }
            }

            System.out.println();
        }
    }
}
