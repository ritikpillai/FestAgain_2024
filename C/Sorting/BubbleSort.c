#include <stdio.h>

// Function for swaping Variable
int swap(int *a, int *b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
}

// BubbleSort Function taking array and size of array as parameter
void bubbleSort(int arr[], int count)
{
    for (int i = 0; i < count - 1; i++)
    {
        for (int j = 0; j < count - i - 1; j++)
        {
            if (arr[j] > arr[j + 1])
                swap(&arr[j], &arr[j + 1]);
        }
    }
}

// Function to print array
void printArray(int arr[], int count)
{
    for (int i = 0; i < count; i++)
        printf("%d\n", arr[i]);
}
int main()
{
    // Creating array
    int arr[] = {1, 8, 4, 2, 3};

    // Finding Size of array
    int n = sizeof(arr) / sizeof(arr[0]);

    // Calling BubbleSort Function
    bubbleSort(arr, n);

    // Printing Array
    printf("Sorted Array are :\n");
    printArray(arr, n);
    return 0;
}