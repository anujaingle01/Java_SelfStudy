import java.util.Scanner;

public class SumN {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("Number = "+n);

        int sum =0;
        for(int i=1;i<=n;i++){
            sum = sum + i;
        }
        System.out.println("Sum = " +sum);
    }
}
