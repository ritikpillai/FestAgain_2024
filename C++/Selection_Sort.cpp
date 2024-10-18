/*Here is a C++ program that implements the Selection Sort algorithm:*/
#include <iostream>
#include <vector>
using namespace std;
void swap(int &a, int &b) {
    int temp = a;
    a = b;
    b = temp;
}
void selectionSort(vector<int> &arr) {
    int n = arr.size();
    for (int i = 0; i < n - 1; ++i) {
        int minIndex = i;
        for (int j = i + 1; j < n; ++j) {
            if (arr[j] < arr[minIndex])
                minIndex = j;
        }
        if (minIndex != i)
            swap(arr[i], arr[minIndex]);
    }
}
void display(const vector<int> &arr) {
    for (int num : arr) {
        cout << num << " ";
    }
    cout << endl;
}
int main() {
    vector<int> arr = {64, 25, 12, 22, 11};
    cout << "Original array: ";
    display(arr);
    selectionSort(arr);
    cout << "Sorted array:   ";
    display(arr);
    return 0;
}
