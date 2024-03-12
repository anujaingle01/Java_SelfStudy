package com.example.Hash_Types;
import java.util.HashMap;

public class HashMap_Revise {
    public static void main(String args[]) {

        HashMap<String, Integer> map = new HashMap<>();

        //Insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);
        System.out.println(map);

        // Updated Value Not Key       Bcoz, (Key = Unique)
        map.put("China", 180);
        System.out.println(map);

        //Searching
        if(map.containsKey("Indonesia")) {
            System.out.println("Key is present in the map");
        } else {
            System.out.println("Key is not present in the map");
        }

        // Get Value
        System.out.println(map.get("China")); //key exists
        System.out.println(map.get("Indonesia")); //key doesn't exist

        //Removing
        map.remove("China");
        System.out.println(map);

        for (String i : map.keySet()){
            System.out.println("Country : "+i+ " & Value = " +map.get(i) );
        }

    }
    }
