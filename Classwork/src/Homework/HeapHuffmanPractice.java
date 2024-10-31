package Homework;
import java.util.*;
public class HeapHuffmanPractice {
    public static void main(String[] args) {
        // Heap Sort 1:
        PriorityQueue<Integer> heap1 = new PriorityQueue<>(Arrays.asList(12, 45, 1, 6, 78, 9, 20, 4, 7, 22, 49, 3));
        List<Integer> heap1sort = new ArrayList<>();
        while (!heap1.isEmpty()){
            heap1sort.add(heap1.poll());
        }
        System.out.println(heap1sort);

        // Heap Sort 2:
        PriorityQueue<Integer> heap2 = new PriorityQueue<>(Arrays.asList(4, 5, 1, 6, 7, 9, 25, 33, 72, 24, 91, 30));
        List<Integer> heap2sort = new ArrayList<>();
        while(!heap2.isEmpty()){
            heap2sort.add(heap2.poll());
        }
        System.out.println(heap2sort);

    }
}
