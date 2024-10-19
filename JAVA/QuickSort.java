public class QuickSort {

    private QuickSort() {}

    // Quick sort:
    // - Selects an index (pivot) and sorts around it
    // - Treats values to the left of the pivot as being lesser
    // - Treats values to the right of the pivot as being greater
    // - Performed recursively on either side of the pivot
    // Time Complexity: Best - O(n log2 n) Average - O(n log2 n) Worst - O(n^2)

    // Declare method to perform the sort, taking an array as param
    public static int[] quickSort(int[] arr, int firstIndex, int lastIndex) {

        // Verify that a valid range has been given/ that the indices do not match
        // When the indices match, there will only be 1 item in the array to sort
        if (firstIndex < lastIndex) {
            // Select a value to pivot around, in this case the first index is selected
            int pivot = firstIndex;

            // Set values for iterators i and j
            int i = firstIndex;
            int j = lastIndex;

            // Whilst i is less than j, make comparisons that close around the pivot
            while (i < j) {
                // Whilst the value at index i is less than or equal to that of the pivot
                // and i is less than the end of the array, increment i
                while (arr[i] <= arr[pivot] && i < lastIndex) {
                    i++;
                }
                // Whilst the value at index j is larger than that at the pivot, decrement j
                while (arr[j] > arr[pivot]) {
                    j--;
                }
                // If i is less than j, swap the values at the index locations
                // As prior loops filter until a swap is needed, this is where the swap takes place
                if (i < j) {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }

            // Update the value of the pivot index
            // NOTE: Arithmetic swapping here causes erroneous results, possibly due to overlapping values
            int temp = arr[pivot];
            arr[pivot] = arr[j];
            arr[j] = temp;

            // As the pivot should now be placed correctly, sort the subarrays on either side of it
            quickSort(arr, firstIndex, j - 1);
            quickSort(arr, j + 1, lastIndex);
        }

        return arr;
    }
}