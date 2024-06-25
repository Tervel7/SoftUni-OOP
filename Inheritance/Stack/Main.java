package Inheritance.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push("a");
        stack.push("b");
        stack.push("c");

        System.out.println(stack.toString());

        System.out.println(stack.pop());

        System.out.println(stack.toString());
    }
}
