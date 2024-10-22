// Main.java

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        /* Let us create the following BST
                  50
               /     \
              30      70
             /  \    /  \
           20   40  60   80
        */

        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        // In-order Traversal
        System.out.print("In-order Traversal: ");
        bst.inorderTraversal(); // Expected: 20 30 40 50 60 70 80

        // Pre-order Traversal
        System.out.print("Pre-order Traversal: ");
        bst.preorderTraversal(); // Expected: 50 30 20 40 70 60 80

        // Post-order Traversal
        System.out.print("Post-order Traversal: ");
        bst.postorderTraversal(); // Expected: 20 40 30 60 80 70 50

        //Searching in BST
        bst.searchBST(30);
        bst.searchBST(100);
        bst.searchBST(40);

        //Print subtree size
        bst.printSubtreeSize();

        // Level-wise Traversal
//        System.out.print("Level-wise Traversal: ");
//        bst.levelOrderTraversal(); // Expected: 50 30 70 20 40 60 80

        // Calculate Height of BST
        System.out.println("Height of BST: " + bst.height()); // Expected: 2

        // Count and print Leaf Nodes
        System.out.println("Number of Leaf Nodes: " + bst.countLeafNodes()); // Expected: 4

        // Delete a key
        int keyToDelete = 20;
        System.out.println("\nDeleting key: " + keyToDelete);
        bst.deleteKey(keyToDelete);

        // In-order Traversal after deletion
        System.out.print("In-order Traversal after deletion: ");
        bst.inorderTraversal(); // Expected: 30 40 50 60 70 80

        // Recount Leaf Nodes after deletion
        System.out.println("Number of Leaf Nodes after deletion: " + bst.countLeafNodes()); // Expected: 3

        //level Order Traversal: Extra credit
        bst.levelOrderTraversal();

    }
}
