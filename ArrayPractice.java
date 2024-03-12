import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Size = ");
        int size = sc.nextInt();
        int num[] = new int[size];

        for (int i = 0; i < size; i++) {            // Input No
            num[i]=sc.nextInt();
        }

        for (int i = 0; i < size; i++) {           // Output No
            System.out.println("Number = " +num[i]);
        }
    }
}
