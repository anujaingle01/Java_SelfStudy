package com.example.Sort;

public class SortQuick {

    public static int partition(int arr[],int low, int high) {

        int pivot=arr[high];            // We Assumed, Pivot Index  = Last Index
        int i=low-1;                    // No Starting Index

        for (int j=low;j<=high;j++) {
            if (arr[j] < pivot) {
                i++;                    // Empty Index Swap with Same Index Value
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
            i++;                        // Empty Index Swaps with Pivot Index Value
            int temp=arr[i];
            arr[i]=arr[high];
            arr[high]=temp;
            return i;                   // Returns Pivot Index
        }

        public static void quicksort(int arr[],int low, int high) {
        if (low <= high) {

            int pidx = partition(arr, low, high);                       // pidx = Pivot Index

            quicksort(arr, low, pidx-1);
            quicksort(arr, pidx+1, high);     // We can Comment This Block, Here Base Case Reached.
        }
        }

    public static void main(String[] args){
        int arr[]={6,3,9,5,2,8};
        int n= arr.length;

        System.out.print("Array = ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        quicksort(arr,0,n-1);                       // Start Index = 0,End Index = n-1

        System.out.print("Quick Sort Array = ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
