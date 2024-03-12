package com.example.Recursion_1;
import java.util.Scanner;

public class RecursionSum {

    public static void Sum(int i,int n,int sum){

        if(i>n){
            System.out.println("Sum = "+sum);
            return;
        }
        sum =sum+i;
        Sum(i+1, n, sum);
    }

    public static void main(String[] args){

//        int i=1,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        Sum(1,n,0);
    }
}
