import java.util.Scanner;

public class FunExample {
    public static void FName(String name){

        System.out.println("My Name is = "+name);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Name = ");
        String name = sc.nextLine();

        FName(name);
    }
}
