/*<listing chapter="8" number="5"*/
//package KW.CH08;

/**
 * Implements the recursive merge sort algorithm. In this version, copies
 *  of the subtables are made, sorted, and then merged.
 *  @author Koffman and Wolfgang
 */

//Edited for class use
public class mergeSort {

    /**
     * Sort the array using the merge sort algorithm.
     * preable contains Comparable objects.
     * posttable is sorted.
     * @param table The array to be sorted
     */
    public void MergeSort(int[] table) {
        // A table with one element is sorted already.
        if (table.length > 1) {
            // Split table into halves.
            int halfSize = table.length / 2;
            int[] leftTable = new int[halfSize];
            int[] rightTable =
                    new int[table.length - halfSize];
            System.arraycopy(table, 0, leftTable, 0, halfSize);
            System.arraycopy(table, halfSize, rightTable, 0,
                    table.length - halfSize);

            // Sort the halves.
            MergeSort(leftTable);
            MergeSort(rightTable);

            // Merge the halves.
            merge(table, leftTable, rightTable);
        }
    }

    /*<listing chapter="8" number="4">*/
    /**
     * Merge two sequences.
     * preeftSequence and rightSequence are sorted.
     * postoutputSequence is the merged result and is sorted.
     * @param outputSequence The destination
     * @param leftSequence The left input
     * @param rightSequence The right input
     */
    private static void merge(int[] outputSequence,
                                                         int[] leftSequence,
                                                         int[] rightSequence) {
        int i = 0; // Index into the left input sequence.
        int j = 0; // Index into the right input sequence.
        int k = 0; // Index into the output sequence.

        // While there is data in both input sequences
        while (i < leftSequence.length && j < rightSequence.length) {
            // Find the smaller and
            // insert it into the output sequence.
            if (leftSequence[i]<rightSequence[j]) {
                outputSequence[k++] = leftSequence[i++];
            } else {
                outputSequence[k++] = rightSequence[j++];
            }
        }
        // assert: one of the sequences has more items to copy.
        // Copy remaining input from left sequence into the output.
        while (i < leftSequence.length) {
            outputSequence[k++] = leftSequence[i++];
        }
        // Copy remaining input from right sequence into output.
        while (j < rightSequence.length) {
            outputSequence[k++] = rightSequence[j++];
        }
    }
    /*</listing>*/
}
