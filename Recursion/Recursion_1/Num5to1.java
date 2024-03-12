package com.example.Recursion_1;

public class Num5to1 {

    public static void num(int n){

        if(n==0){
            return;
        }
        System.out.print(n+"  ");
        num( n-1);

    }
    public static void main(String[] args){
        int n = 5;
        System.out.println("Enter Number = "+n);

        num(n);
    }
}
