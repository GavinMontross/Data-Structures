package Trees;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {};
    TreeNode (int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.right = right;
        this.left = left;
    }
}
public class BST {
    public static TreeNode insert(TreeNode root, int value){
        if (root == null){
            TreeNode newNode = new TreeNode(value);
            return newNode;
        }
        if (value > root.val){
            root.right = insert(root.right, value);
        }
        else {
            root.left = insert(root.left, value);
        }
        return root;
    }

    public static void printTreeInorder(TreeNode root){
        if (root == null){
            return;
        }
        printTreeInorder(root.left);
        System.out.print(root.val+ " ");
        printTreeInorder(root.right);
    }
    public static void printTreePreorder(TreeNode root){
        if (root == null){
            return;
        }
        System.out.print(root.val + " ");
        printTreePreorder(root.left);
        printTreePreorder(root.right);
    }
    public static void printTreePostorder(TreeNode root) {
        if (root == null){
            return;
        }
        printTreePostorder(root.left);
        printTreePostorder(root.right);
        System.out.println(root.val + " ");
    }

    public static TreeNode searchBST(TreeNode root, int val){
        if (root == null){
            System.out.println("Node not found. ");
            return root;
        }
        if (root.val == val){
            System.out.print("Node found: " + root.val);
            System.out.println();
            return root;
        }
        if (val > root.val){
            return searchBST(root.right, val);
        }
        else{
            return searchBST(root.left, val);
        }

    }
    public static int getHeight(TreeNode root){
        if (root == null){
            return 0;
        }
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }
    
    public static TreeNode delete(TreeNode root, int val) {
        if (root == null) {
            System.out.println("Node with value " + val + " not found");
            return root;
        }
    
        if (val < root.val) {
            // Traverse the left subtree
            root.left = delete(root.left, val);
        } else if (val > root.val) {
            // Traverse the right subtree
            root.right = delete(root.right, val);
        } else {
            // Node found - handle deletion
            // Case 1: No children (leaf node)
            if (root.left == null && root.right == null) {
                return null;
            }
            // Case 2: One child
            else if (root.right == null) {
                return root.left;
            } else if (root.left == null) {
                return root.right;
            }
            // Case 3: Two children
            else {
                TreeNode replacement = findMin(root.right);
                root.val = replacement.val;
                root.right = delete(root.right, replacement.val); // Delete the successor
            }
        }
        
        return root; // Don't forget to return the root to update parent references
    }
    
    public static TreeNode findMin(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        insert(root, 5);
        insert(root, 3);
        insert(root, 7);
        insert(root, 1);
        insert(root, 4);
        insert(root, 20);
        insert(root, 15);
        insert(root, 25);
        System.out.println("in-order:");
        printTreeInorder(root);
        System.out.println("\n"+ "pre-order:");
        printTreePreorder(root);
        System.out.println("\n"+ "post-order:");
        printTreePostorder(root);
        insert(root, 5);
        delete(root,20);
        System.out.println();
        printTreeInorder(root);
       
    }
}
