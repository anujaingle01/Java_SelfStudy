import java.util.Scanner;

public class ArrayPractice2D {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Row = ");
        int r = sc.nextInt();
        System.out.print("Column = ");
        int c = sc.nextInt();

        int array[][]=new int[r][c];

        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                array[i][j] = sc.nextInt();              // Input 2D Array
            }
        }

        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(array[i][j]+" ");        // Output 2D Array
            }
            System.out.println();
        }

    }
}
