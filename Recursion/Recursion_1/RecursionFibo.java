package com.example.Recursion_1;
import java.util.Scanner;

public class RecursionFibo {

    public static void Fibo(int a,int b, int n){
        if(n==0){
            return;
        }
        int c =a+b;
        System.out.println(c);
        Fibo(b,c,n-1);
    }


    public static void main(String[] args){

        int a =0,b=1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Number = ");
        int n = sc.nextInt();
        System.out.println("a : "+a);
        System.out.println("b : "+b);

        Fibo(0,1,n-2);

    }

}

