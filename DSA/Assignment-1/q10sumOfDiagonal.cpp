// Write a CPP program to sum all the diagonal element.
#include<iostream>
using namespace std;

class Solution{
public:
    void print(int mat[][10], int size){
        int sum = 0;
        cout<<"\n Printing the sum of diagonal elements: "<<endl;
        for(int i = 0; i < size; i ++){
            for(int j = 0; j < size; j ++){
                if(i == j){
                    sum += mat[i][j];
                }else{
                    continue;
                }
            }
        }
        cout<<"\n The sum of all diagonal elements = "<<sum<<endl;
    }

};

int main(){
    
    int size;
    cout<<"\n Enter the rows and columns of the matrix: ";
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