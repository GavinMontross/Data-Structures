//Defines the doubly linked list structure
// Contains methods for insert, delete and display

public class DLL {
    private DLLNode head;
    private DLLNode tail;

    public DLL() {
        head = null;
        tail = null;
    }

    // Insertion at the end of the doubly linked list
    public void insert(int data) {
        DLLNode newNode = new DLLNode(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    //  Insert a new node before a specific node
    public void insertBefore(int beforeData, int newData)
    {
        //WRITE YOUR CODE HERE
        return;
    }

    // Insert at the beginning of the linked list
    public void insertAtHead(int Data)
    {
        //WRITE YOUR CODE HERE
        return;
    }



    // Deletion of a node with a specific value
    public void delete(int data) {
        DLLNode current = head;
        while (current != null) {
            if (current.data == data) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }

                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }

                return; // Node found and deleted
            }
            current = current.next;
        }
    }

    // Display the doubly linked list in both forward and backward directions
    public void printEntireList(){
        DLLNode current = head;
        System.out.print("Forward: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();

        current = tail;
        System.out.print("Backward: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

}