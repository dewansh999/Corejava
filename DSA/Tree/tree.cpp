#include <iostream>
#include <memory> // for smart pointers
using namespace std;

// Define a class for the nodes of the binary tree
class Tree
{
public:
    int data;                    // Data stored in the node
    std::unique_ptr<Tree> left;  // Smart pointer to the left child node
    std::unique_ptr<Tree> right; // Smart pointer to the right child node

    // Constructor to initialize the node with data
    Tree(int d) : data(d), left(nullptr), right(nullptr) {}
};

// Function to print the tree data in Preorder traversal
void printPreOrder(const Tree *root)
{
    if (root == nullptr)
    {
        return;
    }
    // Print the data of the current node
    cout << root->data << "\t";
    // Recursively traverse the left subtree
    printPreOrder(root->left.get());
    // Recursively traverse the right subtree
    printPreOrder(root->right.get());
}

// Function to print the tree data in Inorder traversal
void printInOrder(const Tree *root)
{
    if (root == nullptr)
    {
        return;
    }
    // Recursively traverse the left subtree
    printInOrder(root->left.get());
    // Print the data of the current node
    cout << root->data << "\t";
    // Recursively traverse the right subtree
    printInOrder(root->right.get());
}

// Function to print the tree data in Postorder traversal
void printPostOrder(const Tree *root)
{
    if (root == nullptr)
    {
        return;
    }
    // Recursively traverse the left subtree
    printPostOrder(root->left.get());
    // Recursively traverse the right subtree
    printPostOrder(root->right.get());
    // Print the data of the current node
    cout << root->data << "\t";
}

int main()
{
    // Create a binary tree and initialize it with some data
    std::unique_ptr<Tree> t1(new Tree(10));
    t1->left = std::make_unique<Tree>(5);
    t1->right = std::make_unique<Tree>(12);
    t1->left->left = std::make_unique<Tree>(3);
    t1->left->right = std::make_unique<Tree>(7);

    // Print the tree data in Preorder traversal
    cout << "Print Tree Data in Preorder Tree Traversal" << endl;
    printPreOrder(t1.get());
    // Print the tree data in Inorder traversal
    cout << "\nPrint Tree Data in Inorder Tree Traversal" << endl;
    printInOrder(t1.get());
    // Print the tree data in Postorder traversal
    cout << "\nPrint Tree Data in Postorder Tree Traversal" << endl;
    printPostOrder(t1.get());

    return 0;
}
