package com.example.Patterns;

public class ButterflyPattern {
    public static void main(String[] args){

        for(int i=1;i<=4;i++){

            for (int j =1;j<=i;j++){
                System.out.print("*"); //left Triangle
            }

            for (int j=1;j<=2*(4-i);j++){
                System.out.print(" "); //Middle Spaces
            }

            for (int j=1;j<=i;j++){
                System.out.print("*"); //Right Triangle
            }
            System.out.println();
        }

        for(int i=4;i>=1;i--){

            for (int j =1;j<=i;j++){
                System.out.print("*");  //left Triangle
            }

            for (int j=1;j<=2*(4-i);j++){
                System.out.print(" ");  //Middle Spaces
            }

            for (int j=1;j<=i;j++){
                System.out.print("*");   //Right Triangle
            }
            System.out.println();
        }
    }
}
