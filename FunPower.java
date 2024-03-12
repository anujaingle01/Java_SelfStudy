import java.util.Scanner;
import java.lang.Math;

public class FunPower {
    public static void Power(int x,int n){
        double power = Math.pow(x,n);

        System.out.println("Value of x to the power n = "+power);
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter No x = ");
        int x = sc.nextInt();
        System.out.print("Enter No n = ");
        int n = sc.nextInt();

        Power(x,n);
    }
}





