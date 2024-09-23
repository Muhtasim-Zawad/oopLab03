package test;

import org.junit.Test;
import src.MinStack;

import static org.junit.jupiter.api.Assertions.*;

public class MinStackTest {
    int minResult;

    @Test
    public void testMinStack1() {
        MinStack minStack = new MinStack();
        minStack.push(3);
        minStack.push(2);
        minStack.push(5);
        minStack.push(1);
        assertEquals(1, minStack.min());
    }

    @Test
    public void testMinStack2() {
        MinStack minStack = new MinStack();
        minStack.push(3);
        minStack.push(2);
        minStack.push(5);
        minStack.push(1);
        minStack.pop();
        assertEquals(2, minStack.min());
    }

    @Test
    public void testMinStack3() {
        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.push(2);
        minStack.push(3);
        minStack.push(4);
        assertEquals(1, minStack.min());
    }

}