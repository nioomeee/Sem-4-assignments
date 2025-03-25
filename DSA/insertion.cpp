// insertion sort
#include<iostream>
using namespace std;

int main(){
    
    int arr[] = {5, 2, 4, 6, 1, 3};
    for(int i = 0; i < 6; i ++) {
        cout << arr[i] << " ";
    }
    cout<<endl;
    int n = 6; 
    for(int i = 1; i < n; i ++) { // start from 1 only here
        int key = arr[i]; // the number to insert
        int j = i - 1; // previous element

        while(j >= 0 && arr[j] > key) { //shift large numbers to right
            arr[j + 1] = arr[j];
            j--;
        } 
        arr[j+1] = key;
    }
    for(int i = 0; i < n; i ++) {
        cout << arr[i] << " ";
    }
    cout<<endl;
    return 0;
}