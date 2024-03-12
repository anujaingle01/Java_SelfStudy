import java.util.*;                     // * contains all Classes, packages
//import java.util.ArrayList;
//import java.util.Iterator;

public class Iterator_Study {
    public static void main(String[] args) {

        ArrayList<String> color = new ArrayList<>();
        color.add("Red");
        color.add("Green");
        color.add("Pink");
        color.add("Blue");
        color.add("Black");

        System.out.println(color);

        Iterator<String> it = color.iterator();

//        System.out.println(it.next());
        System.out.println(it.hasNext());               // T or F

        for (String i : color) {
            System.out.println(it.next());
        }

        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(13);
        num.add(5);
        num.add(70);
        num.add(9);

        Iterator<Integer> it1 = num.iterator();

        // For Loop & For Each - Not Possible = Size problem
        while(it1.hasNext()) {
            Integer i = it1.next();

            if (i > 10) {
                it1.remove();
            }
        }

            System.out.println(num);

    }
}


