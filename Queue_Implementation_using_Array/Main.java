class Queue{
    int front;
    int rear;
    int[] arr;
    public Queue(int capacity){
        arr = new int[capacity];
        front = 0;
        rear = -1;
    }
    public void enqueue(int val){
        if(rear == arr.length-1){
            System.out.println("Queue overflow");
            return;
        }
        rear++;
        arr[rear] = val;
    }
    public int dequeue(){
        if(isEmpty()){
            throw new RuntimeException("Queue underflow");
        }
        return arr[front++];
    }
    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Queue is Empty");
        }
        return arr[front];
    }
    public boolean isEmpty(){
        return front > rear;
    }
    public int size(){
        return rear-front+1;
    }
}
public class Main{
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);

        System.out.println(q.size());
    }
}