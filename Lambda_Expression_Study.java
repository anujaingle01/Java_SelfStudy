//import java.util.ArrayList;                                              // Normal expression
//
//public class Lambda_Expression_Study {
//    public static void main(String[] args) {
//
//        ArrayList<Integer> num = new ArrayList<>();
//        num.add(5);
//        num.add(9);
//        num.add(8);
//        num.add(1);
//
//        num.set(0,55);
//
//        System.out.print(num+" ");
//        System.out.println();
//
//        num.forEach((n)->{System.out.print(n+" ");});
//    }
//}



//import java.util.ArrayList;
//import java.util.function.Consumer;                                         // Consumer expression
//
//public class Lambda_Expression_Study {
//    public static void main(String[] args) {
//
//        ArrayList<Integer> num = new ArrayList<>();
//        num.add(5);
//        num.add(9);
//        num.add(8);
//        num.add(1);
//
//        System.out.print(num+" ");
//        System.out.println();
//
//        Consumer <Integer> method = (n)->{System.out.print(n+" ");};
//        num.forEach(method);
//    }
//}






interface StringFunction{
    String run(String str);
}

public class Lambda_Expression_Study {
    public static void main(String[] args) {

        StringFunction exclaim = (s)->(s+"!");
        StringFunction ask = (s)->(s+"?");

        // call printFormatted Function
        printFormatted("Hello Anuja ",exclaim);
        printFormatted("Hello ",ask);
    }

    public static void printFormatted(String str,StringFunction format){
        String result = format.run(str);
        System.out.println(result);
    }
}
