package dsa;

class StackNode {
    int data;
    StackNode next;

    StackNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MyStack {
    private StackNode top;
    private int size;

    public MyStack() {
        top = null;
        size = 0;
    }

    // Push element onto stack
    public void push(int value) {
        StackNode newNode = new StackNode(value);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Pop element from stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1; // or throw exception
        }
        int value = top.data;
        top = top.next;
        size--;
        return value;
    }

    // Peek top element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; 
        }
        return top.data;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Get size of stack
    public int size() {
        return size;
    }

    // Display stack
    public void display() {
        StackNode current = top;
        System.out.print("Stack (top to bottom): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

