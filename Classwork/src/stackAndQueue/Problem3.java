package stackAndQueue;

import java.util.Queue;
import java.util.Arrays;
import java.util.LinkedList;

public class Problem3 {
    public static void interleave(Queue<Integer> queue){ // 10, 20, 30, 40, 50, 60, 70, 80
        Queue<Integer> tempQueue = new LinkedList<>(queue);
        int mid = queue.size()/2;
        for(int i = 0; i < mid; i ++){
            tempQueue.add(tempQueue.remove());  // 50, 60, 70, 80, 10, 20, 30, 40
        }
        Queue<Integer> queue2 = new LinkedList<>();
        for(int i = 0; i < mid; i ++){
            queue2.add(tempQueue.remove());     //Q2: 50,60,70,80 Q1: 10,20,30,40
        }
        while(!queue.isEmpty()){
            queue.remove();
        }
        for(int i = 0; i < mid; i ++){
            queue.add(tempQueue.remove());
            queue.add(queue2.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(10,20,30,40,50,60,70,80));
        interleave(queue);
        System.out.println(queue);
    }
}
