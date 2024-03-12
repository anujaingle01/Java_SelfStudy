import java.util.Scanner;

public class FunCircleCircumference {

    public static void Circle(int r){
        float circum = (float) (2 * 3.14 * r);
        System.out.println("Circumference of a Circle = "+circum);
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Radius = ");
        int r = sc.nextInt();

        Circle(r);
    }
}
