import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueReview {

    public static void reverseSecondHalf(Queue queue){
        Stack stack = new Stack();
        int size = queue.size();

        for(int i = 0; i < size/2; i ++){
            queue.add(queue.remove());  // 50,60,70,80, 10,20,30,40
        }
        for(int i = 0; i < size/2; i ++){
            stack.push(queue.remove()); // 80,70,60,50
        }
        while (!stack.isEmpty()){
            queue.add(stack.pop());
        }
    }
    public static boolean isPalindrome(Queue queue){
        Stack stack = new Stack();
        Queue tempQueue = new LinkedList(queue);
        while(!tempQueue.isEmpty()){
            stack.push(tempQueue.remove());
        }
        for(Object element : queue){
            if (element != stack.pop()){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(10,20,30,40,50,60,70,80));
        reverseSecondHalf(queue);
        System.out.println(queue);
        Queue<Integer> palindrome = new LinkedList<>(Arrays.asList(1,2,3,4,5,4,3,2,1));
        System.out.println(isPalindrome(palindrome));
    }
}
