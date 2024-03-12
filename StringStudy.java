import java.util.Scanner;

public class StringStudy {
    public static void main(String[] args){

//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();

        String FName = "Anuja";
        String LName = " Ingle";
        String Name = FName + LName;                        // Concatenation
        System.out.println("Full Name = "+Name);
        System.out.println("Length of Full Name = "+Name.length());                  // Space also Count in String Length

        String S = FName.substring(2);          // Start - End-1  OR  Start - Length
        System.out.println("Substring = "+S);

        for (int i=0;i<Name.length();i++){
            System.out.print(Name.charAt(i));
        }
        System.out.println();

        String A = "abc";
        String B = "abcd";
        if(A.compareTo(B)==0){                             // Comparision
            System.out.println("Equal");                   // Always use --->      .compareTo()
        }
        else {
            System.out.println("Not Equal");
        }
    }
}
