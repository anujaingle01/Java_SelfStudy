import java.util.*;

public class Addition {
    public static void main(String[] args){
        Scanner add = new Scanner(System.in);
        System.out.print(" a = ");
        int a = add.nextInt();
        System.out.print(" b = ");
        int b = add.nextInt();
        int sum = a+b;
        System.out.print("sum of a + b = " + sum);
//        System.out.println(sum);
    }
}
