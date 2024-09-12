import java.util.LinkedList;
import java.util.Iterator;
public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.addFirst(5);
        list.addLast(40);
        int firstElement = list.getFirst();

        //Traversing LinkedList with iterator
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer element = iterator.next();
            System.out.println(element);
        }
    }
}
