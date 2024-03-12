package com.example.Recursion_2;
public class IsSorted {
    public static boolean IsSort(int arr[],int index) {
        if (index == arr.length-1) {
            System.out.println("Sorted");
            return true;
        }

        if(arr[index]<arr[index+1]){
            return IsSort(arr,index+1);
        }
        else {
            System.out.println("Not Sorted");
            return false;
        }
    }
        public static void main(String[] args){
            int arr[]= {1,9,5};
            System.out.println(IsSort(arr,0));

        }

    }

