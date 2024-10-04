// Data Structures Assignment 3 - Recursion

public class RecursionMain {
    // Task 1: Find out if word is palindrome or not:
    public static boolean isPalindrome(String word, int index){
        word = word.toLowerCase();
        word = word.trim();
        int size = word.length();
        if(index >= size/2){
            return true;
        }
        if(word.charAt(index) != word.charAt(size-index-1)){
            return false;
        }
        return isPalindrome(word, index+1);
    }

    // Task 2: Binary Search (returns first instance of target):
    public static int firstBinarySearch(int[] arr, int target, int left, int right){
        if (left > right) {
            return -1; // target not found
        }
        int mid = (right + left) / 2;
        if (arr[mid] == target) {
            // Check if it's the first instance
            if (mid == 0 || arr[mid - 1] != target) {
                return mid;
            } else {
                return firstBinarySearch(arr, target, left, mid - 1);
            }
        } else if (arr[mid] > target) {
            return firstBinarySearch(arr, target, left, mid - 1);
        } else {
            return firstBinarySearch(arr, target, mid + 1, right);
        }
    }

    public static void main(String[] args) {
        // Testing isPalindrome:
        System.out.println("Palindrome Tests: ");
        System.out.println(isPalindrome("?kAYaK?", 0)); // output should be true
        System.out.println(isPalindrome("word", 0)); // output should be false
        System.out.println(isPalindrome("", 0)); // output should be true

        // Testing firstBinarySearch:
        System.out.println("\n" + "FirstBinarySearch Tests: ");
        int[] arr1 = {1, 2, 2, 3, 4, 5};
        int target1 = 2;
        System.out.println(firstBinarySearch(arr1, target1, 0, arr1.length - 1)); // Expected output: 1
        int[] arr2 = {2, 2, 2, 2, 2, 2};
        int target2 = 2;
        System.out.println(firstBinarySearch(arr2, target2, 0, arr2.length - 1)); // Expected output: 0
        int[] arr3 = {1, 2, 2, 3, 4, 5};
        int target3 = 6;
        System.out.println(firstBinarySearch(arr3, target3, 0, arr3.length - 1)); // Expected output: -1
    }  
}
