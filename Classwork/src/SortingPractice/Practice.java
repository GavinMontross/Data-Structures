import java.util.Arrays;

public class Practice {
    public static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i-1;
            while (j >= 0 && key < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++){
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    public static void mergeSort(int[] arr){
        if (arr.length > 1) {
            int mid = arr.length / 2;

            int[] left = Arrays.copyOfRange(arr, 0, mid);
            int[] right = Arrays.copyOfRange(arr, mid, arr.length);

            mergeSort(left);
            mergeSort(right);

            int[] merged = twoSortedArrays(left, right);
            System.arraycopy(merged, 0, arr, 0, merged.length);
        }
    }
    public static int[] twoSortedArrays(int[] nums1, int[] nums2){
        int length = nums1.length + nums2.length;
        int[] output = new int[length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < nums1.length && j < nums2.length){
            if (nums1[i] < nums2[j]){
                output[k++] = nums1[i++];
            }
            else{
                output[k++] = nums2[j++];
            }
        }
        while (i<nums1.length){
            output[k++] = nums1[i++];
        }
        while(j<nums2.length){
            output[k++] = nums2[j++];
        }
        return output;
    }

    public static void main(String args[]){
        int[] arr = {2,4,1,2,7,6,5,3};
        int[] arr2 = {23,1,4,2,3,7,6,5,8};
        insertionSort(arr);
        selectionSort(arr2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = twoSortedArrays(arr, arr2);
        System.out.println(Arrays.toString(arr3));
        int[] arr4 = {1,5,3,2,30,17,6,5,4};
        mergeSort(arr4);
        System.out.println(Arrays.toString(arr4));
    }
}
