#include <stdio.h>
#include <string.h>

// Function to reverse a string
void reverseString(char* str) {
    int length = strlen(str);
    for (int i = 0; i < length / 2; i++) {
        char temp = str[i];
        str[i] = str[length - i - 1];
        str[length - i - 1] = temp;
    }
}

int main() {
    char inputString[100];

    printf("Enter a string: ");
    fgets(inputString, sizeof(inputString), stdin);

    // Remove the newline character from the input
    inputString[strcspn(inputString, "\n")] = '\0';

    // Reverse the string
    reverseString(inputString);

    printf("Reversed string: %s\n", inputString);

    return 0;
}