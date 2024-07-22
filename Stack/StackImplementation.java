package DSA.Stack;

class Stack {

    int top;
    int[] arr;
    int size;

    Stack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack Overflow!");
        } else {
            top++;
            arr[top] = data;
        }
    }
    
    void pop() {
        if (top < 0) {
            System.out.println("Stack Underflow!");
        } else {
            top--;
        }
    }
    
    int top() {

        if (top < 0) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return arr[top];
        }
    }
    
    boolean isEmpty() {

        if (top >= 0) {
            return false;
        } else {
            return true;
        }
    }
}

public class StackImplementation {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(45);
        stack.push(35);
        stack.push(25);
        stack.push(15);
        stack.push(55);
        stack.push(65);

        System.out.println(stack.isEmpty());
        stack.pop();
        System.out.println(stack.top());
    }
}
