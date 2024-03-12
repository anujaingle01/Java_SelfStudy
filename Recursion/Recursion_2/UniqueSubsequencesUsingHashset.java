package com.example.Recursion_2;
import java.util.HashSet;

public class UniqueSubsequencesUsingHashset {                                     //Unique Subsquences
    public static void subsequence(String name,int Index,String New,HashSet<String> set){

        if(Index == name.length()){

            if(set.contains(New)){
                return;
            }else {
                set.add(New);
                System.out.println(New);
                return;
            }
        }

        char current = name.charAt(Index);
        subsequence( name, Index+1, New+current, set);
        subsequence( name, Index+1, New, set);
    }

        public static void main(String[] args){
            String name = "aaa";
            System.out.println("Name = "+name);
            System.out.println("Unique Subsquence String = ");
            HashSet<String> set = new HashSet<>();                                    // Hashset
            subsequence(name,0,"",set);
        }
}
