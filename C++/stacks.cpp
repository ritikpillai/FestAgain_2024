#include <iostream>
#include <vector>
#include <algorithm>

class Stack {
private:
    std::vector<int> elements;

public:
    // Push an element onto the stack
    void push(int value) {
        elements.push_back(value);
    }

    // Pop an element from the stack
    void pop() {
        if (!elements.empty()) {
            elements.pop_back();
        } else {
            std::cerr << "Stack is empty. Cannot pop." << std::endl;
        }
    }

    // Traverse and print all elements in the stack
    void traverse() const {
        for (int elem : elements) {
            std::cout << elem << " ";
        }
        std::cout << std::endl;
    }

    // Sum all elements in the stack
    int sum() const {
        int total = 0;
        for (int elem : elements) {
            total += elem;
        }
        return total;
    }

    // Sort the stack in ascending order
    void sort() {
        std::sort(elements.begin(), elements.end());
    }
};

int main() {
    Stack stack;
    stack.push(10);
    stack.push(20);
    stack.push(5);
    stack.push(15);

    std::cout << "Stack elements: ";
    stack.traverse();

    std::cout << "Sum of elements: " << stack.sum() << std::endl;

    stack.sort();
    std::cout << "Sorted stack elements: ";
    stack.traverse();

    stack.pop();
    std::cout << "Stack elements after pop: ";
    stack.traverse();

    return 0;
}