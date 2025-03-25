// binary search in already sorted array
#include <iostream>
using namespace std;

int binarySearch(int arr[], int target, int size) {
    int start = 0;
    int end = size - 1;

    while (start <= end) {
        int mid = (start + end) / 2; 
        if (target == arr[mid]) {
            return mid;
        } else if (target > arr[mid]) {
            start = mid+1;
        } else {
            end = mid - 1;
        }
    }
    return -1;
}

int main(){

    int arr1[] = {-1, 0, 3, 4, 5, 9, 12}; //odd
    int size1 = 7;
    int tar1 = 12;

    cout << binarySearch(arr1, tar1, size1) << endl;

    int arr2[] = {-1, 0, 3, 5, 9, 12}; //even
    int size2 = 6;
    int tar2 = 2;
    cout << binarySearch(arr2, tar2, size2) << endl;


    cout << endl;   
    return 0;
}