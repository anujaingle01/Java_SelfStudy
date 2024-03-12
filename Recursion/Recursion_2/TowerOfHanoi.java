package com.example.Recursion_2;
public class TowerOfHanoi {

    public static void Tower(int n,String source,String helper,String destination){
        if(n==1){
            System.out.println("Transfer Disk "+n+" from "+source+" -> "+destination);
            return;
        }
        Tower(n-1, source, destination, helper);
        System.out.println("Transfer Disk "+n+" from "+source+" to "+destination);
        Tower(n-1, helper, source, destination);
    }

    public static void main(String[] args){
        int n = 3;
        Tower(n,"A","B","C");
    }
}
