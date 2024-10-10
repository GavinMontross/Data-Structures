package LinkedLists;

class Node {
    int val;
    Node prev;
    Node next;
    Node(int val){
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}
class DLL {
    Node head;
    Node tail;
    DLL() {
        this.head = null;
        this.tail = null;
    }
    public void add(int value){
        if (head == null){
            Node newNode = new Node(value);
            head = newNode;
            tail = newNode;
        }
        else {
            Node newNode = new Node(value);
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public void delete(int value){
        if (head == null){
            System.out.println("List is empty. ");
            return;
        }
        Node current = head;
        while (current != null && current.val != value){
            current = current.next;
        }
        if (current != null) {
            current.prev.next = current.next;
        }
        else{
            System.out.println("Node with value " + value + " is not present in this list.");
        }
    }
    public void insertBefore(int beforeData, int value){
        Node newNode = new Node(value);
        Node current = head;
        if (head.val == beforeData){
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        while(current != null && current.next.val != beforeData){
            current = current.next;}
            if (current != null){
                newNode.next = current.next;
                newNode.prev = current;
                current.next = newNode;
            }
            else {
                System.out.println("Node with data " + beforeData + " not found.");
            }
    }
}
public class DLLReview {
    
}
