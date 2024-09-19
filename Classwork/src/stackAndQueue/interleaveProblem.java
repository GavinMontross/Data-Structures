package stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class interleaveProblem {
    public static void interleave(Queue<Integer> starterqueue){
        int mid = starterqueue.size()/2;
        Queue<Integer> queue = new LinkedList<>(starterqueue);
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < mid; i ++){
            queue.add(queue.remove()); //5,6,7,8,1,2,3,4
        }
        for(int i = 0; i < mid; i ++){
            stack.push(queue.remove()); //8,7,6,5  1,2,3,4
        }
        for(int i = 0; i < stack.size(); i ++){
            stack.push(stack.pop());    //5,6,7,8   1,2,3,4
        }
        for(int i = 0; i < queue.size(); i ++){

        }
    }
}
