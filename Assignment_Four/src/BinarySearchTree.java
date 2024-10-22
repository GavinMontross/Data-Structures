// BinarySearchTree.java
/*
* The BinarySearchTree class manages all BST operations,
* including insertion, deletion, various traversals,
* height calculation, leaf node counting, and
* level-wise traversal.
* */
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    // Root of the BST
    private Node root;

    // Constructor to initialize the BST
    public BinarySearchTree() {
        root = null;
    }

    // ==========================
    // 1. Insertion
    // ==========================

    // Public method to insert a new key
    public void insert(int key) {
        root = insertRec(root, key);
    }

    // Recursive method to insert a new key in the BST
    private Node insertRec(Node root, int key) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new Node(key);
            return root;
        }

        // Otherwise, recur down the tree
        if (key < root.data)
            root.left = insertRec(root.left, key);
        else if (key > root.data)
            root.right = insertRec(root.right, key);
        // Duplicate keys are not allowed in BST
        return root;
    }

    // ==========================
    // 3. Searching
    // ==========================

    // Searching with In-order Traversal (Left, Root, Right)
    public void searchBST(int value) {
        if(inorderSearchValue(root,value))
            System.out.println(value+" is found");
        else
            System.out.println(value+" is not found");
    }

    private boolean inorderSearchValue(Node root, int value) {
        if (root != null) {
            if (root.data == value)
                return true;
            if(inorderSearchValue(root.left,value)||inorderSearchValue(root.right, value))
                return true;
        }
        return false;
    }

    // ==========================
    // 4. Deletion
    // ==========================

    // Public method to delete a key from BST
    public void deleteKey(int key) {
        root = deleteRec(root, key);
    }

    // Recursive method to delete a key from BST
    private Node deleteRec(Node root, int key) {
        //WRITE YOUR CODE HERE

        return root;
    }


    // ==========================
    // 2. Traversals
    // ==========================

    // In-order Traversal (Left, Root, Right)
    public void inorderTraversal() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    // Pre-order Traversal (Root, Left, Right)
    public void preorderTraversal() {
        preorderRec(root);
        System.out.println();
    }

    private void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    // Post-order Traversal (Left, Right, Root)
    public void postorderTraversal() {
        postorderRec(root);
        System.out.println();
    }

    private void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data + " ");
        }
    }


    // ==========================
    // 5. Subtree size print
    // ==========================

    public void printSubtreeSize() {
        System.out.println("Printing subtree size for each node in BST");
        //WRITE NECESSARY CODES
        return;
    }

    // ==========================
    // 6. Height Calculation
    // ==========================

    public int height() {
        return heightRec(root);
    }

    private int heightRec(Node root) {
        //WRITE YOUR CODE HERE
        return 0; //you can change it to other value
    }

    // ==========================
    // 6. Leaf Node Counting and Printing
    // ==========================

    public int countLeafNodes() {
        return countLeafRec(root);
    }

    private int countLeafRec(Node root) {
        //WRITE YOUR CODE HERE
        return 0; //you can change it to other value
    }

    // ==========================
    // 7. Level-wise Traversal-Extra Credit
    // ==========================

    public void levelOrderTraversal() {
        //WRITE YOUR CODE HERE
        return;
    }

    // ==========================
    // 7. Utility Methods (Optional)
    // ==========================

    // Method to check if the tree is empty
    public boolean isEmpty() {
        return root == null;
    }
}
