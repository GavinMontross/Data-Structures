import java.util.*;
public class Sorting {
    public static int linear(int[] array, int target){
        for(int i = 0; i < array.length; i++){
            if(array[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static int binary(int[] array, int target){
        int low = 0;
        int high = array.length - 1;
        while(low <= high){
            int mid = (high+low)/2;
            if(array[mid] == target){
                return mid;
            }
            else if(array[mid] < target){
                low = mid+1;
            }
            else{
                high = mid+1;
            }
        }
        return -1;
    }
    public static int[] selectionSort(int[] array){
        int length = array.length;
        int min_index = -1;
        for(int i = 0; i < length-1; i++){
            min_index = i;
            for(int j = min_index+1; j<length;j++){
                if(array[j] < array[min_index]){
                    min_index = j;
                }
            }
            int temp = array[i];
            array[i] = array[min_index];
            array[min_index] = temp;
        }
        return array;
    }
    public static void main(String[] args) {
        int[] check = {1,2,3,4,4,5,6,7,8};
        int[] sort = {1,2,3,2,1,3,4,5,6};
        System.out.println("Linear search for 6: " + linear(check, 6));
        System.out.println("Binary Search for 6: " + linear(check, 6));
        System.out.println("Selection sort: " + Arrays.toString(selectionSort(sort)));
    }

}
