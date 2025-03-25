//Bubble Sort
#include<iostream>
using namespace std;

int main(){
    
    int arr[5] = {1, 2, 8, 0, 5};
    for(int i = 0; i < 5; i ++) {
        cout << arr[i] << " ";
    }
    int temp;
    for(int i = 0; i < 5; i ++) {
        for(int j = i+1; j < 5; j ++) {
            if(arr[i] > arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    for(int i = 0; i < 5; i ++) {
        cout << arr[i] << " ";
    }
    cout<<endl;
    return 0;
}
