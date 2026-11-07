class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        next = null;
    }
}
class Queue{
    Node front;
    Node rear;
    public Queue(){
        front = null;
        rear = null;
    }
    public void enqueue(int data){
        Node newnode = new Node(data);
        if(rear == null){
            front = rear = newnode;
            return;
        }
        rear.next = newnode;
        rear = newnode;
    }
    public int dequeue(){
        if(isEmpty()){
            throw new RuntimeException("Queue is underflow");
        }
        int val = front.data;
        front = front.next;

        if(front == null){
            rear = null;
        }
        return val;
    }
    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Queue is Empty");
        }
        return front.data;
    }
    public boolean isEmpty(){
        return front == null;
    }
}
public class Main {
    public static void main(String[] args) {
            Queue q = new Queue();

    // Enqueue elements
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);

    System.out.println("Front: " + q.peek());      // 10

    // Dequeue elements
    System.out.println("Removed: " + q.dequeue()); // 10
    System.out.println("Removed: " + q.dequeue()); // 20

    System.out.println("Front: " + q.peek());      // 30

    System.out.println("Removed: " + q.dequeue()); // 30

    System.out.println("Is empty: " + q.isEmpty()); // true

    // Test reuse after becoming empty
    q.enqueue(40);
    System.out.println("Front: " + q.peek());      // 40
    }
}
