import java.util.Scanner;

public class ArrayIndexSearch {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Size = ");
        int size = sc.nextInt();
        int num[]=new int[size];                            // 1D Array

        for (int i=0;i<size;i++){
            num[i]= sc.nextInt();
        }
        System.out.print("x = ");
        int x = sc.nextInt();

        for (int i=0;i<num.length;i++){                     // Array Size = = ArrayName.length
            if(num[i]==x){
                System.out.println("Number x = "+x+" Found at Index = "+i);
            }

        }

    }
}
