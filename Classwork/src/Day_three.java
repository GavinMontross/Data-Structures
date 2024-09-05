// Data Structures
// September 3, 2024

public class Day_three {
    public static void main(String[] args) {
        // This for loop is O(log n)
        int count = 1;
        int loop_length = 7;
        for(int i = 1; i < loop_length; i *=2){
            System.out.println("Iteration " + count + ": " + "I = " + i);
            count ++;
        }
    }
}
class binarySearchNotes {
    public static int binarySearch(int[] array, int target){
        int low = 0;
        int high = array.length-1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(array[mid] == target){
                return mid;
            }
            else if(array[mid] < target){
                low = mid+1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(arr, 8));
    }
}
