import java.util.Scanner;

public class TableN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N + " Table");

        int table ;
        for (int i = 1; i <= 10; i++) {
            table = N * i;
            System.out.println(table);
        }
    }
}
