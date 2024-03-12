package com.example.Sort;
public class SortMerge {

    public static void conquer(int arr[],int si,int mid,int ei) {

        int merged[] = new int[ei - si + 1];

        // Starting Index
        int idx1 = si;                                          // Block 1 = 0 to mid
        int idx2 = mid + 1;                                     // Block 2 = mid+1 to end
        int x = 0;                                              // New Array = 0

        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        // Run any 1 While from Both When Array Count is ODD
        // 1 While
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        // 2 While
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        for (int i=0,j=si;i<merged.length;i++,j++){                 // Merged & Inserted in New Array
            arr[j]=merged[i];
        }

      }

        public static void divide(int arr[],int si,int ei){
        if(si>=ei){
            return;
         }

        int mid = si + (ei-si)/2;
        // Divide Sort
        divide(arr, si, mid);                           // 1st Half Block
        divide( arr, mid+1, ei);                    // 2nd Half Block

        // Merge or Combine or Conquer
        conquer( arr, si ,mid, ei);

        }



    public static void main(String[] args){
        int arr[]={6,3,9,5,2,8};
        int n= arr.length;

        System.out.print("Array : ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        divide(arr,0,n-1);                          // Start Index = 0,End Index = n-1

        System.out.print("Merged Sort Array = ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
