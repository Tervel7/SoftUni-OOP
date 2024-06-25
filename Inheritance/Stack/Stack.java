package Inheritance.Stack;

import java.util.ArrayList;

public class Stack {
    private ArrayList<String> data;
    private int index;

    Stack() {
        this.data = new ArrayList<>();
        index = 0;
    }

    public void push(String s) {
        this.data.add(0,s);
        this.index++;
    }

    public String pop() {
        this.index--;
        return this.data.remove(0);
    }

    public String peek() {
        return this.data.get(0);
    }

    public boolean isEmpty() {
        return this.data.isEmpty();
    }

    public String toString() {
        return this.data.toString();
    }
}
