package DoubleLinkedLists;

public class Node {
    Node next;
    Node prev;
    int data;
    Node(int data){
        this.data = data;
        next = null;
        prev = null;
    }
}
