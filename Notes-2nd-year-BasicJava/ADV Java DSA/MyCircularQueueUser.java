
class MyCircularQueue {
    int capacity;
    int[] arr;
    int front, rear;
    int size;

    MyCircularQueue(int cap) {
        capacity = cap;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    void enque(int val) {
        if (isFull()) {
            System.out.println("Queue is Full !!");
            return;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = val;
        size++;
    }

    int deque() {
        if (isEmpty()) {
            System.out.println("Queue is Empty !!");
            return -1;
        }
        int temp = arr[front];
        arr[front] = 0;
        front = (front + 1) % capacity;
        size--;
        return temp;

        // return arr[front++];
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty !!");
            return -1;
        }
        return arr[front];

    }

    boolean isEmpty() {
        // return front > rear;
        return size == 0;
    }

    boolean isFull() {
        // return rear == capacity -1;
        return size == capacity;
    }

    void print() {
        // for(int i = front ; i <= rear ; i++){
        // System.out.print(arr[i] + " ");
        // }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

public class MyCircularQueueUser {

    public static void main(String[] args) {
        MyQueue mq = new MyQueue(6);

        mq.enque(10);
        mq.enque(20);
        mq.enque(30);
        mq.enque(40);
        mq.enque(50);
        mq.enque(60);
        // mq.enque(70);

        mq.deque();
        mq.deque();
        mq.deque();
        mq.deque();

        mq.enque(70);
        mq.enque(80);
        mq.enque(90);
        mq.enque(11);
        // mq.enque(22);

        mq.print();

    }

}
