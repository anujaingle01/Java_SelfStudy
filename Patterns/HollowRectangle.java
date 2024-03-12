package com.example.Patterns;

public class HollowRectangle {
    public static void main(String[] args){

        int out=4,in=5;

        for(int i=1;i<=out;i++){
            for (int j=1;j<=in;j++){
                if(i==1 || i==out || j==1 ||j==in){
                    System.out.print("*");  //Outer Rectangle
                }
                else {
                    System.out.print(" ");  //Inner Rectangle
                }
            }
            System.out.println();
        }
    }
}
