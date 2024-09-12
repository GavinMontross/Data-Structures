package Homework;

/*Sample code for Singly Linked List using Java*/
/*Using only basic java class and objects*/
/* CIS 2168, Temple University */
class SNode {
    int data; // The value stored in the node
    SNode next; // Pointer to the next node
    SNode(int data) {
    this.data = data; // Initialize the node with data
    this.next = null; // Set next to null by default
    }
    }
    class SinglyLinkedList {
    SNode head; // Head of the singly linked list
    SinglyLinkedList() {
    head = null; // Initialize an empty list
    }
    // Insert at the end of the list
    public void insertAtEnd(int data) {
    SNode newNode = new SNode(data);
    if (head == null) {
    head = newNode; // If list is empty, new node is the head
    } else {
    SNode current = head;
    while (current.next != null) {
    current = current.next;
    }
    current.next = newNode; // Append the new node to the end
    }
    }
    // Insert a new node after a specific node
    public void insertAfter(int afterData, int newData) {
    SNode current = head;
    while (current != null && current.data != afterData) {
    current = current.next;
    }
    if (current != null) {
    SNode newNode = new SNode(newData);
    newNode.next = current.next;
    current.next = newNode; // Insert the new node after the current node
    } else {
    System.out.println("Node with data " + afterData + " not found.");
    }
    }
    // Insert a new node at the front of the list
    public void insertAtFront(int newData) {
    //WRITE YOUR CODE HERE
    return;
    }
    // Insert a new node before a specific node

    // Homework Task 1:
    public void insertBefore(int beforeData, int newData) {
    if(head == null){
        System.out.println("List is empty.");
        return;
    }
    if(head.data == beforeData){
        SNode newNode = new SNode(newData);
        newNode.next = head;
        head = newNode;
        return;
    }
    SNode current = head;
    while(current.next != null && current.next.data != beforeData){
        current = current.next;
    }
    if(current.next != null){
        SNode newNode = new SNode(newData);
        newNode.next = current.next;
        current.next = newNode;
    }
    else{
        System.out.println("Node with data " + beforeData + " could not be found");
    }
    return;
    }


    // Delete a specific node by value
    public void delete(int data) {
    if (head == null) {
    System.out.println("List is empty.");
    return;
    }
    if (head.data == data) { // If the node to delete is the head
    head = head.next; // Move the head to the next node
    return;
    }
    SNode current = head;
    while (current.next != null && current.next.data != data) {
    current = current.next;
    }
    if (current.next != null) {
    current.next = current.next.next; // Skip the node to delete
    } else {
    System.out.println("Node with data " + data + " not found.");
    }
    }
    // Delete the node after a specific node

    // Homework Task 2: 
    public void deleteAfter(int afterData) {
        if(head == null){
            System.out.println("List is empty. ");
            return;
        }
    SNode current = head;
    while(current != null && current.data != afterData){
        current = current.next;
    }
    if (current != null && current.next != null) {
        current.next = current.next.next; 
    } else if (current == null) {
        System.out.println("Node with data " + afterData + " could not be found.");
    } else {
        System.out.println("Node with data " + afterData + " has no next node to delete.");
    }
    return;
    }


    // Display the list
    public void display() {
    if (head == null) {
    System.out.println("List is empty.");
    return;
    }
    SNode current = head;
    while (current != null) {
    System.out.print(current.data + " -> ");
    current = current.next;
    }
    System.out.println("null");
    }
    // count the number of nodes in the list
    public int totalNodes() {
    int total = 0;
    //WRITE YOUR CODE HERE
    return total;
    }
    }
    public class MainClassDemo {
    public static void main(String[] args) {
    SinglyLinkedList SLL = new SinglyLinkedList();
    // Insert some elements
    SLL.insertAtEnd(10);
    SLL.insertAtEnd(20);
    SLL.insertAtEnd(30);
    System.out.print("Initial List: ");
    SLL.display(); // Output: 10 -> 20 -> 30 -> null
    // Insert before
    System.out.print("Inserting 15 before 20: ");
    SLL.insertBefore(20, 15);
    SLL.display();
    // Delete after a specific node
    System.out.print("Deleting node after 10: ");
    SLL.deleteAfter(10);
    SLL.display(); // Output: 10 -> 30 -> null
    //insertAtFront(90); //add 90 as head
    // System.out.println("Total nodes in the list: "+totalNodes);
    }
    }
