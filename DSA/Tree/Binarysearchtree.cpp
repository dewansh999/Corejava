#include <iostream>
using namespace std;

class TreeNode
{
public:
  int data;
  TreeNode *left;
  TreeNode *right;

  TreeNode(int d) : data(d), left(nullptr), right(nullptr) {}
};

class BinarySearchTree
{
public:
  TreeNode *root;

  BinarySearchTree() : root(nullptr) {}

  TreeNode *insert(TreeNode *root, int data)
  {
    if (root == nullptr)
    {
      root = new TreeNode(data);
    }
    else if (data <= root->data)
    {
      root->left = insert(root->left, data);
    }
    else
    {
      root->right = insert(root->right, data);
    }
    return root;
  }

  void printPreOrder(TreeNode *root) const
  {
    if (root == nullptr)
      return;
    cout << root->data << "\t";
    printPreOrder(root->left);
    printPreOrder(root->right);
  }

  void printInOrder(TreeNode *root) const
  {
    if (root == nullptr)
      return;
    printInOrder(root->left);
    cout << root->data << "\t";
    printInOrder(root->right);
  }

  void printPostOrder(TreeNode *root) const
  {
    if (root == nullptr)
      return;
    printPostOrder(root->left);
    printPostOrder(root->right);
    cout << root->data << "\t";
  }

  int search(TreeNode *root, int x) const
  {
    if (root == nullptr || root->data == x)
    {
      return (root == nullptr) ? -1 : root->data;
    }
    else if (x < root->data)
    {
      return search(root->left, x);
    }
    else
    {
      return search(root->right, x);
    }
  }
};

int main()
{
  BinarySearchTree bst;
  bst.root = bst.insert(bst.root, 10);
  bst.insert(bst.root, 5);
  bst.insert(bst.root, 12);
  bst.insert(bst.root, 3);
  bst.insert(bst.root, 7);

  cout << "Print Tree Data in Preorder Tree Traversal\n";
  bst.printPreOrder(bst.root);
  cout << "\nPrint Tree Data in Inorder Tree Traversal\n";
  bst.printInOrder(bst.root);
  cout << "\nPrint Tree Data in Postorder Tree Traversal\n";
  bst.printPostOrder(bst.root);
  cout << "\nSearching using BST: " << bst.search(bst.root, 17) << endl;

  return 0;
}
