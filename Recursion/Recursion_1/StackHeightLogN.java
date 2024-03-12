package com.example.Recursion_1;
public class StackHeightLogN {

    public static long pow(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }

        if(n%2==0){                                                 // Even Number
            long EvenAns =pow(x,n/2);
            return EvenAns * EvenAns;
//          return   pow(x,n/2) * pow(x,n/2);

        }
        else {                                                      // Odd Number
//         return   pow(x,n/2) * pow(x,n/2) * x;
           return   pow(x,n-1) * x;
        }

    }

    public static void main(String[] args){

        int x=2,n=4;
        long ans = pow(x,n);
        System.out.println(x+" Power " +n+ " = "+ans);
    }
}
