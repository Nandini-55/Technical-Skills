//Queue - non-primitive ,linear data structure follows FIFO(Fisrt In First Out) Principle.
// Operations
//Enqueue-insert element in queue
//Dequeue-remove element from queue
//Peek-get the front of queue
//isEmpty-check queue is empty or not
//isFull-check queue is full or not

//Q- Implement queue using array
//Enqueue-insert element in queue
//Dequeue-remove element from queue
//Peek-get the front of queue
//isEmpty-check queue is empty or not
//display()- print all element of the queue

class Queue {

    int capacity;
    int[] q;
    int front;
    int rear;

    Queue(int size) {
        capacity = size;
        q = new int[capacity];
        front = 0;
        rear = -1;
    }

    public void enqueue(int ele) {
        if (rear == capacity - 1) {
            System.out.println("Queue is full. ");
            return;
        }
        rear++;
        q[rear] = ele;
    }

    public int dequeue() {
        if (front > rear) {
            System.out.println("Stack is empty. ");
            return -1;
        }
        int val = q[front];
        front++;
        return val;
    }

    public boolean isEmpty() {
        if (front > rear) {
            return true;
        }
        return false;
    }
    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. ");
            return -1;
        }
        return q[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty. ");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(q[i] + " ");
        }
        System.out.println();
    }

}

public class QueueBasics {

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(7);
        q.enqueue(8);
        System.out.println(q.peek());
        q.display();
    }
}