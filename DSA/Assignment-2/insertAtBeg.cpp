#include<iostream>
using namespace std;

class Node{
public:
    int data;
    Node* next;

    Node(int value){
        data = value;
        next = NULL;
    }
};


int main(){
    
    Node* head = NULL;
    Node* tail = NULL;

    int val;
    cout<<"\n Enter the value you want to enter(-1 to stop): ";
    cin>>val;

    // creating a linked list
    while(val != -1){
        Node* newNode = new Node(val);
        if(head == NULL){
            head = newNode;
            tail = newNode;
        }else{
            tail -> next = newNode;
            tail = newNode;
        }
        cin >> val;
    }

    // displaying the enetred linked list
    Node* temp = head;
    
    if(temp == NULL){
        cout<<"\n The linked list is empty!";
    }else{
        while(temp -> next != NULL){
            cout<<temp->data<<" -> ";
            temp = temp -> next;
        }
        cout<<"NULL"<<endl;
    }

    // inserting at beginning
    int newVal;
    cout<<"\n Insert the value you want to enter: ";
    cin>>newVal;

    Node* newNode = new Node(newVal);
    newNode -> next = head;
    head = newNode;

    // displaying the details again
    temp = head;
    
    if(temp == NULL){
        cout<<"\n The linked list is empty!";
    }else{
        while(temp -> next != NULL){
            cout<<temp->data<<" -> ";
            temp = temp -> next;
        }
        cout<<"NULL"<<endl;
    }
    
    cout<<endl;
    return 0;
}