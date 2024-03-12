import java.util.Scanner;

public class CountNumbers {

    public static void main(String[] args){
        int CountP=0,CountN=0,CountZ=0 ;
        Scanner sc= new Scanner(System.in);

        for (int i =1;i<=5;i++) {
            System.out.print("Enter No = ");
            int num = sc.nextInt();

            if (num > 0)
                CountP++;
            else if (num < 0)
                CountN++;
            else
                CountZ++;
        }

        System.out.println();
            System.out.println("Positive No = "+CountP);
            System.out.println("Negative No = "+CountN);
            System.out.println("Zero No = "+CountZ);
        }
        }

