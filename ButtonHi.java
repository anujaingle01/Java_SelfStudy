import java.util.Scanner;

public class ButtonHi {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        if(button == 1){
            System.out.println("Namaste");
        }
        else if(button == 2){
            System.out.println("Hello");
        }
        else if(button == 3){
            System.out.println("Hey");
        }
        else{
            System.out.println("Invalid Button");
        }


}
}
