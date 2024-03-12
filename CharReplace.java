import java.util.Scanner;

public class CharReplace {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name = ");
        String name = sc.nextLine();                      //anuja

        String Result = "";

        for(int i = 0;i<name.length();i++){
            if(name.charAt(i)=='a'){
                Result= Result+'z';
            }
            else {
                Result = Result+name.charAt(i);
            }
        }

        System.out.println("Name = "+Result );

    }
}
