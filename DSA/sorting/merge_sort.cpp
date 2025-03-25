// merge sort uses divide and conquer 
#include<iostream>
#include<vector>
using namespace std;

void merge(int arr[], int start, int mid, int end) {
    vector<int> temp;
    int left = start;
    int right = mid + 1;

    while (left <= mid && right <= end) {
        if (arr[left] <= arr[right]) {
            temp.push_back(arr[left]);
            left++;
        } else {
            temp.push_back(arr[right]);
            right++;
        }
    }

    // copying remaining elements from left array
    while (left <= mid) {
        temp.push_back(arr[left]);
        left++;
    }

    // copying remaining elements from right array
    while (right <= end) {
        temp.push_back(arr[right]);
        right++;
    }

    // copying back merged vector to the array
    for (int i = 0; i < temp.size(); i ++) {
        arr[start+i] = temp[i];
    }
}

void merge_sort(int arr[], int start, int end) {
    if (start >= end) return;

    int mid = (start + end) / 2;
    merge_sort(arr, start, mid); // sort left half
    merge_sort(arr, mid+1, end); // sort right half
    merge(arr, start, mid, end);
}


int main(){
    
    int arr[] = {12, 31, 35, 8, 32, 17};
    int size = sizeof(arr) / sizeof(arr[1]);

    cout << "Original array: " << endl;
    for (int i = 0; i < size; i++) {
        cout << arr[i] << " ";
    }

    cout << endl;

    merge_sort(arr, 0, size-1);

    cout << "Sorted array: " << endl;
    for (int i = 0; i < size; i++) {
        cout << arr[i] << " ";
    }

    cout<<endl;
    return 0;
}