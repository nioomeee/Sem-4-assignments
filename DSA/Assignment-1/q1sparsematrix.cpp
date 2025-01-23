// Write a CPP program to create a matrix and check whether that matrix is Sparse matrix or not.
#include <iostream>
using namespace std;

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

        int count = 0;

    cout<<"\n Entered values are: "<<endl;
    for(int i = 0; i < rows; i ++){
        for(int j = 0; j < cols; j ++){
            cout<<"a["<<i+1<<"]["<<j<<"] = "<<matrix[i][j]<<"\t";
            if(matrix[i][j] == 0){
                count++;
            }
        }
        cout<<endl;
    }

    if(count > ((rows * cols)/2)){
        cout<<"\n The entered matrix is a sparse matrix"<<endl;
    }else{
        cout<<"\n The entered matrix is not a sparse matrix"<<endl;

    }

    return 0;
}