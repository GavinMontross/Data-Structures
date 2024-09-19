package stackAndQueue;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Problem1 {
    public static void reverseSecondHalf(Queue<Integer> queue){  // 10, 20, 30, 40, 50, 60, 70, 80
        Stack<Integer> stack = new Stack<>();
        int mid = queue.size()/2;
        for(int i = 0; i <mid; i ++){
            queue.add(queue.remove());  // 50, 60, 70, 80, 10, 20, 30, 40
        }
        for(int i = 0; i < mid; i ++){
            stack.push(queue.remove()); //Q: 10,20,30,40  S: 80,70,60,50
        }
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(10,20,30,40,50,60,70,80));
        System.out.println("Queue before reversal: " + queue);
        reverseSecondHalf(queue);
        System.out.println("Queue after reversal: " + queue);
    }
}
