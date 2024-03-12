package com.example.Recursion_2;
public class KeypadCombinationMapping {
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void Calci(String name,int index,String combination){

        if (index==name.length()){
            System.out.println(combination);
            return;
        }

        char current= name.charAt(index);
        String mapping=keypad[current - '0'];

        for (int i=0;i<mapping.length();i++){
            Calci( name, index+1, combination+mapping.charAt(i));
        }

    }

    public static void main(String [] args){

        String name = "23";
        System.out.println("Name = "+name);
        Calci(name,0,"");
    }
}
