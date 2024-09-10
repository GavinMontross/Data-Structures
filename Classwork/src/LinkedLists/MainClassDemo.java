package LinkedLists;

public class MainClassDemo {
    public static void main(String[] args) {
        SinglyLinkedList SLL = new SinglyLinkedList();
        
        // Insert Elements
        SLL.insertAtEnd(10);
        SLL.insertAtEnd(20);
        SLL.insertAtEnd(30);
        SLL.display();

        SLL.insertAfter(20, 25);
        SLL.display();
        System.out.println(SLL.totalNodes());
    }
}
