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

// Function to add a new node at the start of the list
Node *addNodeAtStart(Node *head, int data)
{
  Node *newNode = new Node(data); // Create a new node with the given data
  newNode->next = head;           // Point the new node's next pointer to the current head
  return newNode;                 // Return the new node as the new head
}

// Function to add a new node at the end of the list
Node *addNodeAtEnd(Node *head, int data)
{
  Node *newNode = new Node(data); // Create a new node with the given data
  if (head == nullptr)
  {                 // Check if the list is empty
    return newNode; // If empty, the new node becomes the head
  }
  Node *temp = head; // Create a temporary pointer to traverse the list
  while (temp->next != nullptr)
  { // Traverse until the last node
    temp = temp->next;
  }
  temp->next = newNode; // Link the last node to the new node
  return head;          // Return the head of the list
}

// Function to add a new node at a specific position in the list
Node *addNodeAtPosition(Node *head, int data, int position)
{
  if (position <= 0)
  {                                     // Check for invalid position
    cout << "Invalid position" << endl; // Print error message
    return head;                        // Return the original head
  }
  if (position == 1)
  { // If position is 1, call addNodeAtStart
    return addNodeAtStart(head, data);
  }
  Node *newNode = new Node(data); // Create a new node with the given data
  Node *temp = head;              // Create a temporary pointer to traverse the list
  for (int i = 1; i < position - 1; i++)
  { // Traverse until one node before the target position
    if (temp == nullptr)
    {                                     // Check for invalid position
      cout << "Invalid position" << endl; // Print error message
      return head;                        // Return the original head
    }
    temp = temp->next; // Move to the next node
  }
  if (temp == nullptr)
  {                                     // Check for invalid position
    cout << "Invalid position" << endl; // Print error message
    return head;                        // Return the original head
  }
  newNode->next = temp->next; // Link the new node to the next node
  temp->next = newNode;       // Link the previous node to the new node
  return head;                // Return the original head
}

// Function to delete the first node of the list
Node *deleteFirstNode(Node *head)
{
  if (head == nullptr)
  {                                  // Check if the list is empty
    cout << "List is empty" << endl; // Print error message
    return nullptr;                  // Return nullptr
  }
  Node *temp = head; // Create a temporary pointer to store the head
  head = head->next; // Move head to the next node
  delete temp;       // Delete the original head
  return head;       // Return the new head
}

// Function to delete a node at a specific position in the list
Node *deleteNodeAtPosition(Node *head, int position)
{
  if (position <= 0)
  {                                     // Check for invalid position
    cout << "Invalid position" << endl; // Print error message
    return head;                        // Return the original head
  }
  if (position == 1)
  { // If position is 1, call deleteFirstNode
    return deleteFirstNode(head);
  }
  Node *temp = head; // Create a temporary pointer to traverse the list
  for (int i = 1; i < position - 1; i++)
  { // Traverse until one node before the target position
    if (temp == nullptr || temp->next == nullptr)
    {                                     // Check for invalid position
      cout << "Invalid position" << endl; // Print error message
      return head;                        // Return the original head
    }
    temp = temp->next; // Move to the next node
  }
  Node *toDelete = temp->next; // Store the node to be deleted
  temp->next = toDelete->next; // Link the previous node to the next node of the one to be deleted
  delete toDelete;             // Delete the node
  return head;                 // Return the original head
}

// Function to display the elements of the list
void display(Node *head)
{
  if (head == nullptr)
  {                                  // Check if the list is empty
    cout << "List is empty" << endl; // Print message
  }
  else
  {
    cout << "List Elements Are: "; // Print message indicating list elements will be displayed
    Node *temp = head;             // Create a temporary pointer to traverse the list
    while (temp != nullptr)
    {                            // Traverse until the end of the list
      cout << temp->data << " "; // Print the data of the current node
      temp = temp->next;         // Move to the next node
    }
    cout << endl; // Print newline after displaying all elements
  }
}

int main()
{
  Node *head = nullptr; // Initialize the head pointer to nullptr

  // Adding nodes to the list
  head = addNodeAtEnd(head, 10);
  head = addNodeAtEnd(head, 20);
  head = addNodeAtEnd(head, 30);
  head = addNodeAtEnd(head, 40);
  head = addNodeAtEnd(head, 50);

  // Displaying the initial list
  display(head);

  // Adding a new node at the start of the list
  head = addNodeAtStart(head, 5);

  // Displaying the list after adding a node at the start
  display(head);

  // Adding a new node at a specific position in the list
  head = addNodeAtPosition(head, 25, 3);

  // Displaying the list after adding a node at a specific position
  display(head);

  // Deleting the first node of the list
  head = deleteFirstNode(head);

  // Displaying the list after deleting the first node
  display(head);

  // Deleting a node at a specific position in the list
  head = deleteNodeAtPosition(head, 3);

  // Displaying the list after deleting a node at a specific position
  display(head);

  return 0;
}
