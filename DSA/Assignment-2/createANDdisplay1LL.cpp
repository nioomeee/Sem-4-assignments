// creaying an displaying single linked list
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

Node* createLL(){
    Node* head = NULL;
    Node* tail = NULL;

    int value;
    cout<<"\n Enter the value you want to add in the linked list(-1 to stop): ";
    cin>>value;

    while(value != -1){
        Node* newNode = new Node(value);
        if(head == NULL){
            head = newNode;
            tail = newNode;
        }else{
            tail->next = newNode;
            tail = newNode;
        }
        cin >> value;
    }

    return head;
}

void displayLL(Node* head){
    Node* temp = head;

    if(head == NULL){
        cout<<"\n The linked list is empty!"<<endl;
    }else{
        while(temp != NULL){
            cout<<temp->data<<" -> ";
            temp = temp->next;
        }
        cout<<"NULL "<<endl;
    }
}

void insertMiddle(Node* head, int val, int pos){
    Node* temp = head;

    Node* newNode = new Node(val);

    for(int i = 0; i < pos -1 && temp != NULL; i++){
        temp = temp->next;
    }

    if(temp == NULL){
        cout<<"\n The entered position is not accesible in the linked list"<<endl;
        return;
    }else{
        temp->next = newNode;
        temp = newNode;
    }

    cout<<"\n Inserted "<<val<<" at "<<pos<<endl;
}

int main(){
    
   Node* head = NULL;

   //creating the linked list
   head = createLL();

   //displaying the created linked list
   displayLL(head);

    //inserting in middle 
    int value, position;
    cout<<"\n Enter the value you want to enter: ";
    cin>>value;
    cout<<"\n Enter the position you want to enter: ";
    cin>>position;

    insertMiddle(head, value, position);

    // displaying the linked list again
    displayLL(head);
    
    cout<<endl;
    return 0;
}