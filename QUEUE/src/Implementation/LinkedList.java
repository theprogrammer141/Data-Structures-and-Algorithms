package Implementation;

public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Queue{
        static Node head = null;
        static Node tail = null;

        public boolean isEmpty(){
            return head == null && tail == null;
        }

        public void enqueue(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        public int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return 0;
            }

            int front = head.data;
            if(tail == head){
                tail = head = null;
            }
            else{
                head = head.next;
            }

            return front;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return 0;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue queue = new Queue();
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
