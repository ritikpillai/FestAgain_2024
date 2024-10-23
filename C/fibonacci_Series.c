#include <stdio.h>

// Function to generate and print the Fibonacci sequence
void generateFibonacci(int n) {
    int first = 0, second = 1, next;

    printf("Fibonacci Sequence for the first %d terms: ", n);

    for (int i = 0; i < n; i++) {
        if (i <= 1) {
            next = i;
        } else {
            next = first + second;
            first = second;
            second = next;
        }
        printf("%d ", next);
    }

    printf("\n");
}

int main() {
    int n;

    printf("Enter the number of terms: ");
    scanf("%d", &n);

    generateFibonacci(n);

    return 0;
}