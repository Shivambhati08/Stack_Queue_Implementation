import java.util.ArrayList;
class Stack{
    ArrayList<Integer> arr;
    public Stack(){
        arr = new ArrayList<>();
    }
    public void push(int value){
        arr.add(value);
    }
    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack underflow");
        }
        return arr.removeLast();
    }
    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Stack is Empty");
        }
        return arr.getLast();
    }
    public boolean isEmpty(){
        return arr.isEmpty();
    }
    public int size(){
        return arr.size();
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
