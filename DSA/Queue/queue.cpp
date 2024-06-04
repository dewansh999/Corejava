#include <iostream>
using namespace std;

const int QUEUE_SIZE = 5;
int queue[QUEUE_SIZE];
int front = -1;
int rear = -1;

// Function to enqueue an element into the queue
void enqueue(int data)
{
    if (rear == QUEUE_SIZE - 1)
    {                                    // Check if the queue is full
        cout << "Queue is full" << endl; // Print error message if queue is full
        return;                          // Exit the function
    }
    else
    {
        if (front == -1)
        {              // Check if the queue is initially empty
            front = 0; // Set front to 0
        }
        rear++;                              // Increment the rear pointer
        queue[rear] = data;                  // Add data to the queue
        cout << "Enqueued " << data << endl; // Print success message
    }
}

// Function to display the elements of the queue
void display()
{
    if (front == -1)
    {                                     // Check if the queue is empty
        cout << "Queue is empty" << endl; // Print message indicating queue is empty
    }
    else
    {
        cout << "Elements of the Queue: "; // Print message indicating queue elements will be displayed
        for (int i = front; i <= rear; i++)
        {                            // Loop through the queue from front to rear
            cout << queue[i] << " "; // Print each element of the queue
        }
        cout << endl; // Print newline after displaying all elements
    }
}

// Function to dequeue an element from the queue
int dequeue()
{
    if (front == -1)
    {                                     // Check if the queue is empty
        cout << "Queue is empty" << endl; // Print error message if queue is empty
        return -1;                        // Return -1 to indicate failure
    }
    else
    {
        int dequeued = queue[front]; // Store the value at the front of the queue
        if (front == rear)
        {                      // Check if there is only one element in the queue
            front = rear = -1; // Reset front and rear pointers to indicate empty queue
        }
        else
        {
            front++; // Increment the front pointer
        }
        cout << "Dequeued " << dequeued << endl; // Print success message
        return dequeued;                         // Return the dequeued value
    }
}

// Function to peek at the front element of the queue
int peek()
{
    if (front == -1)
    {                                     // Check if the queue is empty
        cout << "Queue is empty" << endl; // Print message indicating queue is empty
        return -1;                        // Return -1 to indicate failure
    }
    else
    {
        return queue[front]; // Return the value at the front of the queue
    }
}

int main()
{
    enqueue(10); // Enqueue 10 into the queue
    enqueue(20); // Enqueue 20 into the queue
    enqueue(30); // Enqueue 30 into the queue
    enqueue(40); // Enqueue 40 into the queue
    enqueue(50); // Enqueue 50 into the queue

    display(); // Display the elements of the queue

    cout << "Front element: " << peek() << endl;       // Display the front element of the queue
    cout << "Dequeued element: " << dequeue() << endl; // Dequeue an element from the queue and display it
    cout << "Dequeued element: " << dequeue() << endl; // Dequeue an element from the queue and display it

    display(); // Display the updated elements of the queue

    return 0; // Exit the program
}
