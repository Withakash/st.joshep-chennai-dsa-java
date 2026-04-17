class MyDeque {

    int capacity;
    int[] arr;
    int front, rear;
    int size;

    MyDeque(int cap) {
        capacity = cap;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // 🔹 insert at front
    void insertFirst(int val) {
        if (isFull()) {
            System.out.println("Deque is Full !!");
            return;
        }

        front = (front - 1 + capacity) % capacity;
        arr[front] = val;
        size++;
    }

    // 🔹 insert at rear
    void insertLast(int val) {
        if (isFull()) {
            System.out.println("Deque is Full !!");
            return;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = val;
        size++;
    }

    // 🔹 delete from front
    int deleteFirst() {
        if (isEmpty()) {
            System.out.println("Deque is Empty !!");
            return -1;
        }

        int temp = arr[front];
        arr[front] = 0;
        front = (front + 1) % capacity;
        size--;
        return temp;
    }

    // 🔹 delete from rear
    int deleteLast() {
        if (isEmpty()) {
            System.out.println("Deque is Empty !!");
            return -1;
        }

        int temp = arr[rear];
        arr[rear] = 0;
        rear = (rear - 1 + capacity) % capacity;
        size--;
        return temp;
    }

    // 🔹 get front
    int getFront() {
        if (isEmpty()) return -1;
        return arr[front];
    }

    // 🔹 get rear
    int getRear() {
        if (isEmpty()) return -1;
        return arr[rear];
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == capacity;
    }

    void print() {
        for (int i = 0; i < capacity; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
