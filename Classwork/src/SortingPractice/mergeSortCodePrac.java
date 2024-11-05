
import java.util.Arrays;

public class mergeSortCodePrac {
    public static void mergeSort(int[] arr){
        if (arr.length > 1){
            int mid = arr.length/2;
            int[] left = Arrays.copyOfRange(arr, 0, mid);
            int[] right = Arrays.copyOfRange(arr, mid, arr.length);

            mergeSort(left);
            mergeSort(right);

            int[] merged = mergeTwoArrays(left, right);
            System.arraycopy(merged, 0, arr, 0, merged.length);
        }
    }
    public static int[] mergeTwoArrays(int[] arr1, int[] arr2){
        int length = arr1.length + arr2.length;
        int[] output = new int[length];
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                output[k++] = arr1[i++];
            }
            else{
                output[k++] = arr2[j++];
            }
        }
        while (i < arr1.length){
            output[k++] = arr1[i++];
        }
        while (j < arr2.length){
            output[k++] = arr2[j++];
        }
        return output;
    }
    public static void main(String[] args) {
        int[] array = {20,10,1,2,3,6,4,3,8,6,5,9,23};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}
