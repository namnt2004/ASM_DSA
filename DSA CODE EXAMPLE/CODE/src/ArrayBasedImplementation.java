class ArrayQueue{
    private int[] queue;
    private int front; // Chỉ số đầu của hàng đợi
    private int rear;  // Chỉ số cuối của hàng đợi

    public ArrayQueue(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = -1;
    }
    public void enqueue(int value) {
        if (rear == queue.length - 1) { // Kiểm tra hàng đợi có đầy không
            System.out.println("Queue is full");
        } else {
            queue[++rear] = value;
            System.out.println("Enqueued: " + value);
        }
    }

    // Xóa và trả về phần tử đầu hàng đợi
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int value = queue[front++];
            System.out.println("Dequeued: " + value);
            return value;
        }
    }

    // Kiểm tra hàng đợi có rỗng không
    public boolean isEmpty() {
        return front > rear;
    }
}
public class ArrayBasedImplementation {

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();
        queue.dequeue();
    }
}
