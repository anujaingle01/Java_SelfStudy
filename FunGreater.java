import java.util.Scanner;

public class FunGreater {
    public static void Largest(int n1,int n2){
    if(n1>n2){
        System.out.println("Number 1 is Greater "+ n1);
    }
    else {
        System.out.println("Number 2 is Greater "+ n2);
    }
}

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Number 1 = ");
        int n1 = sc.nextInt();
        System.out.print("Number 2 = ");
        int n2 = sc.nextInt();

        Largest(n1,n2);
    }
}


