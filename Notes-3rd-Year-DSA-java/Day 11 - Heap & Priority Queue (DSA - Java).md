# 📘 Day 11 - Heap & Priority Queue (DSA - Java)

---

# 🔷 Part 81 - Introduction to Heap

## 🧠 Definition

A **Heap** is a:

* Complete Binary Tree
* Follows a specific order property

---

## 🔥 Types of Heap

### ✅ Min Heap

* Parent ≤ Children
* Smallest element at root

### ✅ Max Heap

* Parent ≥ Children
* Largest element at root

---

## 📌 Array Representation

For index `i`:

* Left Child → `2*i + 1`
* Right Child → `2*i + 2`
* Parent → `(i-1)/2`

---

# 🔷 Part 82 - Min Heap and Max Heap

## 🎯 Example

Min Heap:

```
        10
      /    \
     20     30
    /  \
   40  50
```

Array:

```
[10, 20, 30, 40, 50]
```

---

# 🔷 Part 83 - Heap Insertion

## 🧠 Steps

1. Insert at end
2. Bubble Up

---

## 🧑‍💻 Code

```java
void insert(int val) {
    if (size == capacity) return;

    arr[size] = val;
    int i = size;
    size++;

    while (i != 0 && arr[parent(i)] > arr[i]) {
        int temp = arr[i];
        arr[i] = arr[parent(i)];
        arr[parent(i)] = temp;

        i = parent(i);
    }
}
```

---

# 🔷 Part 84 - Heap Deletion

## 🧠 Steps

1. Replace root with last element
2. Reduce size
3. Heapify

---

```java
int deleteMin() {
    if (size <= 0) return -1;

    int root = arr[0];
    arr[0] = arr[size - 1];
    size--;

    heapify(0);

    return root;
}
```

---

# 🔷 Part 85 - Heapify Operation

## 🧠 Fix heap downward

```java
void heapify(int i) {
    int smallest = i;
    int l = 2*i + 1;
    int r = 2*i + 2;

    if (l < size && arr[l] < arr[smallest])
        smallest = l;

    if (r < size && arr[r] < arr[smallest])
        smallest = r;

    if (smallest != i) {
        int temp = arr[i];
        arr[i] = arr[smallest];
        arr[smallest] = temp;

        heapify(smallest);
    }
}
```

---

# 🔷 Build Heap (Important)

```java
void buildHeap() {
    for (int i = size/2 - 1; i >= 0; i--) {
        heapify(i);
    }
}
```

---

# 🔷 Full Min Heap Implementation

```java
class MinHeap {

    int[] arr;
    int size;
    int capacity;

    MinHeap(int cap) {
        capacity = cap;
        size = 0;
        arr = new int[cap];
    }

    int parent(int i) { return (i-1)/2; }
    int left(int i) { return 2*i+1; }
    int right(int i) { return 2*i+2; }

    void insert(int val) {
        if (size == capacity) return;

        arr[size] = val;
        int i = size;
        size++;

        while (i != 0 && arr[parent(i)] > arr[i]) {
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;
            i = parent(i);
        }
    }

    void heapify(int i) {
        int smallest = i;
        int l = left(i);
        int r = right(i);

        if (l < size && arr[l] < arr[smallest])
            smallest = l;

        if (r < size && arr[r] < arr[smallest])
            smallest = r;

        if (smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            heapify(smallest);
        }
    }

    int deleteMin() {
        if (size <= 0) return -1;

        int root = arr[0];
        arr[0] = arr[size-1];
        size--;
        heapify(0);
        return root;
    }

    int getMin() {
        return size == 0 ? -1 : arr[0];
    }
}
```

---

# 🔷 Part 86 - Priority Queue

## 🧠 Definition

Priority Queue removes element based on priority, not insertion order.

---

## 🧑‍💻 Java Min Heap (Default)

```java
import java.util.*;

PriorityQueue<Integer> pq = new PriorityQueue<>();

pq.add(10);
pq.add(5);
pq.add(20);

System.out.println(pq.poll()); // 5
```

---

## 🔥 Max Heap

```java
PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
```

---

# 🔷 Part 87 - Kth Largest Element

```java
int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();

    for (int num : nums) {
        pq.add(num);
        if (pq.size() > k) {
            pq.poll();
        }
    }

    return pq.peek();
}
```

---

# 🔷 Part 88 - Top K Frequent Elements

```java
int[] topKFrequent(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int num : nums) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }

    PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);

    for (int key : map.keySet()) {
        pq.add(new int[]{key, map.get(key)});
        if (pq.size() > k) {
            pq.poll();
        }
    }

    int[] res = new int[k];
    int i = 0;

    while (!pq.isEmpty()) {
        res[i++] = pq.poll()[0];
    }

    return res;
}
```

---

# 🔷 Extra Problem - 3 Largest Distinct Sum

## 🧠 Problem

Find top 3 largest DISTINCT elements and return their sum.

---

## 🧑‍💻 Code

```java
int threeLargestSum(int[] nums) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    HashSet<Integer> set = new HashSet<>();

    for (int num : nums) {
        if (!set.contains(num)) {
            pq.add(num);
            set.add(num);

            if (pq.size() > 3) {
                pq.poll();
            }
        }
    }

    int sum = 0;

    while (!pq.isEmpty()) {
        sum += pq.poll();
    }

    return sum;
}
```

---

# 🎯 Key Patterns

* Kth Largest → Min Heap
* Top K → Min Heap
* Largest repeatedly → Max Heap
* Streaming → Two Heaps

---

# 🚀 Practice Problems

1. Kth Largest Element
2. Last Stone Weight
3. Top K Frequent
4. K Closest Points
5. Merge K Sorted Lists

---

# ✅ Summary

* Heap = Complete Binary Tree + Order Property
* Insert → Bubble Up
* Delete → Heapify Down
* Priority Queue uses Heap internally

---
