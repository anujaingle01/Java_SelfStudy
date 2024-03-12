import java.util.Scanner;

public class MenuHW {
    public static void main(String [] args){
        
        int i=3;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number ( 0 or 1 ) = ");
        int n = sc.nextInt();

        if (i>=1&& n==1) {


            do {
                System.out.print("Enter Marks = ");
                int marks = sc.nextInt();

                if (marks > 90) {
                    System.out.println("This is Good");
                } else if (89 >= marks && marks >= 60) {
                    System.out.println("This is also Good");
                } else if (59 >= marks && marks >= 0) {
                    System.out.println("This is OK");

                }
                System.out.print("Enter Number ( 0 or 1 ) = ");
                n = sc.nextInt();
                i--;
            }
            while (i >0);

        }else {
            System.out.println("Invalid Number");
        }
    }
}
