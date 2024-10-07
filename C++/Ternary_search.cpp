// perform ternary search in cpp below
#include <iostream>
using namespace std;

int ternarySearch(int arr[], int n, int x) {
    int low = 0, high = n - 1;
    while (low <= high) {
        int mid1 = low + (high - low) / 3;
        int mid2 = high - (high - low) / 3;
        if (arr[mid1] == x)
            return mid1;
        if (arr[mid2] == x)
            return mid2;
        if (arr[mid1] > x)
            high = mid1 - 1;
        else if (arr[mid2] < x)
            low = mid2 + 1;
        else {
            low = mid1 + 1;
            high = mid2 - 1;
        }
    }
    return -1;
}

int main() {
    int n, x;
    cin >> n >> x;
    int arr[n];
    for (int i = 0; i < n; i++)
        cin >> arr[i];
    cout << ternarySearch(arr, n, x) << endl;
    return 0;
}
// Time Complexity: O(log3(n))
// Space Complexity