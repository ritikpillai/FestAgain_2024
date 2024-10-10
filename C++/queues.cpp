#include <iostream>
#include <stack>
using namespace std;

class QueueUsingArray {
private:
    int front, rear, size;
    int* queue;
public:
    QueueUsingArray(int s) {
        front = rear = 0;
        size = s;
        queue = new int[s];
    }

    ~QueueUsingArray() {
        delete[] queue;
    }

    void enqueue(int value) {
        if (rear == size) {
            cout << "Queue is full" << endl;
            return;
        }
        queue[rear++] = value;
    }

    void dequeue() {
        if (front == rear) {
            cout << "Queue is empty" << endl;
            return;
        }
        cout << "Dequeued: " << queue[front++] << endl;
    }

    void display() {
        if (front == rear) {
            cout << "Queue is empty" << endl;
            return;
        }
        for (int i = front; i < rear; i++) {
            cout << queue[i] << " ";
        }
        cout << endl;
    }
};

class QueueUsingStacks {
private:
    stack<int> s1, s2;
public:
    void enqueue(int value) {
        s1.push(value);
    }

    void dequeue() {
        if (s1.empty() && s2.empty()) {
            cout << "Queue is empty" << endl;
            return;
        }
        if (s2.empty()) {
            while (!s1.empty()) {
                s2.push(s1.top());
                s1.pop();
            }
        }
        cout << "Dequeued: " << s2.top() << endl;
        s2.pop();
    }

    void display() {
        if (s1.empty() && s2.empty()) {
            cout << "Queue is empty" << endl;
            return;
        }
        stack<int> temp1 = s1, temp2 = s2;
        while (!temp2.empty()) {
            cout << temp2.top() << " ";
            temp2.pop();
        }
        stack<int> temp3;
        while (!temp1.empty()) {
            temp3.push(temp1.top());
            temp1.pop();
        }
        while (!temp3.empty()) {
            cout << temp3.top() << " ";
            temp3.pop();
        }
        cout << endl;
    }
};

int main() {
    QueueUsingArray q1(5);
    q1.enqueue(1);
    q1.enqueue(2);
    q1.enqueue(3);
    q1.display();
    q1.dequeue();
    q1.display();

    QueueUsingStacks q2;
    q2.enqueue(1);
    q2.enqueue(2);
    q2.enqueue(3);
    q2.display();
    q2.dequeue();
    q2.display();

    return 0;
}