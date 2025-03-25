// Write a C Program to create a queue using Linkedlist.
#include<iostream>
using namespace std;

class Node{
public:
    int data;
    Node* next;

    Node(int val) {
        data = val;
        next = NULL;
    }
};

class List {
public:
    Node* head;
    Node* tail;

    List() {
        head = tail = NULL;
    }

    void push_back(int val) {
        Node* newNode = new Node(val);
        if(head == NULL) {
            head = tail = newNode;
            return;
        }
        tail->next = newNode;
        tail = newNode;
    }

    void pop_front() {
        if(isEmpty()) {
            cout << "empty" << endl;
            return;
        }
        Node* temp = head;
        head = head->next;
        temp->next = NULL;
        delete temp;
    }

    void printLL() {
        Node* temp = head;
        while(temp != NULL) {
            cout << temp->data << " ";
            temp = temp->next;
        }
    }

    bool isEmpty() {
        return head == NULL;
    }

};

class Queue {
public:
    List l;
    void push(int val) {
        l.push_back(val);
    }

    void pop() {
        l.pop_front();
    }

    void print() {
        l.printLL();
    }
};

int main(){
    
    Queue q;
    q.push(1);
    q.push(2);
    q.push(3);
    q.push(4);

    q.print();

    q.pop();

    q.print();
    
    cout<<endl;
    return 0;
}
