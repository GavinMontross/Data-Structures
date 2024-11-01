/*<listing chapter="8" number="8">*/
//package KW.CH08;

/**
 * Implements the quicksort algorithm.
 *  @author Koffman and Wolfgang
 **/
//Edited for class use by Shuvra Chakraborty

public class quickSort {
    int pass = 0;
    /**
     * Sort the table using the quicksort algorithm.

    /**
     * Sort a part of the table using the quicksort algorithm.post: The part of table from first through last is sorted.
     * @param table The array to be sorted
     * @param first The index of the low bound
     * @param last The index of the high bound
     */
    protected void QuickSort(int[] table,int first,int last) {

        //you can make it first<last if you want
        if (first <= last) { // There is data to be sorted.
            // Partition the table.

            int pivIndex = partition(table, first, last);
            System.out.println("Pass: "+(++pass)+", Pivot element = " + table[pivIndex]);

            printCurrentArray(table);
            // Sort the left half.
            QuickSort(table, first, pivIndex - 1);
            // Sort the right half.
            QuickSort(table, pivIndex + 1, last);
        }
    }
    public void printCurrentArray(int[] table)
    {
        for(int i=0; i<table.length; i++){
            System.out.print(table[i] + " ");
        }
        System.out.println();
    }
    public void printCurrentSubArray(int[] table, int fromIndex, int toIndex)
    {
        if(fromIndex > toIndex || toIndex > (table.length-1))
            {return;}
        for(int i=fromIndex; i<=toIndex; i++){
            System.out.print(table[i] + " ");
        }
        System.out.println();
    }

    /**
     * Partition the table so that values from first to pivIndex
     * are less than or equal to the pivot value, and values from
     * pivIndex to last are greater than the pivot value.
     * @param table The table to be partitioned
     * @param first The index of the low bound
     * @param last  The index of the high bound
     * @return The location of the pivot value
     */
    protected int partition(int[] table, int first, int last) {
        // Select the first item as the pivot value.
        int pivot = table[first];
        int up = first;
        int down = last;
        System.out.print("Current subarray: ");
        printCurrentSubArray(table, up, down);
        System.out.println("Pivot element = " + pivot);

        do {
            // Invariant:
            // All items in table[first . . . up - 1] <= pivot
            // All items in table[down + 1 . . . last] > pivot
            while ((up < last) && (pivot>=table[up])) {
                up++;
            }
            // assert: up equals last or table[up] > pivot.
            while (pivot<table[down]) {
                down--;
            }
            // assert: down equals first or table[down] <= pivot.
            if (up < down) { // if up is to the left of down.
                // Exchange table[up] and table[down].
                swap(table, up, down);
            }
        } while (up < down); // Repeat while up is left of down.

        // Exchange table[first] and table[down] thus putting the
        // pivot value where it belongs.
        swap(table, first, down);

        // Return the index of the pivot value.
        return down;
    }

    /**
     * Swap the items in table[i] and table[j].
     * @param table The array that contains the items
     * @param i The index of one item
     * @param j The index of the other item
     */
    protected void swap(int[] table, int i, int j) {
        int temp = table[i];
        table[i] = table[j];
        table[j] = temp;
    }
}
