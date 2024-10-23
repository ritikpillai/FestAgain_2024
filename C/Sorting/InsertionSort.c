#include <stdio.h>

/**
* Prints the elements of an array.
* @param {int[]} array The array to print.
* @param {int} size The size of the array.
* @return {void}
*/
void printArray(int array[], int size)
{
    for (int i = 0; i < size; i++)
    {
        printf("%d ", array[i]);
    }
}

/**
* Sorts an array using the insertion sort algorithm.
* @param {int[]} array The array to sort.
* @param {int} size The size of the array.
* @return {void}
*/
void insertionSort(int array[], int size) 
{
    for (int i = 1; i < size; i++)
    {
        int key = array[i];
        int j = i - 1;
        while (key < array[j] && j >= 0)
        {
            array[j + 1] = array[j];
            --j;
        }
        array[j + 1] = key;
    }
}

/**
* Sorts an array using the insertion sort algorithm.
* @param {int[]} array The array to sort.
* @param {int} size The size of the array.
* @return {void}
*/

int main()
{
    int arr[] = {1, 8, 4, 2, 3};
    int n = sizeof(arr) / sizeof(arr[0]);
    insertionSort(arr, n);
    printf("Sorted Array are :\n");
    printArray(arr, n);
    return 0;
}