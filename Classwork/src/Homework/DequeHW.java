package Homework;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DequeHW {
    public static void reverseSecondHalf(Queue<Integer> queue){ 
        int mid = queue.size()/2;
        Deque<Integer> deque = new LinkedList<>();
        for(int i = 0; i < mid; i ++){
            queue.add(queue.remove());
            deque.addLast(queue.remove()); //DQ: 50,60,70,80
        }
        for(int i = 0; i < mid; i ++){
            queue.add(deque.removeLast());
        }
        }
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>(Arrays.asList(10,20,30,40,50,60,70,80));
        System.out.println("Before reversal: " + deque);
        reverseSecondHalf(deque);
        System.out.println("After reversal: " + deque);
    }
}
