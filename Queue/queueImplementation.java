package DSA.Queue;

class Queue {
    int size;
    int[] arr;
    int front = 0;
    int rear = 0;

    Queue(int size) {
        this.size = size;
        arr = new int[size];
    }

    public boolean isEmpty() {
        if (rear == front) {
            return true;
        }
        return false;
    }

    public void Enqueue(int data) {
        if (rear == size) {
            System.out.println("Queue is full");
            return;
        }
        arr[rear] = data;
        rear++;
    }
    
    public void Dequeue() {
        if (rear == front) {
            System.out.println("Queue is empty");
            return;
        }
        arr[front] = -1;
        front++;
        if (front == rear) {
            front = 0;
            rear = 0;
        }
    }

    public int getRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return 0;
        }
        return arr[rear-1];
    }
    public int getFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return 0;
        }
        return arr[front];
    }
}

public class queueImplementation {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.Enqueue(1);
        q.Enqueue(3);
        q.Enqueue(5);
        q.Enqueue(8);

        System.out.println(q.getFront());
        q.Dequeue();
        System.out.println(q.getFront());
        System.out.println(q.isEmpty());
        System.out.println(q.getRear());

    }
}
