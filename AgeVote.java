import java.util.Scanner;

public class AgeVote {
    public static void Vote(int age){
       if(age>=18){
           System.out.println("Vote ");
       }
       else {
           System.out.println("Cannot Vote ");
       }
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Age = ");
        int age = sc.nextInt();

        Vote(age);
    }
}
