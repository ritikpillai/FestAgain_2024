#include <iostream>
#include <stack>
#include <queue>

class Node {
public:
    int data;
    Node* next;
    Node(int val) : data(val), next(nullptr) {}
};

class LinkedList {
private:
    Node* head;

public:
    LinkedList() : head(nullptr) {}

    void createFromArray(int arr[], int size);
    void display();
    void createFromStack(std::stack<int>& s);
    void createFromQueue(std::queue<int>& q);
    void deleteNode(int key);

    void insert(int data) {
        Node* newNode = new Node(data);
        if (!head) {
            head = newNode;
        } else {
            Node* temp = head;
            while (temp->next) {
                temp = temp->next;
            }
            temp->next = newNode;
        }
    }

    void deleteNode(int key) {
        Node* temp = head;
        Node* prev = nullptr;

        if (temp != nullptr && temp->data == key) {
            head = temp->next;
            delete temp;
            return;
        }

        while (temp != nullptr && temp->data != key) {
            prev = temp;
            temp = temp->next;
        }

        if (temp == nullptr) return;

        prev->next = temp->next;
        delete temp;
    }

    void display() {
        Node* temp = head;
        while (temp) {
            std::cout << temp->data << " -> ";
            temp = temp->next;
        }
        std::cout << "NULL" << std::endl;
    }

    void createFromArray(int arr[], int size) {
        for (int i = 0; i < size; ++i) {
            insert(arr[i]);
        }
    }

    void createFromStack(std::stack<int>& s) {
        while (!s.empty()) {
            insert(s.top());
            s.pop();
        }
    }

    void createFromQueue(std::queue<int>& q) {
        while (!q.empty()) {
            insert(q.front());
            q.pop();
        }
    }
};

int main() {
    LinkedList list;

    // Creating linked list from array
    int arr[] = {1, 2, 3, 4, 5};
    list.createFromArray(arr, 5);
    std::cout << "Linked List created from array: ";
    list.display();

    // Creating linked list from stack
    std::stack<int> s;
    s.push(6);
    s.push(7);
    s.push(8);
    list.createFromStack(s);
    std::cout << "Linked List created from stack: ";
    list.display();

    // Creating linked list from queue
    std::queue<int> q;
    q.push(9);
    q.push(10);
    q.push(11);
    list.createFromQueue(q);
    std::cout << "Linked List created from queue: ";
    list.display();

    // Performing basic operations
    list.insert(12);
    std::cout << "After inserting 12: ";
    list.display();

    list.deleteNode(3);
    std::cout << "After deleting 3: ";
    list.display();

    return 0;
}