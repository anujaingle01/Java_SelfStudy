import java.util.Scanner;
import java.lang.Math;

public class Armstrong {

    public static boolean ArmstrongN(int n){

        int num=0,digit=0,temp=n;
        double sum=0;

        while (temp>0){
            temp = temp/10;
            digit++;
        }
        System.out.println("Digit = "+digit);

        temp=n;
        while (temp>0){
            num = temp%10;
            sum = sum + (Math.pow(num,digit));
            temp = temp/10;
        }

        System.out.println("Sum of "+n+" = "+sum);

        if(n==sum){
            return true;
        }else {
            return false;
        }

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number = ");
        int n = sc.nextInt();

        if(ArmstrongN(n)==true){
            System.out.println(n+" = Armstrong");
        }
        else {
            System.out.println(n+" = Not Armstrong");
        }

    }
}
