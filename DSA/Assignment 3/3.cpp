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
        if( head == NULL) {
            head = tail = newNode;
            return;
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

    void pop_back() {
        if(isEmpty()) {
            cout <<"empty" <<endl;
            return;
        }
        Node* temp = head;
        while(temp->next != tail){
            temp = temp->next;
        }
        temp->next = NULL;
        delete tail;
        tail = temp;
                
    }

    bool isEmpty() {
        return head == NULL;
    }
};

class Stack {
public: 

    List l;
    void push(int val){
        l.push_back(val);
    }

    void pop() {
        l.pop_back();
    }

    void print() {
        l.printLL();
    }
};

int main() {
    Stack s;
    s.push(5);
    s.push(6);
    s.push(7);
    s.push(8);
    s.push(9);

    s.print();

    s.pop();

    s.print();

    return 0;
}