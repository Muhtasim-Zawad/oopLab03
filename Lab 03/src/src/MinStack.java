package src;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> orgStack;
    private Stack<Integer> tempStack;

    public MinStack() {
        orgStack = new Stack<>();
        tempStack = new Stack<>();
    }

    public void push(int num) {
        orgStack.push(num);
        if(tempStack.isEmpty() || num < tempStack.peek()) {
            tempStack.push(num);
        }
    }

    public void pop() {
        if (!orgStack.isEmpty()) {
            int tempValue = orgStack.pop();
            if (tempValue == tempStack.peek()) {
                tempStack.pop();
            }
        }
    }

    public int min() {
        if (!tempStack.isEmpty()) {
            return tempStack.peek();
        }
        throw new IllegalStateException("Stack is empty");
    }
}
