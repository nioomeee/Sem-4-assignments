// Write a CPP program to create a class named Student with data : No, Name and
// Addresss.
// Create 3 objects of Student structure. Get the value of structure variable from user and
// print it.
#include<iostream>
using namespace std;

class Student{
private:
    int rollno;
    string name;
    string address;

public:
    void getValues(int r, string n, string a){
        rollno = r;
        name = n;
        address = a;
    }

    void display(){
        cout<<" Name = "<<name;
        cout<<" Roll no = "<<rollno;
        cout<<" Address = "<<address;
    }
};

int main(){
    
    Student students[3];

    int rollno;
    string name, address;

    cout<<"\n Enter the values for 3 students: "<<endl;

    for(int i = 0; i < 3; i ++){
        cout<<"\n For "<<i+1<<" : "<<endl;
        
        cout<<"\n Name: ";
        getline(cin, name);
        
        cout<<"\n Roll no: ";
        cin>>rollno;

        cin.ignore();

        cout<<"\n Address: ";
        getline(cin, address);

        students[i].getValues(rollno, name, address);
    }

    cout<<"\n Printing the entered values: "<<endl;

    for(int i = 0; i < 3; i ++){
        cout<<"\n For "<<i+1<<": "<<endl;

        students[i].display();
    }

    cout<<endl;
    return 0;
}