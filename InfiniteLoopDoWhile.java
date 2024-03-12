import java.util.Scanner;

public class InfiniteLoopDoWhile {
    public static void InfiniteLoop(int i){

       do {
           System.out.println(" Hi ");
           i--;
       }
       while (i<=0);
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter No = ");
        int i = sc.nextInt();

        InfiniteLoop(i);
    }
}
