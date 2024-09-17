package LinkedLists;

import java.util.ArrayList;

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

public void delete(int data){       //Checks for this case: Does it exist? is it the head? is it the last node? otherwise...
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

public void reverse(){
    if (head == null){
        System.out.println("List is empty. ");
    }
    Node current = head;
    Node prev = null;
    while(current != null){
        Node temp = current.next;
        current.next = prev;
        prev = current;
        current = temp;
    }
    head = prev;
}
public void deleteBefore(int data){
    if(head == null){
        System.out.println("List does not exist. ");
        return;
    }
    if(head.data == data){
        System.out.println("There is no data to delete before " + head);
    }
    if (head.next != null && head.next.data == data) {
        head = head.next;
        return;
    }
    Node current = head;
    while(current.next != null && current.next.next != null && current.next.next.data != data){
        current = current.next;
    }
    if(current.next != null){
        current.next = current.next.next;
    }
    else{
        System.out.println("Element not found.");
    }
}
public void displayInReverse(){
    ArrayList<Node> myList = new ArrayList<>();
    Node current = head;
    while(current != null){
        myList.add(current);
        current = current.next;
    }
    for (int i = myList.size() - 1; i >=0; i --){
        System.out.print(myList.get(i).data + " -> ");
    }
    System.out.println("null");

}
}

