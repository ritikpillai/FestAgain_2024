#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class Array {
private:
    vector<int> arr;

public:
    // Function to traverse the array
    void traverse() {
        for (int i = 0; i < arr.size(); i++) {
            cout << arr[i] << " ";
        }
        cout << endl;
    }

    // Function to add an element to the array
    void add(int element) {
        arr.push_back(element);
    }

    // Function to remove an element from the array
    void remove(int element) {
        auto position = find(arr.begin(), arr.end(), element);
        if (position != arr.end()) {
            arr.erase(position);
        } else {
            cout << "Element not found in the array." << endl;
        }
    }

    // Function to calculate the sum of the array elements
    int sum() {
        int total = 0;
        for (int i = 0; i < arr.size(); i++) {
            total += arr[i];
        }
        return total;
    }

    // Function to sort the array
    void sortArray() {
        sort(arr.begin(), arr.end());
    }
};

int main() {
    Array array;
    array.add(5);
    array.add(3);
    array.add(8);
    array.add(1);

    cout << "Array elements: ";
    array.traverse();

    cout << "Sum of array elements: " << array.sum() << endl;

    array.sortArray();
    cout << "Sorted array elements: ";
    array.traverse();

    array.remove(3);
    cout << "Array elements after removal: ";
    array.traverse();

    return 0;
}
