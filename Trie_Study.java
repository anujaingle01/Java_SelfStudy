
public class Trie_Study {

    static class Node{
        Node[] children;   // n number of nodes
        boolean eow;      //  End of Word

        public Node(){      // constructor
            children = new Node[26];        // 26 alphabets
            for (int i=0;i<26;i++){
                children[i] = null;
            }
            eow = false;
        }
    }

    static Node root = new Node();

    public static void insert(String word){

        Node curr = root;
        for (int i=0;i<word.length();i++){
            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null){
                curr.children[idx] = new Node();    // Root.next = null , Then Create new node
            }

            if (i==word.length() -1 ){
                curr.children[idx].eow = true;      // true = word completed
            }

            curr = curr.children[idx];              // root = root.next
        }
    }


    public static boolean search(String key){

        Node curr = root;
        for (int i=0;i<key.length();i++) {
            int idx = key.charAt(i) - 'a';

            Node node = curr.children[idx];

            if (node == null) {
                return false;
            }

            if (i==key.length() -1 && node.eow == false){
                return false;
            }

            curr = curr.children[idx];           // root = root.next
        }
        return true;
    }




    public static void main(String[] args){

        String words[]= {"the","a","there","their","any"};
        for (int i = 0;i< words.length;i++){
            insert(words[i]);
        }

        System.out.println(search("their"));
        System.out.println(search("thor"));
        System.out.println(search("an"));
    }
}
