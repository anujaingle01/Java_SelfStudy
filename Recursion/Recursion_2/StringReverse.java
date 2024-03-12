package com.example.Recursion_2;
public class StringReverse {

    public static void StringRev(String name,int ind){

        if(ind<0){
            return;
        }

        System.out.print(name.charAt(ind));
        StringRev(name,(ind-1));
    }

    public static void main(String[] args){

        String name = "anuja";
        System.out.println("String = "+name);
        System.out.print("Reverse String = ");
        StringRev(name,name.length()-1);
    }
}
