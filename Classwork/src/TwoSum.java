// Data Structures 
// August 27, 2024
// Reviewing Java
import java.util.Arrays;
public class TwoSum {
    public static int[] twoSum(int[] nums, int target){
        for(int i = 0; i < nums.length; i ++){
            for(int j = i+1; j < nums.length; j ++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[0];
    }
    public static void main(String[] args) {
        int[] checks = {1,2,3,4,5,6,7};
        System.out.println("The two indicies that add up to 12 are: " + Arrays.toString(twoSum(checks, 12)));
    }
}
