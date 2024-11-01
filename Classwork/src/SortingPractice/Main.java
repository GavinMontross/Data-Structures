//Sorting Examples: main class

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,3,5,1,0,9, 7, 8, -9};
       // int[] nums = {21,30,51,100,0,94, 72, 87, -9};

        System.out.println("Original Array: ");
        printCurrentArray(nums);

        //MERGE SORT MODULE
        /*
        mergeSort obj = new mergeSort();
        obj.MergeSort(nums);
        System.out.println("Final sorted Array: ");
        printCurrentArray(nums);
        System.out.println();
        */

        //Quick sort module
        ///*
        quickSort obj2 = new quickSort();
        obj2.QuickSort(nums, 0, nums.length-1);
        System.out.println("Final sorted Array: ");
        printCurrentArray(nums);
        System.out.println();
        //*/
        //Insertion sort module
        /*
        insertionSort obj3 = new insertionSort();
        obj3.insertionSort(nums);
        System.out.println("Final sorted Array: ");
        printCurrentArray(nums);
        System.out.println();
        */

    }

    public static void printCurrentArray(int[] table)
    {
        for(int i=0; i<table.length; i++){
            System.out.print(table[i] + " ");
        }
        System.out.println();
    }

}
