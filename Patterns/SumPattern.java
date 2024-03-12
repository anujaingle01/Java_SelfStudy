package com.example.Patterns;

public class SumPattern {
    public static void main(String[] args){

        int N =1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(N+"  ");
                N++;
            }
            System.out.println();
        }
    }
}
