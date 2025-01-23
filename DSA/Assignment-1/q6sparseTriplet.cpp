// Write a CPP program to represent sparse matrix in Triplet Representation.
#include<iostream>
using namespace std;

int main(){

    int matrix[3][3];

    cout<<"\n Enter the values of the matrix: "<<endl;
    
    int count = 0;

    cout<<"\n Enter the values: "<<endl;
    for(int i = 0; i < 3; i ++){
        for(int j = 0; j < 3; j ++){
            cout<<"a["<<i+1<<"]["<<j<<"]: ";
            cin>>matrix[i][j];
        }
        cout<<endl;
    }

    cout<<"\n Entered values are: "<<endl;

    for(int i = 0; i < 3; i ++){
        for(int j = 0; j < 3; j ++){
            cout<<"a["<<i+1<<"]["<<j+1
            <<"] = "<<matrix[i][j]<<"\t";
            if(matrix[i][j] == 0){
                count++;
            }
        }
        cout<<endl;
    }
    
    if(count > ((3 * 3)/2)){
        int nonZero = (9) - count;
        int tripletMat[3][nonZero];

        int k = 0;

        cout<<"\n The sparse matrix triplet representation: "<<endl;
        for(int i = 0; i < 3; i ++){
            for(int j = 0; j < 3; j ++){
                if(matrix[i][j] != 0){
                    tripletMat[0][k] = i;
                    tripletMat[1][k] = j;
                    tripletMat[2][k] = matrix[i][j];
                    k++;
                }
            }
        }

        cout<<"\n Row\tColumn\tValue" <<endl;
        for(int i = 0; i < 3; i ++){
            cout<<tripletMat[0][i]<<tripletMat[1][i]<<tripletMat[2][i]<<endl;;
        }
        cout<<endl;
    }else{
        cout<<"\n The entered matrix is not a sparse matrix";
    }
    cout<<endl;
    return 0;
}