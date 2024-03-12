package com.example.Sort;
public class SortSelection {

       /* public static void printArr(int arr[]) {
            System.out.print("Selection Sort = ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        public static void main(String[] args) {

            int arr[]={7,8,3,1,2};
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            for (int i=0;i<arr.length-1;i++){
                int small = i;
                for (int j=i+1;j< arr.length ;j++){
                    if(arr[small]>arr[j]){                          // < == Descending Order
                       small = j;
                    }
                }
                int a=arr[small];
                arr[small]=arr[i];
                arr[i]=a;
            }*/


    public static void main(String[] args) {
                int arr[]={7,8,3,1,2};

                for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
                }
                System.out.println();

            for (int i=0;i<arr.length-1;i++){
                for (int j=i+1;j< arr.length ;j++){                     // j=i+1

                    if(arr[i]>arr[j]){

                        int a=arr[i];
                        arr[i]=arr[j];
                        arr[j]=a;
                    }
                }

            }
            System.out.print("Selection Sort = ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
    }
}
