import java.util.Scanner;

public class Transpose {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of Row = ");
        int r = sc.nextInt();
        System.out.print("Enter no. of Column = ");
        int c = sc.nextInt();

        int M[][]=new int[r][c];

        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                M[i][j]=sc.nextInt();
            }
        }
        System.out.println();

        System.out.println("Matrix = ");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(M[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Transpose Matrix = ");
            for (int j=0;j<c;j++){
                for (int i=0;i<r;i++){
                    System.out.print(M[i][j]+" ");
                }
                System.out.println();
            }







    }
}

