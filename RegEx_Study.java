import java.util.regex.*;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class RegEx_Study {
    public static void main(String[] args){

        Pattern pattern1 = Pattern.compile("W3schools",Pattern.CASE_INSENSITIVE);          // 2 Parameters
        Matcher matcher1 = pattern1.matcher("Visit a W3SchOOls");                          // Found Match
        boolean ans = matcher1.find();                                                           // T or F

        if (ans){
            System.out.println("Match Found");
        }else {
            System.out.println("Not Match Found");
        }

    }
}
