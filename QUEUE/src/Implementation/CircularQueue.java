package Implementation;

public class CircularQueue {
    static int[] arr;
    static int size;
    static int front = -1;
    static int rear;

    public CircularQueue(int n) {
        arr = new int[n];
        size = n;
        rear = -1;
    }

    public boolean isEmpty() {
        return rear == -1 && front == -1;
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        if(front == -1)
        {
            front = 0;
        }

        rear = (rear + 1) % size;
        arr[rear] = data;
    }

    public int dequeue() {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }

        int result = arr[front];

        //Last element deletion
        if(rear == front){
            rear = front = -1;
        }
        else{
            front = (front + 1) % size;
        }

        return result;
    }

    public int peek() {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        while(!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }
    }
}
