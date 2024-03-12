import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Number = ");
        int num = sc.nextInt();

        if(num>0){
            System.out.println("Natural Number");
        }else if (num<=0){
            System.out.println("Not a Natural Number");
        }

    }
}
