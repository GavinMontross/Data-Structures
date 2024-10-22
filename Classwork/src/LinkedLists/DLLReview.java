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
    DLL(){
        this.head = null;
        this.tail = null;
    }
    public void add(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public void delete(int data){
        if (head == null){
            System.out.println("This list is empty");
            return;
        }
        Node current = head;
        while(current != null && current.val != data){
            current = current.next;
        }
        if (current != null){
            current.prev.next = current.next;
            return;
        }
        else{
            System.out.println("Node with data: " + data + " not in list");
        }
    }
    public void insertAfter(int beforeData, int insertVal){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while (current != null && current.val != beforeData){
            current= current.next;
        }
        if (current != null){
            Node newNode = new Node(insertVal);
            newNode.next = current.next;
            newNode.prev = current;
            current.next = newNode;
        }
    }

}
public class DLLReview {
    
}
