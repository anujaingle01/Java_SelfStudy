import java.util.HashSet;                           // Class = HashSet

public class HashSet_Study {
    public static void main(String[] args){

        HashSet <String> fruit = new HashSet<String>();           // Unique Data Only

        System.out.println("HashSet = ");
        System.out.println();

        // Add
        fruit.add("Mango");
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Cherry");
        fruit.add("Grapes");

        System.out.println(fruit);              // Display

        // Contains
        System.out.println(fruit.contains("Mango"));            // T or F

        // Remove
        fruit.remove("Grapes");
        System.out.println(fruit);

        // Size
        System.out.println(fruit.size());

        // Clear
        fruit.clear();
        System.out.println(fruit);

        System.out.println("*******************************************");

        HashSet <Integer> num = new HashSet<Integer>();
        num.add(1);
        num.add(3);
        num.add(7);

        for (int i = 1;i<=10;i++){
            if(num.contains(i)){
                System.out.println(i+" YES = Contains");
            }
            else {
                System.out.println(i+" NO = Not Contains");
            }
        }



    }
}
