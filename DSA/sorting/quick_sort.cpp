// Quick sort
#include<iostream>
using namespace std;

void swap(int &a, int &b) {
    int temp = a;
    a = b;
    b = temp;
}

int partition(int arr[], int start, int end) {
    int idx = start-1; 
    int pivot = arr[end];
    for(int i = start; i < end; i ++) {
        if(arr[i] < pivot) {
            idx++;
            swap(arr[idx], arr[i]);
        }
    }
    idx++;
    swap(arr[end], arr[idx]);

    return idx; //returns the pivot index
}

void quickSort(int arr[], int start, int end) {
    if (start >= end) return;

    int pivotIndx = partition(arr, start, end);
    quickSort(arr, start, pivotIndx-1);
    quickSort(arr, pivotIndx+1, end);
}
    

int main(){
    
    int arr[] = {5, 2, 9, 3, 7, 1};
    int size = sizeof(arr) / sizeof(arr[0]);

    quickSort(arr, 0, size-1);

    for(int i : arr) {
        cout << i << " ";
    }
    
    cout<<endl;
    return 0;
}