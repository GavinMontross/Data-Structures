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
            queue.add(queue.remove());   // Moves first half to the end: 50,60,70,80,10,20,30,40
        }
        for(int i = 0; i < mid; i ++){
            deque.addFirst(queue.remove());   // Adds second half to the deque: 80,70,60,50
        }
        while(!deque.isEmpty()){
            queue.add(deque.remove()); 
        }
        }
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>(Arrays.asList(10,20,30,40,50,60,70,80));
        System.out.println("Before reversal: " + deque);
        reverseSecondHalf(deque);
        System.out.println("After reversal: " + deque);
    }
}
