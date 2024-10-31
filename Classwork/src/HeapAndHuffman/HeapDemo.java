package HeapAndHuffman;
import java.util.PriorityQueue;

public class HeapDemo {
    public static void main(String[] args) {
        // Create a PriorityQueue (Min-Heap)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add elements to the heap
        minHeap.add(10);
        minHeap.add(4);
        minHeap.add(15);
        minHeap.add(20);
        minHeap.add(0);

        // Display the heap
        System.out.println("Heap: " + minHeap);

        // Peek at the smallest element
        System.out.println("Peek: " + minHeap.peek());

        // Remove elements from the heap
        System.out.println("Remove: " + minHeap.poll());
        System.out.println("Heap after removal: " + minHeap);

        // Check if the heap contains an element
        System.out.println("Contains 15? " + minHeap.contains(15));
    }
}