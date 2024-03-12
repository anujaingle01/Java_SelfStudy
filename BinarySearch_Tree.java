import java.util.*;

public class BinarySearch_Tree {

   static class Node {
       int data;
       Node left;
       Node right;

       Node(int data) {
           this.data = data;
       }
   }

        public static Node insert(Node root, int val) {
        if (root == null ){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
          root.left = insert(root.left,val);
        }
        else {
            root.right = insert(root.right,val);
        }
        return root;
        }



       public static void inOrder(Node root) {              // L - Root - R
           if (root == null) {
               return;
           }
           inOrder(root.left);
           System.out.print(root.data + " ");
           inOrder(root.right);
       }



       public static boolean search(Node root, int key){
       if(root == null){
           return false;
       }

       if (root.data > key){
           return search(root.left,key);
       }
       else if (root.data == key){
           return true;
       }
       else {
           return search(root.right,key);
       }
       }



       public static Node delete(Node root,int val){
       if (root.data > val){
           root.left = delete(root.left, val);
       }
       else if (root.data < val){
           root.right = delete(root.right, val);
       }

       // root.data == val
       else {
           // case 1
           if (root.left == null && root.right == null){
               return null;
           }

           // case 2
           if (root.left == null){
               return root.right;
           }
           else if (root.right == null){
               return root.left;
           }

           // case 3
           Node IS = inOrderSuccessor(root.right);
           root.data = IS.data;
           root.right = delete(root.right,IS.data);
       }
       return root;
       }



       public static Node inOrderSuccessor(Node root){
       while(root.left != null){
           root = root.left;
       }
       return root;
       }



       public static void printInRange(Node root,int X, int Y){
       if (root == null){
           return;
       }

       if (root.data >= X && root.data <= Y){
           printInRange(root.left,X,Y);
           System.out.print(root.data+" ");
           printInRange(root.right,X,Y);
       }
       else if (root.data >= Y){
           printInRange(root.left ,X,Y);
       }
       else {
           printInRange(root.right,X,Y);
       }
       }



       public static void printPath(ArrayList<Integer> path){
       for (int i = 0;i<path.size();i++){
           System.out.print(path.get(i)+" --> ");
       }
           System.out.println("Null");
       }
       public static void printRoot2Leaf(Node root,ArrayList<Integer> path){
       if (root == null){
           return;
       }
       path.add(root.data);

            // leaf
           if(root.left == null && root.right == null){
               printPath(path);
           }
           // non leaf
           else {
            printRoot2Leaf(root.left,path);
            printRoot2Leaf(root.right,path);
           }
           path.remove(path.size()-1);
       }




        public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;

        for (int i = 0;i<values.length;i++){
            root = insert(root,values[i]);
        }
        System.out.print("InOrder = ");
        inOrder(root);
        System.out.println();

            System.out.println();
            System.out.print("Value Deletion = ");
            delete(root,4);
            inOrder(root);
            System.out.println();

            System.out.println();
            System.out.print("Key Search = ");
            if(search(root,8 )){
                System.out.println("Key Found");
            }
            else {
                System.out.println("Key Not Found");
            }

            System.out.println();
            System.out.print("Value in Range = ");
            printInRange(root,2,5);
            System.out.println();

            System.out.println();
            System.out.println("Print Root to Leaf = ");
            printRoot2Leaf(root,new ArrayList<>());
        }


}
