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

    // Task 3: Traditional Binary Search:
    public static int tradBinarySearch(int[] arr, int target, int left, int right){
        if (left > right){
            return -1;
        }
        int mid = (right + left)/2;
        if(arr[mid] == target){
            return mid;
        }
        else if (arr[mid] > target){
            return tradBinarySearch(arr, target, left, mid - 1);
        }
        else{
            return tradBinarySearch(arr, target, mid + 1, right);
        }
    }

    // Task 4: Check if a number is a power of three:
    public static boolean isPowerOfThree(int number){
        if (number < 1) {
            return false;
        }
        if (number == 1){
            return true;
        }
        if (number % 3 != 0){
            return false;
        }
        return isPowerOfThree(number/3);
    }    

    // Task 5: Compute number x^n
    public static int powerToN(int num, int pow){
        if (pow == 0){
            return 1;
        }
        return num * powerToN(num, pow-1);
    }

    public static void main(String[] args) {

        // Testing isPalindrome:
        System.out.println("Palindrome Tests: ");
        System.out.println(isPalindrome("?kAYaK?", 0)); // Expected output: true
        System.out.println(isPalindrome("word", 0));    // Expected output: false
        System.out.println(isPalindrome("", 0));        // Expected output: true

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

        // Testing tradBinarySearch:
        System.out.println("\n" + "Traditional Binary Search Tests: ");
        // Scenario A: Unsorted Array
        int[] numsA = {5, 2, 9, 1, 5, 6};
        int targetA = 1;
        System.out.println(tradBinarySearch(numsA, targetA, 0, numsA.length - 1)); // Expected output: -1

        // Scenario B: Target Smaller than Any Element
        int[] numsB = {2, 4, 6, 8, 10};
        int targetB = 1;
        System.out.println(tradBinarySearch(numsB, targetB, 0, numsB.length - 1)); // Expected output: -1

        // Scenario C: Target Greater than Any Element
        int[] numsC = {2, 4, 6, 8, 10};
        int targetC = 12;
        System.out.println(tradBinarySearch(numsC, targetC, 0, numsC.length - 1)); // Expected output: -1
        

        // Testing power of three:
        System.out.println("\n" + "Power of Three Tests: ");
        System.out.println(isPowerOfThree(27)); // Expected output: true
        System.out.println(isPowerOfThree(20)); // Expected output: false
        System.out.println(isPowerOfThree(9));  // Expected output: true

        // Testing power to n:
        System.out.println("\n" + "Power to N Tests: ");
        System.out.println(powerToN(2, 3)); // Expected output: 8
        System.out.println(powerToN(5, 3)); // Expected output: 125
        System.out.println(powerToN(3, 3)); // Expected output: 27
    }
}
