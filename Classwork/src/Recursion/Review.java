package Recursion;

public class Review {

    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static int sumUpTo(int n){
        if (n == 0){
            return 0;
        }
        return n + sumUpTo(n - 1);
    }
    public static int fibbonacci(int n){
        if(n==0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        
        return fibbonacci(n-1) + fibbonacci(n-2);
    }
    public static String reverse(String s){
        if (s.isEmpty()){
            return "";
        }
        if(s.length() == 1){
            return s;
        }
        return s.charAt(s.length()-1) + reverse(s.substring(0, s.length()-1));
    }
    public static int power(int base, int exponent){
        if (exponent == 0){
            return 1;
        }
        return base * power(base, exponent-1);
    }
    public static int searchArray(int target, int[] nums, int index){
        if (index >= nums.length){
            return -1;
        }
        if (nums[index] == target){
            System.out.println("Match found at index: " + index);
        }
        return searchArray(target, nums, index+1);
    }
    public static void countdown(int n){
        if (n==0){
            System.out.println("Time for takeoff");
            return;
        }
        System.out.println(n);
        countdown(n-1);
    }
    public static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return n%10 + sumOfDigits(n/10);
    }
    public static int lengthOfString(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        return 1 + lengthOfString(s.substring(1));
    }
    public static int powerToN(int n, int power){
        if (power == 0){
            return 1;
        }
        return n * powerToN(n, power-1);
    }

    
    public static void main(String[] args) {
        // Loop solution:
    //     for(int i = 1; i <= n; i ++){
    //         factN = factN * i;
    //     }
    System.out.println(factorial(4));
    System.out.println(sumUpTo(5));
    System.out.println(fibbonacci(6));
    System.out.println(reverse("Hello"));
    System.out.println(power(2, 5));
    int[] nums = {1,2,3,4,5,6,6,7,8,9};
    System.out.println(searchArray(6, nums, 0));
    countdown(5);
    System.out.println(sumOfDigits(12345));
    System.out.println(powerToN(2,4));
    }

}
