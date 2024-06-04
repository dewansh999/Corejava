#include <iostream>
using namespace std;

const int STACK_SIZE = 5;
int stack[STACK_SIZE];
int top = -1;

void push(int data)
{
    if (top == STACK_SIZE - 1)
    {                                              // Check if the stack is full
        cout << "Overflow: Stack is full" << endl; // Print error message if stack is full
        return;                                    // Exit the function
    }
    top++;                                                  // Increment the top pointer
    stack[top] = data;                                      // Add data to the stack
    cout << "Pushed " << data << " onto the stack" << endl; // Print success message
}

int pop()
{
    if (top == -1)
    {                                                // Check if the stack is empty
        cout << "Underflow: Stack is empty" << endl; // Print error message if stack is empty
        return -1;                                   // Return -1 to indicate failure (or throw an exception)
    }
    int popped = stack[top];                                  // Store the value at the top of the stack
    top--;                                                    // Decrement the top pointer
    cout << "Popped " << popped << " from the stack" << endl; // Print success message
    return popped;                                            // Return the popped value
}

int peek()
{
    if (top == -1)
    {                                     // Check if the stack is empty
        cout << "Stack is empty" << endl; // Print message indicating stack is empty
        return -1;                        // Return -1 to indicate failure (or throw an exception)
    }
    return stack[top]; // Return the value at the top of the stack
}

bool isEmpty()
{
    return top == -1; // Return true if the stack is empty, false otherwise
}

string display()
{
    string result = "Stack:"; // Initialize result string
    if (top == -1)
    {                       // Check if the stack is empty
        result += " Empty"; // Add "Empty" to result if stack is empty
    }
    else
    {
        for (int i = top; i >= 0; i--)
        {                                        // Loop through the stack from top to bottom
            result += " " + to_string(stack[i]); // Add each element of the stack to the result string
        }
    }
    return result; // Return the result string
}

int main()
{
    push(10); // Push 10 onto the stack
    push(20); // Push 20 onto the stack
    push(30); // Push 30 onto the stack
    push(40); // Push 40 onto the stack
    push(50); // Push 50 onto the stack

    cout << display() << endl; // Display the contents of the stack

    cout << "Top element: " << peek() << endl;   // Display the top element of the stack
    cout << "Popped element: " << pop() << endl; // Pop an element from the stack and display it

    cout << display() << endl; // Display the updated contents of the stack

    cout << "Is stack empty? " << (isEmpty() ? "Yes" : "No") << endl; // Check if the stack is empty and display the result

    return 0; // Exit the program
}
