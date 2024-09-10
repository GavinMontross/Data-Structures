package DoubleLinkedLists;

public class DoubleLinkedList {
    Node head;
    Node tail;
    DoubleLinkedList() {
        head = null;
        tail = null;
    }

public void add(int data){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        tail = newNode;
    }
    else {
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
}

public void displayForward() {
    Node current = head;
    while (current != null){
        System.out.print(current.data + " -> ");
        current = current.next;
    }
    System.out.println("null");
}

public void displayBackward() {
    Node current = tail;
    while(current != null) {
        System.out.print(current.data + " -> ");
        current = current.prev;
    }
    System.out.println("null");
}
}

