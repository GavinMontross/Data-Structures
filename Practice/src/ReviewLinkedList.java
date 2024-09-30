public class ReviewLinkedList {
    
}

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    Node head;
    LinkedList(){
        head = null;
    }
    public void add(int data){
        if (head == null){
            head = new Node(data);
    }
    else{
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(data);
    }
    }
    public void remove(int data){
        if (head == null){
            return;
        }
        if (head.data == data){
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            if (temp.next.data == data){
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }
}


