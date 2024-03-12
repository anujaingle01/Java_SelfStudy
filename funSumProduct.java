import java.util.Scanner;

public class funSumProduct {

    public static int Sum(int a,int b){                 // Sum Function +
        int sum = a+b;
        return sum;
    }

    public static float Product(int a,int b){             // Product Function *
        float prod = a*b;
        return prod;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Value of a = ");
        int a = sc.nextInt();
        System.out.print("Value of b = ");
        int b = sc.nextInt();
//        int Total = Sum(a,b);
//        System.out.println("Total = "+Total);

        float Total = Product(a,b);
        System.out.println("Product = "+Total);
    }
}
