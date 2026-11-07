class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        next = null;
    }
}
class Stack{
    Node top;
    public Stack(){
        top = null;
    }
    public void push(int data){
        Node newnode = new Node(data);
        newnode.next = top;
        top = newnode;
    }
    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack underflow");
        }
        int val = top.data;
        top = top.next;
        return val;
    }
    public boolean isEmpty(){
        return top == null;
    }
    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Stack is Empty");
        }
        return top.data;
    }
}
public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.peek());    // 30
        System.out.println(stack.pop());     // 30
        System.out.println(stack.pop());     // 20
        System.out.println(stack.isEmpty()); // false
    }
}
