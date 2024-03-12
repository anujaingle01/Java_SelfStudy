import java.util.Scanner;

public class FunOddSum {

    public static int OddSum(int n){
        int sum=0;
        for (int i=1;i<=n;i=i+2){
            sum = sum + i;
        }
        System.out.println("Sum of Odd No: "+sum);
        return sum;
    }

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.print("Number = ");
        int n = sc.nextInt();

         OddSum(n);
//        System.out.println(OddSum(n));
    }
}
