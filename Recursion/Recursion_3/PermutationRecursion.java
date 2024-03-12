package com.example.Recursion_3;
public class PermutationRecursion {                                             // All Possible Combinations
    public static void permutation(String str,int index, String permut) {
        if (str.length() == 0) {
            System.out.println(permut);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);

            String New = str.substring(0, i) + str.substring(i + 1);
            permutation(New, index + 1, permut + current);

        }
    }

        public static void main(String[] args){
            String str = "ABC";
            System.out.println("String = " + str);
            System.out.println("Permutation Recursion of String = ");
            permutation(str,0, "");
        }
}


//public class PermutationRecursion {
//
//    public static String swap(String name,int a,int b){             // Swap + BackTrack Function
//        char ch[] = name.toCharArray();
//
//        char c = ch[a];
//        ch[a]=ch[b];
//        ch[b]=c;
//
//        return String.valueOf(ch);
//    }
//
//    public static void permutation(int index,String name) {             // User Defined Function
//        if (index == name.length() - 1) {
//            System.out.println(name);
//            return;
//        }
//
//        for (int i=index;i<name.length();i++){
//        name= swap(name,i,index);                           // Swap Call
//        permutation(index+1,name);                    // Recursion Call
//        name= swap(name,i,index);                           // BackTrack Call
//        }
//    }
//
//
//    public static void main(String[] args){                     // Main Function
//        String name = "ABC";
//        System.out.println("String = "+name);
//        System.out.println("Permutation Recursion of String = ");
//        permutation(0,name);
//    }
//}
