package LinkedLists;

public class SinglyLinkedList {
    Node head;

    SinglyLinkedList() {
        head = null;
    }


public void display(){
    if(head == null){
        System.out.println("List is empty");
        return;
    }
    Node current = head;
    while(current != null){
        System.out.print(current.data + " -> ");
        current = current.next;
    }
    System.out.println("null");
}


public int totalNodes() {
    int total = 0;
    Node current = head;
    while(current != null){
        total ++;
        current = current.next;
    }
    return total;
}

public void insertAtEnd(int data){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
    }
    else{
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }
}

public void insertAfter(int afterData, int newData){
    Node current = head;
    while(current != null && current.data != afterData){
        current = current.next;
    }
    if(current != null){
        Node newNode = new Node(newData);
        newNode.next = current.next;
        current.next = newNode;
    }
    else{
        System.out.println("Node with data " + afterData + " not found.");
    }
}

public void insertAtFront(int data) {
    Node newNode = new Node(data);
    if (head == null){
        newNode = head;
    }
    else{
        newNode.next = head;
        head = newNode;
    }}
    
public void insertBefore(int beforeData, int newData) {
    Node current = head;
    while(current != null && current.next != null && current.next.data != beforeData){
        current = current.next;
    }
    if (current != null && current.next != null){
        Node newNode = new Node(newData);
        newNode.next = current.next;
        current.next = newNode;
    }
    else{
        System.out.println("Node with data " + beforeData + " could not be found.");
    }
}

public void delete(int data){
    if (head == null){
        System.out.println("List is empty.");
        return;
    }
    if (head.data == data){
        head = head.next;
        return;
    }
    Node current = head;
    while(current != null && current.next.data != data){
        current = current.next;}
        if(current.next != null){
            current.next = current.next.next;
        }
        else{
            System.out.println("Node with data " + data + "could not be found.");
    }
    }

public void deleteAfter(int afterData){
    Node current = head;
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
}
}

