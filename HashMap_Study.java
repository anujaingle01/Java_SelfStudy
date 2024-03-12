import java.util.HashMap;                   // Class = HashMap

public class HashMap_Study {
    public static void main(String[] args){

        HashMap<String,String> fruit = new HashMap<String,String>();       // Key Value :- Pair

        System.out.println("HashMap = ");
        System.out.println();

        // Put
        fruit.put("A","Apple");
        fruit.put("B","Banana");
        fruit.put("C","Chickoo");
        fruit.put("G","Grapes");
        fruit.put("M","Mango");

        System.out.println(fruit);              // Display

        // Get
        System.out.println(fruit.get("A"));

        // Remove
        fruit.remove("A");

        System.out.println(fruit);

        // Size
        System.out.println("Size = "+fruit.size());

        // Clear
        fruit.clear();

        System.out.println("****************************************************");

        HashMap<Integer,String> Country = new HashMap<Integer,String>();

        Country.put(1,"India");
        Country.put(2,"Japan");
        Country.put(3,"China");

        // Key = for loop
        for (Integer i : Country.keySet()){
            System.out.println(i);
        }

        // Values = for loop
        for (String i : Country.values()){
            System.out.println(i);
        }

        // Key Values = for loop
        for (Integer i : Country.keySet()){
            System.out.println("Key = "+i+ " & Values = "+Country.get(i));
        }

    }
}
