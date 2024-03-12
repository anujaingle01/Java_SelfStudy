package com.example.Recursion_1;

public class Num1to5 {

    public static void num(int n){

        if(n==6){
            return;
        }
        System.out.print(n+"  ");
        num( n+1);

    }
    public static void main(String[] args){
        int n = 1;
        System.out.println("Enter Number = "+n);

        num(n);
    }
}
