import java.util.Arrays;

public class QuizReview {
    public static int[] twoSum(int[] arr, int target){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 1; j < arr.length; j ++){
                if(arr[i] + arr[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[0];
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(twoSum(arr, 13)));
    }
}
