package Trees;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right; 
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode right, TreeNode left){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class Learning {
    public static int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }
    public static void printTree(TreeNode root){
        if (root == null){
            return;
        }
        printTree(root.left);
        System.out.println(root.val + " ");
        printTree(root.right);
    }
    public static boolean searchBinaryTree(TreeNode root, int value){
        if (root == null){
            return false;
        }
        if (root.val == value){
            return true;
        }
        if (value > root.val){
            return searchBinaryTree(root.right, value);
        }
        else{
            return searchBinaryTree(root.left, value);
        }
    }
    public static TreeNode insertBinaryTree(TreeNode root, int value) {
        // If the current node is null, create a new TreeNode with the value
        if (searchBinaryTree(root, value)){
            System.out.println(value + " already in tree.");
            return root;
        }
        if (root == null) {
            return new TreeNode(value);
        }
    
        // Compare the value with the current node's value
        if (value < root.val) {
            // Recur on the left subtree
            root.left = insertBinaryTree(root.left, value);
        } else {
            // Recur on the right subtree
            root.right = insertBinaryTree(root.right, value);
        }
        // Return the unchanged node pointer
        return root;
    }
    public static void main(String args[]){
        // Create individual nodes
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);

        // Link nodes to form the tree
        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node2.right = node5;

        printTree(root);
        TreeNode binaryRoot = new TreeNode(3);
        insertBinaryTree(binaryRoot, 2);
        insertBinaryTree(binaryRoot, 6);
        insertBinaryTree(binaryRoot, 10);
        insertBinaryTree(binaryRoot, 5);
        insertBinaryTree(binaryRoot, 1);
        insertBinaryTree(binaryRoot, 10);
        System.out.println("Printing Binary Tree: ");
        printTree(binaryRoot);


    }
}
