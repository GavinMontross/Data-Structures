package stackAndQueue;

import java.util.LinkedList;
import java.util.Deque;

public class myDeque {
    // double-ended queue, same as queu but can do everything from both ends
    public static void main(String[] args) {
        Deque<Integer> myList = new LinkedList<>();
        myList.push(10);
        myList.push(20);
        myList.push(30);
        myList.offerFirst(5);
        myList.offerLast(40);

    }
}
