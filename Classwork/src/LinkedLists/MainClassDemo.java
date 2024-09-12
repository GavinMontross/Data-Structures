package LinkedLists;

public class MainClassDemo {
    public static void main(String[] args) {
        SinglyLinkedList SLL = new SinglyLinkedList();
        
        SLL.insertAtEnd(10);
        SLL.insertAtEnd(20);
        SLL.insertAtEnd(30);
        System.out.print("Initial List: ");
        SLL.display();
        System.out.println();

        SLL.insertAfter(20, 25);
        System.out.print("Inserting 25 after 20: ");
        SLL.display();
        System.out.println();
        System.out.print("Current total Nodes: ");
        System.out.println(SLL.totalNodes());
        System.out.println();

        SLL.insertAtFront(5);
        System.out.print("Inserting 5 at the front: ");
        SLL.display();
        System.out.println();

        SLL.insertAtFront(3);
        System.out.print("Inserting 3 at the front: ");
        SLL.display();
        System.out.println();

        SLL.insertBefore(20, 15);
        System.out.print("Inserting 15 before 20: " );
        SLL.display();
        System.out.println();
        SLL.delete(30);
        System.out.print("Deleting 30: ");
        SLL.display();
        System.out.println();
        SLL.deleteAfter(10);
        System.out.print("Deleting after Node with data 10: ");
        SLL.display();
        System.out.println();
        SLL.deleteAfter(20);
        SLL.display();
        SLL.deleteBefore(5);
        SLL.display();
    }
}
