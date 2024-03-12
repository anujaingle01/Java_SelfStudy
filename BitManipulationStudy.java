import java.util.Scanner;

public class BitManipulationStudy {
    public static void main(String[] args){

//        int n = 5;                                             // GET MANIPULATION
//        System.out.println("n = "+n);
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Index i = ");
//        int i = sc.nextInt();
//        int BitMask = 1<<i;
//
//        if((BitMask & n) == 0){
//            System.out.println("Get Manipulation of n = Zero");
//        }else {
//            System.out.println("Get Manipulation of n = Non-Zero");
//        }



//        int n = 5;                                           // SET MANIPULATION
//        System.out.println("n = "+n);
//        int i = 1;
//        int BitMask = 1<<i;
//        int set = BitMask | n;
//        System.out.println("Set Manipulation of n = "+set);


//        int n = 5;                                           // CLEAR MANIPULATION
//        System.out.println("n = "+n);
//        int i = 2;
//        int BitMask = 1<<i;
//        int newN = ~BitMask;
//        int clear = newN & n;
//        System.out.println("Clear Manipulation of n = "+clear);


        int n = 5;                                            // UPDATE MANIPULATION
        System.out.println("n = "+n);
        int i = 1;
        int BitMask = 1<<i;
        System.out.print("Operation Value ( 0 or 1 ) = ");
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();                               // operation 1 : set & operation 0 : clear

        if(op==1){
            int set = BitMask | n;
            System.out.println("Set Manipulation of n = "+set);
        }else {
            int newN = ~BitMask;
            int clear = newN & n;
            System.out.println("Clear Manipulation of n = "+clear);
        }


    }
}
