package com.example.Recursion_3;
import java.util.*;

public class PrintSubsetUsingArrayList {

    public static void printSubset(ArrayList<Integer> subset){                  // Converting Array into Integer
        for(int i=0;i< subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }

    public static void findsubset(int n,ArrayList<Integer> subset){             // User Defined Function

        if(n==0){
            printSubset(subset);                                       // printSubset Call
//            System.out.println(subset);
            return;
        }

        subset.add(n);                                                 // Adding
        findsubset(n-1,subset);

        subset.remove(subset.size()-1);                         // No Adding
        findsubset(n-1,subset);
    }


    public static void main(String[] args){
        int n = 3;
        System.out.println("Number = "+n);
        ArrayList<Integer> subset = new ArrayList<>();
        findsubset(n,subset);
    }
}
