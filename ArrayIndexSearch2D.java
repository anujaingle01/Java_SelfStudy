import java.util.Scanner;

public class ArrayIndexSearch2D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Row = ");
        int r = sc.nextInt();
        System.out.print("Column = ");
        int c = sc.nextInt();

        int array[][]=new int[r][c];

        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                array[i][j] = sc.nextInt();
            }
        }

        System.out.print("x y = ");
        int xy= sc.nextInt();

        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++) {
                if (array[i][j] == xy) {
                    System.out.println("Number x y Found at Index of Matrix = ("+i+","+j+")");
                }
            }
        }
    }
}
