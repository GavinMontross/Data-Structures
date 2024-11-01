/*<listing chapter="8" number="2">*/
/**
 * Implements the insertion sort algorithm.
 * @author Koffman and Wolfgang
 **/
//Edited for class use by Shuvra Chakraborty

public class insertionSort{

    /**
     * Sort the table using insertion sort algorithm.
     * @param table The array to be sorted
     */
    public void sort(int[] table) {
        for (int nextPos = 1; nextPos < table.length; nextPos++) {
            // Invariant: table[0 . . . nextPos - 1] is sorted.
            // Insert element at position nextPos
            // in the sorted subarray.
            System.out.println("Pass "+nextPos+", and Item to be inserted: "+table[nextPos]);
            insert(table, nextPos);

            printCurrentArray(table);
        } // End for.
    } // End sort.

    //A helper method to print array
    public void printCurrentArray(int[] table)
    {
        for(int i=0; i<table.length; i++){
            System.out.print(table[i] + " ");
        }
        System.out.println();
    }
    /**
     * Insert the element at nextPos where it belongs
     * in the array.
     * pretable[0 . . . nextPos - 1] is sorted.
     * posttable[0 . . . nextPos] is sorted.
     * @param table The array being sorted
     * @param nextPos The position of the element to insert
     */
    private static void insert(int [] table, int nextPos) {
        int nextVal = table[nextPos]; // Element to insert.
        while (nextPos > 0
                && nextVal< table[nextPos - 1]) {
            table[nextPos] = table[nextPos - 1]; // Shift down.
            nextPos--; // Check next smaller element.
        }
        // Insert nextVal at nextPos.
        table[nextPos] = nextVal;
    }
}
/*</listing>*/
