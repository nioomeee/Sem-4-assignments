// Write a C Program to create a Stack using an array with 10 elements and find the ODD
// numbers out of it and print it.
#include<iostream>
using namespace std;

class Stack{
public:
    int arr[10];
    int len = 10;
    int arr_indx = -1;

    void push_back(int val) {
        if(arr_indx >= 10) {
            cout << " overflow ! " <<endl;
            return;
        }

        arr[arr_indx++] = val;
    }

    void pop() {
        if(arr_indx < 0) {
            cout << "underflow" <<endl;
            return;
        }
        arr_indx--;
    }

    int top() {
        if(arr_indx < 0) {
            cout<<"underflow" <<endl;
            return -1;
        }
        return arr[arr_indx];
    }

    bool isEmpty() {
        return arr_indx == -1;
    }
};

int main(){
    
    Stack s;
    s.push_back(1);
    s.push_back(2);
    s.push_back(3);
    s.push_back(4);
    s.push_back(5);
    s.push_back(6);
    s.push_back(7);
    s.push_back(8);
    s.push_back(9);
    s.push_back(10);

    cout << "Odd values are" <<endl;
    while(!s.isEmpty()) {
        if(s.top() % 2 == 1) {
            cout << s.top() << " ";
        }
        s.pop();
    }
    cout<<endl;
    return 0;
}