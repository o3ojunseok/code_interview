package basic.collection.structure;

import java.util.NoSuchElementException;

public class StackExample {
    private int[] array;
    private int cursor = 0;

    public StackExample(int stackSize) {
        this.array = new int[stackSize];
    }

    public static void main(String[] args) {
        StackExample stack = new StackExample(4);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("pop" + " " + stack.pop());
        System.out.println("peek" + " " +stack.peek());
        System.out.println("pop2" + " " + stack.pop());
    }

    private int peek() {
        return array[cursor - 1];
    }

    private int pop() {
        if (cursor > 0) {
            return array[--cursor];
        } else {
            throw new NoSuchElementException();
        }
    }

    private void push(int i) {
        if (cursor < array.length) {
            array[cursor++] = i;
            System.out.println("push 완료");
        } else {
            System.out.println("stack is full.");
        }
    }
}
