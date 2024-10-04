package Recursion;

public class PalindromeProblem {
    public  static boolean findPalindrome(String str, int index){
        int size = str.length();
        if (index >= size/2){
            return true;
        }
        if (str.charAt(index) != str.charAt(size-index-1)){
            return false;
        }
        return (findPalindrome(str, index+1));
    }
    public static void main(String[] args) {
         // Test Case 1: Empty string (Edge case)
         System.out.println(PalindromeProblem.findPalindrome("", 0)); // Expected: true
        
         // Test Case 2: Single character string (Edge case)
         System.out.println(PalindromeProblem.findPalindrome("a", 0)); // Expected: true
         
         // Test Case 3: Simple palindrome (Odd length)
         System.out.println(PalindromeProblem.findPalindrome("racecar", 0)); // Expected: true
         
         // Test Case 4: Simple palindrome (Even length)
         System.out.println(PalindromeProblem.findPalindrome("abba", 0)); // Expected: true
         
         // Test Case 5: Non-palindrome string
         System.out.println(PalindromeProblem.findPalindrome("hello", 0)); // Expected: false
         
         // Test Case 6: Palindrome with spaces and different cases
         System.out.println(PalindromeProblem.findPalindrome("A man a plan a canal Panama".replaceAll("\\s+", "").toLowerCase(), 0)); // Expected: true
         
         // Test Case 7: Non-palindrome with mixed characters
         System.out.println(PalindromeProblem.findPalindrome("abcde", 0)); // Expected: false
         
         // Test Case 8: Long palindrome string
         System.out.println(PalindromeProblem.findPalindrome("madamimadam", 0)); // Expected: true
    }
}
