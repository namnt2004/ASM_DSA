public class Exampleofencapsulations {
    private int[] elements;
    private int top;
    private int maxSize;

    public Exampleofencapsulations(int size) {
        elements = new int[size];
        maxSize = size;
        top = -1;
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            elements[++top] = value;
        } else {
            System.out.println("Stack overflow");
        }
    }

    public int pop() {
        if (top >= 0) {
            return elements[top--];
        } else {
            System.out.println("Stack underflow");
            return -1;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

