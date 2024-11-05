
import java.util.Arrays;

public class quickSortPrac {
    public static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length-1);
    }
    private static void quickSort(int[] arr, int first, int last){
        if(first < last){
            int pivIndex = partition(arr, first, last);
            quickSort(arr, first, pivIndex-1);
            quickSort(arr, pivIndex+1, last);
        }
    }
    private static int partition(int[] arr, int first, int last){
        int pivot = arr[first];
        int up = first;
        int down = last;
        do{
            while(up < last && pivot >= arr[up]){
                up++;
            }
            while (pivot < arr[down]){
                down--;
            }
            if(up < down){
                swap(arr, up, down);
            }
        }
        while(up < down);
        swap(arr, first, down);
        return down;
}
    private static void swap(int[] arr, int num1, int num2){
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {7,6,5,87,4,3,56,3,2,1,-1};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

