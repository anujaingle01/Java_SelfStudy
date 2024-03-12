package com.example.Sort;
public class SortInsertion {
    public static void main(String[] args){

        int a[]={5,1,2,4,6};
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        for (int i=1;i<a.length-1;i++){
            int temp=a[i],j=i;
            while (j>0 && a[j-1]>a[j]){
                a[j]=a[j-1];
                j--;
            }
            a[j]=temp;
        }

        System.out.print("Insertion Sort = ");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
