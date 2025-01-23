// Write a CPP program to create two dimensional array, pass that array to a user defined
// function and print it.
#include<iostream>
using namespace std;

class Solution{
public:
    void display(int arr[3][3], int cols, int rows){
        for(int i = 0; i < rows; i ++){
            for(int j = 0; j < cols; j ++){
                cout<<"a["<<i+1<<"]["<<j<<"] = "<<arr[i][j]<<"\t";
            }
        }
    }
};

void print(int matrix[3][3], int row, int col){
    for(int i = 0; i < row; i++){
        for(int j = 0; j < row; j++){
            cout << matrix[i][j] << " ";
        }
    }
}

int main(){
    
    int rows, cols;

    cout<<"Enter the number of rows you want: ";
    cin>>rows;

    cout<<"Enter the number of columns you want: ";
    cin>>cols;

    int matrix[rows][cols];

    cout<<"\n Enter the values of the matrix: "<<endl;

    for(int i = 0; i < rows; i ++){
        for(int j = 0; j < cols; j ++){
            cout<<"a["<<i+1<<"]["<<j<<"]: ";
            cin>>matrix[i][j];
        }
    }

    cout<<"The entered values are: "<<endl;

    Solution sol;

    print(matrix, cols, rows);

    cout<<endl;
    return 0;
}