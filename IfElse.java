import java.util.*;

public class IfElse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Age of Anuja = ");
        int age = sc.nextInt();

        if(age>=18)
            System.out.println("Anuja can Vote");
        else
            System.out.println("Anuja cannot Vote");
    }
}
