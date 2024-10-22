/*
The Node class represents each node in the BST.
int data: Stores the value of the node.
Node left, right: References to the left and
right child nodes.
*/
public class Node {
    int data;
    Node left, right;

    // Constructor to create a new node
    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}
