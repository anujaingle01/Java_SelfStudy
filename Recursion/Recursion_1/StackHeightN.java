package com.example.Recursion_1;
public class StackHeightN {
    public static int XpowN(int x,int n){
        if(n==0){
            return 1 ;
        }
        if(x==0){
            return 0 ;
        }
        int xpown = XpowN(x,n-1);
        int xpn= x * xpown;
        return xpn;
    }

    public static void main(String[] args){

        int x=2,n=5;
        int ans = XpowN(x,n);
        System.out.println(x+" Power " +n+ " = "+ans);
    }
}
