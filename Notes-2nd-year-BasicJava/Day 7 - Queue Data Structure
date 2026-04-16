# 📄 DAY 7 — QUEUE DATA STRUCTURE (FIFO)

---

# 🎯 Learning Objectives

* Understand Queue (FIFO)
* Learn all operations
* Implement Queue (Array + Circular + LinkedList)
* Learn Queue types (Deque, Priority Queue)
* Solve LeetCode problems using Queue

---

# 🧠 PART 1 — INTRODUCTION

## ❓ What is Queue?

> Queue follows **FIFO (First In First Out)**

---

## 📦 Real-Life Examples

* Ticket line 🎟
* Printer queue 🖨
* Food delivery 🍔

---

# 🔥 PART 2 — OPERATIONS

| Operation | Meaning           |
| --------- | ----------------- |
| enqueue() | Insert at rear    |
| dequeue() | Remove from front |
| peek()    | View front        |
| isEmpty() | Check empty       |
| isFull()  | For array         |

---

# 🔥 PART 3 — QUEUE USING ARRAY

```java
class QueueArray {
    int[] arr;
    int front = 0, rear = -1, size = 0, capacity;

    QueueArray(int cap) {
        capacity = cap;
        arr = new int[cap];
    }

    void enqueue(int x) {
        if(size == capacity) {
            System.out.println("Full"); return;
        }
        arr[++rear] = x;
        size++;
    }

    int dequeue() {
        if(size == 0) return -1;
        int val = arr[front++];
        size--;
        return val;
    }
}
```

---

# ⚠️ PROBLEM

👉 Space wasted after dequeue

---

# 🔥 PART 4 — CIRCULAR QUEUE (IMPORTANT)

## 🧠 Idea

Reuse space using modulo

```java
class CircularQueue {
    int[] arr;
    int front = 0, rear = 0, size = 0, capacity;

    CircularQueue(int cap) {
        capacity = cap;
        arr = new int[cap];
    }

    void enqueue(int x) {
        if(size == capacity) return;
        arr[rear] = x;
        rear = (rear + 1) % capacity;
        size++;
    }

    int dequeue() {
        if(size == 0) return -1;
        int val = arr[front];
        front = (front + 1) % capacity;
        size--;
        return val;
    }
}
```

---

# 🔥 PART 5 — QUEUE USING LINKED LIST

```java
class Node {
    int data;
    Node next;
    Node(int d) { data = d; }
}

class QueueLL {
    Node front, rear;

    void enqueue(int x) {
        Node n = new Node(x);
        if(rear == null) {
            front = rear = n;
            return;
        }
        rear.next = n;
        rear = n;
    }

    int dequeue() {
        if(front == null) return -1;
        int val = front.data;
        front = front.next;
        if(front == null) rear = null;
        return val;
    }
}
```

---

# 🔥 PART 6 — TYPES OF QUEUE

## 1. Simple Queue

## 2. Circular Queue

## 3. Deque (Double Ended Queue)

## 4. Priority Queue

---

# 🔥 PART 7 — JAVA INBUILT QUEUE

```java
import java.util.*;

Queue<Integer> q = new LinkedList<>();
q.add(10);
q.add(20);
q.remove();
q.peek();
```

---

# 🔥 PART 8 — LEETCODE PROBLEMS

---

## 🟢 EASY

### 1. Implement Queue using Stacks

👉 Use two stacks (in & out)

---

### 2. First Non-Repeating Character

👉 Use queue + frequency array

---

## 🟡 MEDIUM

### 3. Sliding Window Maximum 🔥

👉 Use deque

---

### 4. Rotting Oranges 🔥

👉 BFS using queue

---

### 5. Generate Binary Numbers

👉 Use queue for pattern building

---

## 🔴 HARD

### 6. LRU Cache

👉 Deque + HashMap

---

### 7. Task Scheduler

👉 Queue + greedy

---

# 🔥 PART 9 — BFS USING QUEUE

## 🧠 Idea

Queue helps process level by level

---

## Example

Binary Tree Level Order Traversal

---

# ⚠️ COMMON MISTAKES

* Confusing front/rear
* Not using modulo in circular queue
* Not handling empty/full cases

---

# 🎯 SUMMARY

* Queue = FIFO
* Insert → rear
* Delete → front
* Circular queue saves space
* Queue used in BFS

---

# 🏁 END OF DAY 7
