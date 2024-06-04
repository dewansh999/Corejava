#include <iostream>
using namespace std;

// Node class for the singly linked list
class Node
{
public:
  int data;   // Data stored in the node
  Node *next; // Pointer to the next node

  // Constructor
  Node(int d) : data(d), next(nullptr) {} // Initialize data and next pointer
};

// Function to display the elements of the linked list
void display(Node *head)
{
  if (head == nullptr)
  {                                  // Check if the list is empty
    cout << "List is Empty" << endl; // Print message if list is empty
  }
  else
  {
    cout << "List Elements Are:" << endl; // Print message indicating list elements will be displayed
    Node *temp = head;                    // Create a temporary pointer to traverse the list
    while (temp != nullptr)
    {                               // Loop until end of list is reached
      cout << "==> " << temp->data; // Print data of current node
      temp = temp->next;            // Move to next node
    }
    cout << endl; // Print newline after displaying all elements
  }
}

int main()
{
  // Creating linked list nodes
  Node *head = new Node(10);       // Create head node with data 10
  Node *secondNode = new Node(20); // Create second node with data 20
  Node *thirdNode = new Node(30);  // Create third node with data 30
  Node *fourthNode = new Node(40); // Create fourth node with data 40
  Node *fifthNode = new Node(50);  // Create fifth node with data 50

  // Linking the nodes together
  head->next = secondNode;      // Link head to second node
  secondNode->next = thirdNode; // Link second node to third node
  thirdNode->next = fourthNode; // Link third node to fourth node
  fourthNode->next = fifthNode; // Link fourth node to fifth node

  // Displaying the linked list
  display(head); // Call display function to print elements of the linked list

  // Freeing memory (not implemented in this example)

  return 0; // Exit the program
}
