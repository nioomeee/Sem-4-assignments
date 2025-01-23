// Write a CPP program to create a Matrix and print Upper Triangular.
#include<iostream>
using namespace std;

class Solution{
public:
    void print(int mat[][10], int size){
        cout<<"\n Printing the lower triangle of the matrix: "<<endl;
        for(int i = 0; i < size; i ++){
            for(int j = 0; j < size; j ++){
                if(i >= j){
                    cout<<mat[i][j]<<"\t";
                }else{
                    cout<<"0\t";
                }
            }
            cout<<endl;
    }
    }
};

int main(){
    
    int size;
    cout<<"\n Enter the rows and olumns of the matrix: ";
    cin>>size;

    int mat[10][10];

    for(int i = 0; i < size; i ++){
        for(int j = 0; j < size; j ++){
            cout<<"matrix["<<i+1<<"]["<<j+1<<"]: ";
            cin>>mat[i][j];
        }
    }

    cout<<"\n Entered values are: "<<endl;
    for(int i = 0; i < size; i ++){
        for(int j = 0; j < size; j ++){
            cout<<"a["<<i+1<<"]["<<j<<"] = "<<mat[i][j]<<"\t";
        }
        cout<<endl;
    }

    Solution sol;
    sol.print(mat, size);

    cout<<endl;
    return 0;
}