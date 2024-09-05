// Data Structures  
// September 5, 2024

import java.util.ArrayList;
import java.util.List;
public class Day_four {
    public static void main(String args[]){
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(0, 20);
        myList.add(1, 40);
        myList.add(1,30);
        // If add function is used without index, it will be added to the end.
        myList.add(5);
        myList.sort(null);
        System.out.println(myList);
        myList.remove(myList.indexOf(30));
        System.out.println("Removing index 1... ");
        System.out.println(myList);

        // Loop to traverse list:
        int sum = 0;
        for(int i : myList){
            sum += i;
        }


        int[] newList = new int[myList.size()];
        for(int i = 0; i < myList.size(); i ++){
            newList[i] = myList.get(i);
        }
        for(int i = 0; i < newList.length; i ++){
            System.out.println(newList[i]);
        }
    }
}
