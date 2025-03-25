// Write a C Program to create circular queue using an array.
#include <iostream>
using namespace std;

class circularQueue {
public:
    int arr[3];
    int currSize = 0;
    int capacity = 3;
    int front = 0;
    int rear = -1;

    void push_back(int val) {
        if (currSize == capacity) {
            cout << " array full"<<endl;
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = val;
        currSize++;
    }

    void pop_front() {
        front = (front + 1) % capacity;
        currSize--;
    }

    int top() {
        return arr[front];
    }

    void print() {
        int i = front;
        int count = 0;

        while(count < currSize) {
            cout << arr[i] << " ";
            i = (i+1) % capacity;
            count++;
        }
        cout<<endl;
    }

};

int main() {
    circularQueue cq;

    cq.push_back(2);
    cq.push_back(4);
    cq.push_back(6);

    cq.print();

    cq.pop_front();

    cq.print();
    cout << endl;
    return 0;
}