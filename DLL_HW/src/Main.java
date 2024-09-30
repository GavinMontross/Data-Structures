/*Sample code for Singly and Doubly Linked List using Java*/
/*Using only basic java class and objects*/
/* CIS 2168, Section 001, Fall 2023*/

/* Main class*/
public class Main {

    public static void main(String[] args) {

        // Create a new doubly linked list
        DLL myDoublyList = new DLL();

        // Insert elements into the singly linked list
        myDoublyList.insert(1);
        myDoublyList.insert(2);
        myDoublyList.insert(3);
        myDoublyList.insert(4);

        System.out.println("Original Doubly Linked List:");
        myDoublyList.printEntireList(); //1-2-3-4

        // performing delete operation
        myDoublyList.delete(2);

        System.out.println("Doubly Linked List after deleting");
        myDoublyList.printEntireList(); //1-3-4

        //write your code inside the following methods
        //so that you get correct output
        //Use of insertBefore
        myDoublyList.insertBefore(4, 2); //1-3-2-4
        myDoublyList.insertBefore(3, 21); //1-21-3-2-4
        //Use of insertAtHead
        myDoublyList.insertAtHead(12); //12-1-21-3-2-4
        myDoublyList.insertAtHead(14); //14-12-1-21-3-2-4

        System.out.println("Doubly Linked List final");
        myDoublyList.printEntireList(); //14-12-1-21-3-2-4

    }
}
