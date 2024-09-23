package src;

public class Main {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(3);
        minStack.push(2);
        minStack.push(5);
        minStack.push(1);
        minStack.pop();
        System.out.println(minStack.min());

        System.out.println("\n");

        FizzyPrinter printer = new FizzyPrinter();
        System.out.println(printer.printFizzy(9, false));
    }
}