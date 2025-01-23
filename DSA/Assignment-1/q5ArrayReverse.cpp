// Write a CPP program that will display an array in reverse order.

#include<iostream>
using namespace std;

class Solution{
public:

};

int main(){
    
    int len;
    cout<<"\n Enter the length of the array: ";
    cin>>len;

    int arr[len];

    for(int i = 0; i < len; i ++){
        cout<<"a["<<i+1<<"]: ";
        cin>>arr[i];
    }

    cout<<"\n Arrray before reverse: "<<endl;
    for(int i = 0; i < len; i ++){
        cout<<"Array["<<i<<"] = "<<arr[i]<<endl;
    }

    int count;
    cout<<"\n Arrray after reverse: "<<endl;
    for(int i = len-1; i >= 0; i --){
        cout<<"Array["<<i<<"] = "<<arr[i]<<endl;
    }
    cout<<endl;
    return 0;
}