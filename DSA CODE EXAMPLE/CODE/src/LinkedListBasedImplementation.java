class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListQueue {
    private Node front;
    private Node rear;

    public LinkedListQueue() {
        front = rear = null;
    }

    // Thêm phần tử vào cuối hàng đợi
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) { // Nếu hàng đợi rỗng
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Enqueued: " + value);
    }

    // Xóa và trả về phần tử ở đầu hàng đợi
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int value = front.data;
            front = front.next;
            if (front == null) { // Nếu hàng đợi trở nên rỗng sau khi xóa
                rear = null;
            }
            System.out.println("Dequeued: " + value);
            return value;
        }
    }

    // Kiểm tra hàng đợi có rỗng không
    public boolean isEmpty() {
        return front == null;
    }
}
public class LinkedListBasedImplementation {
    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.dequeue();
    }
}
