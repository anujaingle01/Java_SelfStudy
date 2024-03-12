package com.example.Recursion_2;
public class MoveAllX {

    public static void MoveX(String name,int index,char alpha,String newString,int cnt){

        if (index == name.length()) {
            for (int i=0;i<cnt;i++){
                newString+='x';
            }
            System.out.println("Count of x = "+cnt);
            System.out.println();
            System.out.print("New String = "+newString);

            return;
        }

        if(name.charAt(index)==alpha){
            cnt++;
           MoveX(name,index+1,alpha,newString,cnt);
        }
        else {
            newString+=name.charAt(index);
            MoveX(name,index+1,alpha,newString,cnt);
        }
    }

    public static void main(String[] args){

        String name = "xabxcdxex";
        System.out.println("String = "+name);
        MoveX(name,0,'x',"",0);
    }
}

