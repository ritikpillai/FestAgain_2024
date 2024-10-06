public class InsertionSort {
    private InsertionSort() {}

    // Insertion sort:
    // - Works from left to right
    // - Moves the current index value to the correct position in each iteration
    // Time Complexity: Best - O(n) Average - O(n^2) Worst - O(n^2)

    // Declare method to perform the sort, taking an array as param
    public static int[] insertionSort(int[] arr){

        // Loop starting at position 1 as the value at position 0 is theoretically in a "sorted" state already
        for (int i = 1; i < arr.length; i++) {

            // Define the current value to sort around
            int current = arr[i];

            // Set the second index to be current - 1
            int j = i - 1;

            // Continue swapping whilst the value at index 2 is larger than current
            while ( j >= 0 && arr[j] > current) {

                // Perform swap
                arr[j + 1] = arr[j];

                // Decrement index value of j
                j -= 1;
            }

            // Move current value into second indexer + 1 to place in correct position
            arr[j + 1] = current;
        }

        return arr;
    }
}
