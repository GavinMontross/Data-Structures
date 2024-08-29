public class Leetcode_Prac {
    // Returns number of elements that aren't val in nums
    public int removeElement(int[] nums, int val){
        int i = 0;
        for(int x = 0; x < nums.length; x ++){
            if(nums[x] != val){
                nums[i] = nums[x];
                i ++;
            }
        }
        return i;
    }
    // Returns an array with indexes of numbers that add up to target in nums
    public int[] twoSum(int[] nums1, int target){
        for(int i = 0; i < nums1.length; i ++){
            for(int j = i+1; j < nums1.length; j++){
                if(nums1[i] + nums1[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[0];
    }
    
}
