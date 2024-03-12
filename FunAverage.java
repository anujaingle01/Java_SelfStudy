import java.util.Scanner;

public class FunAverage {

    public static float Avg(int a,int b,int c){
        int Total = (a+b+c);
        int average = Total/3;

        System.out.println("Average = "+average);
        return average;
    }


    public static void main(String[] anu){
        Scanner sc = new Scanner(System.in);

        System.out.print("Value of a = ");
        int a =sc.nextInt();
        System.out.print("Value of b = ");
        int b =sc.nextInt();
        System.out.print("Value of c = ");
        int c =sc.nextInt();

//        Avg(a,b,c);
        FunAverage f = new FunAverage();
        f.Avg(a,b,c);

    }
}
