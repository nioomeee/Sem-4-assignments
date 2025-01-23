// Write a CPP program to create a matrix and check whether that matrix is diagnol matrix
// or not.
#include<iostream>
using namespace std;

class Solution{
public:
    bool isDiagonal(int matrix[][3]){
        for(int i = 0; i < 3; i ++){
            for(int j = 0; j < 3; j ++){
                if(i != j && matrix [i][j]!= 0){
                    return false;
                }
            }
        }
        return true;
    }
};

int main(){
    
    int matrix[3][3];
    cout<<"\n ENter the values of the matrix: "<<endl;
    
    for(int i = 0; i < 3; i ++){
        for(int j = 0; j < 3; j ++){
            cout<<"a["<<i+1<<"]["<<j+1<<"]: ";
            cin>>matrix[i][j];
        }
    }

    cout<<"\n Entered values are: "<<endl;
    for(int i = 0; i < 3; i ++){
        for(int j = 0; j < 3; j ++){
            cout<<"a["<<i+1<<"]["<<j<<"] = "<<matrix[i][j]<<"\t";
        }
        cout<<endl;
    }

    Solution sol;

    if(sol.isDiagonal(matrix)){
        cout<<"\n The entered matrix is a diagonal matrix";
    }else{
        cout<<"\n The entered matrix is not a diagonal matrix";
    }

    cout<<endl;
    return 0;
}