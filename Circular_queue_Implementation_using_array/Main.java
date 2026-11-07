class CircularQueue{
    int front;
    int rear;
    int[] arr;
    int count;
    int size;
    public CircularQueue(int size){
        this.size = size;
        arr = new int[size];
        front = 0;
        rear = -1;
        count = 0;
    }
    public void enqueue(int value){
        if(count == size){
            System.out.println("Queue overflow");
            return;
        }
        rear = (rear+1) % size;
        arr[rear] = value;
        count++;
    }
    public int dequeue(){
        if(isEmpty()){
            throw new RuntimeException("Queue is Empty");
        }
        int val = arr[front];
        front = (front+1) % size;
        count--;
        return val;
    }
    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Queue is Empty");
        }
        return arr[front];
    }
    public boolean isEmpty(){
        return count == 0;
    }
    public int size(){
        return count;
    }
}
public class Main {
    public static void main(String[] args) {
                CircularQueue q = new CircularQueue(3);

        // Test enqueue
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Size: " + q.size());       // 3
        System.out.println("Front: " + q.peek());      // 10

        // Test overflow
        q.enqueue(40);  // Queue overflow

        // Test dequeue
        System.out.println("Removed: " + q.dequeue()); // 10
        System.out.println("Removed: " + q.dequeue()); // 20

        // Test circular behavior: reuse freed positions
        q.enqueue(40);
        q.enqueue(50);

        System.out.println("Front: " + q.peek());      // 30
        System.out.println("Size: " + q.size());       // 3

        // Remove all remaining elements
        while (!q.isEmpty()) {
            System.out.println("Removed: " + q.dequeue());
        }

        System.out.println("Is empty: " + q.isEmpty()); // true
        
    }
}
