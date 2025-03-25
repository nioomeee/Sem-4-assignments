// Write a C Program to create a stack using a Linkedlist.
#include <iostream>
using namespace std;

class Node {
public:
    int data;
    Node* next;

    Node(int val) {
        data = val;
        next = NULL;
    }
};

class List {

    Node* head;
    Node* tail;

public:
    List() {
        head = tail = NULL;
    }
    void push_back(int val) {
        Node* newNode = new Node(val);
        if( head == tail == NULL) {
            head = tail = newNode;
        }
        tail->next = newNode;
        tail = newNode;
    }

    void printLL() {
        Node* temp = head;

        while(temp != NULL) {
            cout << temp->data << " ";
            temp = temp->next;
        }
        cout << "NULL" << endl;
    }
};

class Stack {
public: 
    
};