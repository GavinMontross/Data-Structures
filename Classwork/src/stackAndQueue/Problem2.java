package stackAndQueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Problem2 {
    public static boolean isPalindrome(Queue<Integer> queue){ // 1,2,3,4,5
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> tempQueue = new LinkedList<>(queue);
        for(int i = 0; i < queue.size(); i ++){
            stack.push(tempQueue.remove());  // 5,4,3,2,1
        }
        for(Integer element : queue){
            if (element != stack.pop()){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Queue<Integer> queue1 = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        Queue<Integer> queue2 = new LinkedList<>(Arrays.asList(1,2,3,2,1));
        System.out.println(isPalindrome(queue1));
        System.out.println(isPalindrome(queue2));
        
    }
}
