// Write a C Program to store marks of 5 subjects in a queue and find the percentage from
// that value.
#include<iostream>
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
public:
    Node* head; Node* tail;

    List() {
        head = tail = NULL;
    }

    void pop_fron() {
        Node* temp = head;
        head = head->next;
        temp->next = NULL;
        delete temp;
    }

    void push_back(int val) {
        Node* newNode = new Node(val);

        if( head == NULL) {
            head = tail = newNode;
        }

        tail->next = newNode;
        tail = newNode;
    }

    void printLL() {
        Node* temp = head;

        while(temp != NULL) {
            cout<<temp->data<<" ";
            temp = temp->next;
        }
        cout<<endl;
    }


};
class Queue{
public:

};

int main(){
    
    
    cout<<endl;
    return 0;
}