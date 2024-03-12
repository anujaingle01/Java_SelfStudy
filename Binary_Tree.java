import java.util.LinkedList;
import java.util.Queue;

public class Binary_Tree {

    int val;
    Binary_Tree left;
    Binary_Tree right;

    Binary_Tree(int val) {
        val = val;
    }

    static boolean isIdentical(Binary_Tree root,Binary_Tree subroot){
        if(subroot == null && root == null){
            return true;
        }

        if(root == null || subroot == null){
            return false;
        }

        if(root.val == subroot.val){
            return isIdentical(root.left, subroot.left) &&
                    isIdentical(root.right, subroot.right);
        }
        return false;
    }

    static boolean isSubTree(Binary_Tree root, Binary_Tree subroot){
        if(subroot == null){
            return true;
        }

        if(root == null){
            return false;
        }

        if (isIdentical(root,subroot)){
            return true;
        }

        return isSubTree(root.left,subroot) || isSubTree(root.right,subroot);
    }




   static class Node{
        int data;
        Node left;
        Node right;


        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    static class BinaryTree {
        int idx = -1;

        public Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {             // Root = null, (No Tree)
                return null;
            }

            Node newNode = new Node(nodes[idx]);

            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }


        public static void inOrder(Node root) {              // L - Root - R
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        public static void preOrder(Node root) {             // Root - L - R
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void postOrder(Node root) {            // L - R - Root
            if (root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");

        }


        public static void levelOrder(Node root) {
            if (root == null) {
                System.out.println("Empty Tree");
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);        // New Line

            while (!q.isEmpty()) {
                Node curr = q.remove();

                if (curr == null) {
                    System.out.println();

                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                }

                else {
                    System.out.print(curr.data + " ");

                    if (curr.left != null) {
                        q.add(curr.left);
                    }

                    if (curr.right != null) {
                        q.add(curr.right);
                    }
                }

            }
        }


        public static int height(Node root) {
            if (root == null) {
                return 0;
            }

            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }

        public static int countOfNodes(Node root) {
            if (root == null) {
                return 0;
            }

            int leftNodes = countOfNodes(root.left);
            int rightNodes = countOfNodes(root.right);
            return leftNodes + rightNodes + 1;
        }


        public static int sumOfNodes(Node root) {
            if (root == null) {
                return 0;
            }

            int leftSum = sumOfNodes(root.left);
            int rightSum = sumOfNodes(root.right);
            return leftSum + rightSum + root.data;
        }


        public static int diameter(Node root) {
            if (root == null) {
                return 0;
            }

            int diamFull = height(root.left) + height(root.right) + 1;
            int diamLeft = diameter(root.left);
            int diamRight = diameter(root.right);

            return Math.max(diamFull, Math.max(diamLeft, diamRight));
        }



    }



        static class TreeInfo{

            int ht;
            int diam;

            TreeInfo(int ht,int diam){
                this.ht = ht;
                this.diam = diam;
            }

            public static TreeInfo diameterInfo(Node root){
                if (root == null){
                    return new TreeInfo(0,0);
                }

               TreeInfo left = diameterInfo(root.left);
               TreeInfo right = diameterInfo(root.right);
               int myHeight = Math.max(left.ht,right.ht) + 1;

                int diamFull = left.ht + right.ht + 1;
                int diamLeft = left.diam;
                int diamRight = right.diam;
                int myDiameter = Math.max(diamFull,Math.max(diamLeft, diamRight));

                return new TreeInfo(myHeight,myDiameter);
            }
        }





    public static void main(String[] args){

        int nodes[] = {9,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);
        System.out.print("Root Data = "+root.data);      // Value of Root Data = 0 Index Value
        System.out.println();


        System.out.print("In Order    =  ");            // L - Root - R
        tree.inOrder(root);
        System.out.println();

        System.out.print("Pre Order   =  ");            // Root - L - R
        tree.preOrder(root);
        System.out.println();

        System.out.print("Post Order  =  ");            // L - R - Root
        tree.postOrder(root);
        System.out.println();

        System.out.println();
        System.out.println("Level Order : ");            // Level Order
        tree.levelOrder(root);
        System.out.println();

        System.out.print("Tree Height = ");             // Tree Height
        System.out.println(tree.height(root));

        System.out.print("Tree Node Count = ");         // Tree Node Count
        System.out.println(tree.countOfNodes(root));

        System.out.print("Tree Sum of Nodes = ");       // Tree Sum of Nodes
        System.out.println(tree.sumOfNodes(root));

        System.out.print("Tree Diameter = ");           // Tree Diameter
        System.out.println(tree.diameter(root));

        System.out.print("Tree Info : Diameter & Height = ");           // Tree Info : Diameter & Height =
        System.out.println(TreeInfo.diameterInfo(root).diam);




        // Subtree or Not
        Binary_Tree mainRoot = new Binary_Tree(3);      // Main Root
        mainRoot.left = new Binary_Tree(4);
        mainRoot.right = new Binary_Tree(5);
        mainRoot.left.left = new Binary_Tree(1);
        mainRoot.left.right = new Binary_Tree(2);

        Binary_Tree subRoot = new Binary_Tree(4);       // Sub Root
        subRoot.left = new Binary_Tree(1);
        subRoot.right = new Binary_Tree(2);

        boolean ans = isSubTree(mainRoot,subRoot);
        System.out.print("SubTree = "+ans);


   }


}
