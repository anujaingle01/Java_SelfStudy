package com.example.Recursion_2;

public class Subsequences {                                                         // Subsquences
    public static void subsequence(String name,int Index,String New){

        if(Index == name.length()){
            System.out.println(New);
                return;
            }

        char current=name.charAt(Index);
        subsequence(name, Index+1, New+current);
        subsequence(name, Index+1, New);
    }

    public static void main(String[] args){
        String name = "abc";

        System.out.println("Name = "+name);
        System.out.println("Subsquence String = ");

        subsequence(name,0,"");
    }
}
