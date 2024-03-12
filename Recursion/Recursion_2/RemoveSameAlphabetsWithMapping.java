package com.example.Recursion_2;
public class RemoveSameAlphabetsWithMapping {
public static boolean[] map=new boolean[26];                                    // Global Constant Variable
    public static boolean RemoveSameAlpha(String name,int index,String New){

        if(index==name.length()){
            System.out.print("String after removed Duplicates = "+New );
            return true;
        }

        char currentchar=name.charAt(index);
        if(map[currentchar-'a']){                                           // Default False
             RemoveSameAlpha(name,index+1, New);
        }else {
            New+=currentchar;
            map[currentchar-'a']=true;                                      // Set as True
             RemoveSameAlpha(name,index+1, New);
        }
        return true;
    }
    public static void main(String[] args){
        String name ="abbacdd";
        System.out.println("String = "+name);
        RemoveSameAlpha(name,0,"");
    }
}
