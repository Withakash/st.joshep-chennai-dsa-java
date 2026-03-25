# 📘 Day 6 – Queue (All Codes Updated)

---

## 🔹 1. Queue using Array (front = 0, rear = -1)

```java
public class QueueArr {
    int arr[], front, rear, size, capacity;

    QueueArr(int cap) {
        capacity = cap;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    void enqueue(int x) {
        if (size == capacity) {
            System.out.println("Overflow");
            return;
        }
        rear++;
        arr[rear] = x;
        size++;
    }

    int dequeue() {
        if (size == 0) {
            System.out.println("Underflow");
            return -1;
        }
        int val = arr[front];
        front++;
        size--;
        return val;
    }

    void print() {
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueArr q = new QueueArr(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.dequeue();
        q.print();
    }
}
```

---

## 🔹 2. Circular Queue (Using size + capacity)

```java
public class CircularQueue {
    int capacity;
    int[] arr;
    int size ;
    int front;
    int rear;

    CircularQueue(int cap) {
        capacity = cap;
        arr = new int[capacity];
        size = 0;
        front = 0;
        rear = -1;
    }

    boolean isFull(){
        if(size == capacity) return true;
        return false;
    }

    boolean isEmpty(){
        if(size == 0 ) return true;
        return false;
    }

    void enque(int val) {
        if(isFull()) {
            System.out.println("Full !!");
            return;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = val;
        size++;
    }

    int deque(){
        if(isEmpty()){
            System.out.println("Empty");
            return -1;
        }
         int temp = arr[front];
        front = (front + 1)%capacity;
        size--;
        return temp;

    }


    int front(){
        if(isEmpty()) {
            System.out.println("Empty");
            return -1;
        }

        return arr[front];
    }

    void print(){
     if(isEmpty()){
         System.out.println("Empty");
         return;
     }

     int temp = front;
     for(int i =0 ; i < size ; i++){

        System.out.print(arr[temp]+ " ");
          temp = (temp + 1) % capacity;
     }

    }



    public static void main(String[] str) {
        CircularQueue cq = new CircularQueue(8);
          cq.enque(10);
          cq.enque(20);
          cq.enque(30);
          cq.enque(40);
          cq.enque(50);
          cq.enque(60);
          cq.enque(70);
          cq.deque();
          System.out.println(cq.front());
          cq.enque(80);
          cq.enque(90);
          cq.deque();
          cq.print();
          


    }
}

```

---

## 🔹 3. Queue using Linked List (with size)

```java
class Node {
    int data;
    Node next;
    Node(int d) { data = d; }
}

public class QueueLL {
    Node front, rear;
    int size;

    void enqueue(int x) {
        Node temp = new Node(x);

        if (rear == null) {
            front = rear = temp;
        } else {
            rear.next = temp;
            rear = temp;
        }
        size++;
    }

    int dequeue() {
        if (size == 0) return -1;

        int val = front.data;
        front = front.next;

        if (front == null) rear = null;

        size--;
        return val;
    }

    void print() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.dequeue();
        q.print();
    }
}
```

---

## 🔹 4. Deque using Circular Array (size + capacity)

```java
public class DequeArray {

    int capacity;
    int[] arr;
    int size;
    int front;
    int rear;

    DequeArray(int cap) {
        capacity = cap;
        arr = new int[capacity];
        size = 0;
        front = 0;
        rear = -1;
    }

    boolean isFull() {
        return size == capacity;
    }

    boolean isEmpty() {
        return size == 0;
    }

    // 🔹 Insert at Front
    void addFirst(int val) {
        if (isFull()) {
            System.out.println("Deque Full !!");
            return;
        }

        front = (front - 1 + capacity) % capacity;
        arr[front] = val;
        size++;
    }

    // 🔹 Insert at Rear
    void addLast(int val) {
        if (isFull()) {
            System.out.println("Deque Full !!");
            return;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = val;
        size++;
    }

    // 🔹 Remove from Front
    int removeFirst() {
        if (isEmpty()) {
            System.out.println("Deque Empty !!");
            return -1;
        }

        int temp = arr[front];
        front = (front + 1) % capacity;
        size--;
        return temp;
    }

    // 🔹 Remove from Rear
    int removeLast() {
        if (isEmpty()) {
            System.out.println("Deque Empty !!");
            return -1;
        }

        int temp = arr[rear];
        rear = (rear - 1 + capacity) % capacity;
        size--;
        return temp;
    }

    // 🔹 Get Front
    int getFront() {
        if (isEmpty()) {
            System.out.println("Deque Empty !!");
            return -1;
        }
        return arr[front];
    }

    // 🔹 Get Rear
    int getRear() {
        if (isEmpty()) {
            System.out.println("Deque Empty !!");
            return -1;
        }
        return arr[rear];
    }

    // 🔹 Print Deque
    void print() {
        if (isEmpty()) {
            System.out.println("Deque Empty !!");
            return;
        }

        int temp = front;

        for (int i = 0; i < size; i++) {
            System.out.print(arr[temp] + " ");
            temp = (temp + 1) % capacity;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        DequeArray dq = new DequeArray(8);

        dq.addLast(10);
        dq.addLast(20);
        dq.addLast(30);
        dq.addLast(40);

        dq.addFirst(5);
        dq.addFirst(2);

        dq.print();   // 2 5 10 20 30 40

        dq.removeFirst();
        dq.removeLast();

        dq.print();   // 5 10 20 30

        System.out.println(dq.getFront()); // 5
        System.out.println(dq.getRear());  // 30
    }
}
```

---

## 🔹 5. Priority Queue

```java
import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
```

---

## 🔹 6. Queue using Two Stacks

```java
import java.util.*;

public class QueueUsingStack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void enqueue(int x) {
        s1.push(x);
    }

    int dequeue() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.isEmpty() ? -1 : s2.pop();
    }

    public static void main(String[] args) {
        QueueUsingStack q = new QueueUsingStack();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
```

---

# 🎯 End of Day 6 Codes (Optimized Version)




# 📘 Day 6 – Queue (Complete Notes)

---

# 🧠 1. Introduction to Queue (ADT)

## ✅ Definition

Queue follows **FIFO (First In First Out)**

👉 First inserted → First removed

## 🧠 Real-Life Examples

* Ticket counter
* Printer queue
* CPU scheduling

## 🔧 Basic Operations

* `enqueue(x)` → insert
* `dequeue()` → remove
* `peek()` → front element
* `isEmpty()` → check empty

---

# 🧠 2. Queue using Two Pointers

## 💡 Idea

We use:

* `front` → for deletion
* `rear` → for insertion

👉 This avoids O(n) deletion

---

# 🧠 3. Queue using Array

## ❗ Problem

* Wasted space after dequeue

## 📌 Code

```java
class Queue {
    int arr[], front, rear, size;

    Queue(int n) {
        size = n;
        arr = new int[n];
        front = -1;
        rear = -1;
    }

    void enqueue(int x) {
        if (rear == size - 1) {
            System.out.println("Overflow");
            return;
        }
        if (front == -1) front = 0;
        arr[++rear] = x;
    }

    int dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Underflow");
            return -1;
        }
        return arr[front++];
    }
}
```

---

# 🧠 4. Circular Queue

## 💡 Idea

Reuse empty space using circular movement

## 🔁 Formula

* `(rear + 1) % size`

## 📌 Code

```java
class CircularQueue {
    int arr[], front, rear, size;

    CircularQueue(int n) {
        size = n;
        arr = new int[n];
        front = rear = -1;
    }

    void enqueue(int x) {
        if ((rear + 1) % size == front) {
            System.out.println("Full");
            return;
        }

        if (front == -1) front = 0;
        rear = (rear + 1) % size;
        arr[rear] = x;
    }

    int dequeue() {
        if (front == -1) {
            System.out.println("Empty");
            return -1;
        }

        int val = arr[front];

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }

        return val;
    }
}
```

---

# 🧠 5. Queue using Linked List

## 💡 Advantage

* Dynamic size (no overflow)

## 📌 Code

```java
class Node {
    int data;
    Node next;
    Node(int d) { data = d; }
}

class QueueLL {
    Node front, rear;

    void enqueue(int x) {
        Node temp = new Node(x);

        if (rear == null) {
            front = rear = temp;
            return;
        }

        rear.next = temp;
        rear = temp;
    }

    int dequeue() {
        if (front == null) return -1;

        int val = front.data;
        front = front.next;

        if (front == null) rear = null;

        return val;
    }
}
```

---

# 🧠 6. Deque (Double Ended Queue)

## 💡 Concept

* Insert/Delete from both ends

## 🔁 Key Formulas

* addFirst → `(front - 1 + size) % size`
* addLast → `(rear + 1) % size`

## 📌 Code (Circular Array)

```java
class DequeArray {
    int arr[], front, rear, size;

    DequeArray(int n) {
        size = n;
        arr = new int[n];
        front = -1;
        rear = -1;
    }

    boolean isFull() {
        return (front == 0 && rear == size - 1) || (rear + 1) % size == front;
    }

    boolean isEmpty() {
        return front == -1;
    }

    void addFirst(int x) {
        if (isFull()) return;

        if (front == -1) {
            front = rear = 0;
        } else if (front == 0) {
            front = size - 1;
        } else {
            front--;
        }

        arr[front] = x;
    }

    void addLast(int x) {
        if (isFull()) return;

        if (front == -1) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % size;
        }

        arr[rear] = x;
    }

    int removeFirst() {
        if (isEmpty()) return -1;

        int val = arr[front];

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }

        return val;
    }

    int removeLast() {
        if (isEmpty()) return -1;

        int val = arr[rear];

        if (front == rear) {
            front = rear = -1;
        } else if (rear == 0) {
            rear = size - 1;
        } else {
            rear--;
        }

        return val;
    }
}
```

---

# 🧠 7. Priority Queue

## 💡 Concept

* Elements processed by priority (not FIFO)

## 📌 Java Code

```java
import java.util.*;

PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.add(30);
pq.add(10);
pq.add(20);

System.out.println(pq.poll()); // 10
```

## 💡 Max Heap

```java
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
```

---

# 🧠 8. Queue using Two Stacks

## 💡 Idea

* s1 → push
* s2 → pop

## 📌 Code

```java
import java.util.*;

class QueueUsingStack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void enqueue(int x) {
        s1.push(x);
    }

    int dequeue() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.isEmpty() ? -1 : s2.pop();
    }
}
```

---

# 🚀 9. Important Concepts to Add

## 🔥 Applications

* BFS (Graphs & Trees)
* Sliding Window
* CPU Scheduling

## 🔥 Patterns

* Monotonic Queue
* Multi-source BFS

---

# 🧩 10. LeetCode Practice

## 🟢 Easy

* Implement Queue using Stacks (#232)
* Number of Recent Calls (#933)

## 🟡 Medium

* Binary Tree Level Order Traversal (#102)
* Rotting Oranges (#994)
* Sliding Window Maximum (#239)
* Design Circular Queue (#622)

---

# 🎯 Final Revision

* FIFO → Queue
* Circular Queue → fixes space issue
* Linked List → dynamic
* Deque → flexible
* Priority Queue → heap
* Two stacks → queue simulation

---

# 💥 Golden Line

👉 "Queue = FIFO, Deque = Flexible Queue, Priority Queue = Smart Queue"
