// selection sort
#include<iostream>
using namespace std;

int main(){
    
    int arr[] = {4, 1, 5, 3, 2};
    for(int i = 0; i < 5; i ++) {
        cout << arr[i] << " ";
    }
    int n = 5;
    int temp;
    for(int i = 0; i < n-1; i ++){
        int si = i; //smallest index
        for(int j = i+1; j < n; j ++) {
            if(arr[j] < arr[si]){
                temp = arr[si];
                arr[si] = arr[j];
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