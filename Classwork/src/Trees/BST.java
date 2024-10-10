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

        public static void printTree(TreeNode root){
            if (root == null){
                return;
            }
            printTree(root.left);
            System.out.println("At node: " + root.val);
            printTree(root.right);
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

        public static void main(String[] args) {
            TreeNode root = new TreeNode(5);
            insert(root, 3);
            insert(root, 2);
            printTree(root);
            insert(root, 5);
            System.out.println(searchBST(root, 5));
            System.out.println(getHeight(root));
        }
    }
