// 1. Write a C program to create a tree and perform Preorder on it.
// 2. Write a C program to create a tree and perform Inorder on it.
// 3. Write a C program to create a tree and perform Postorder on it.

#include<iostream>
using namespace std;

class Node{
public:
    int data;
    Node* left;
    Node* right;

    Node(int val) {
        data = val;
        left = right = NULL;
    }
};

class Tree {
public:
    Node* root;

    Tree() {
        root = NULL;
    }

    void insert(Node* &root, int val) {
        if(root == NULL) {
            root = new Node(val);
            return;
        }
        if (val < root->data) {
            insert(root->left, val);
        } else {
            insert(root->right, val);
        }
    }

    void preOrder(Node* root) {
        if(root == NULL) {
            return;
        }

        cout << root->data <<" ";
        preOrder(root->left);
        preOrder(root->right);
    }
    
    void inorder(Node* root) {
        if(root == NULL) {
            return;
        }
        inorder(root->left);
        cout << root->data << " ";
        inorder(root->right);
    }

    void postOrder(Node* root) {
        if(root == NULL) {
            return;
        }
        postOrder(root->left);
        postOrder(root->right);
        cout << root->data << " ";
    }

    int find_max(Node* root) {
        if(root == NULL) {
            return 0;
        }
        int leftmax = find_max(root->left);
        int rightmax = find_max(root->right);

        return max(root->data, max(leftmax, rightmax));
    }
};

int main(){
    
    Tree t;
    t.insert(t.root, 10);
    t.insert(t.root, 20);
    t.insert(t.root, 8);
    t.insert(t.root, 6);
    t.insert(t.root, 30);
    t.insert(t.root, 15);

    cout<<"\nPreorder = " <<endl;
    t.preOrder(t.root);
    cout<<"\nInorder = " <<endl;
    t.inorder(t.root);
    cout<<"\nPost order = " <<endl;
    t.postOrder(t.root);

    cout << "The maximum = "<<t.find_max(t.root);
    cout<<endl;
    return 0;
}
