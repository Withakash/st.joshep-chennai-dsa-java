# 📄 DAY 6 — ARRAY ADT & STACK (DSA FOUNDATION)

---

# 🎯 Learning Objectives

By the end of this session, you will:

* Understand what **Array ADT** is (concept level)
* Learn all **array operations with logic**
* Understand **ArrayList vs Array**
* Learn **Stack Data Structure (LIFO)**
* Implement **Stack using Array**
* Start solving **DSA-style problems**

---

# 🧠 PART 1 — FROM ARRAY TO DSA THINKING

---

## ❓ Important Question

> You know arrays… but can you build your own array system?

👉 This is where **DSA begins**

---

## 💡 Key Idea

* Array = Data Storage
* DSA = Data + Operations + Efficiency

---

# 🔥 PART 2 — ARRAY ADT (ABSTRACT DATA TYPE)

---

## 🧠 What is Array ADT?

> Array ADT defines **what operations can be performed on an array**, not how they are implemented.

---

## 📌 Simple Understanding

* Array = actual memory structure
* Array ADT = rules + operations

---

## 📦 Real-Life Example

Think of a list of numbers:

```text
[10, 20, 30, 40]
```

You should be able to:

* Add element
* Delete element
* Search element
* Update element

👉 These are **ADT operations**

---

# 🔧 OPERATIONS IN ARRAY ADT

---

## 1️⃣ Traversal

👉 Visit all elements

```java
for(int i = 0; i < size; i++) {
    System.out.print(arr[i] + " ");
}
```

---

## 2️⃣ Insertion

### 👉 Insert at position

```java
for(int i = size; i > index; i--) {
    arr[i] = arr[i - 1];
}
arr[index] = value;
size++;
```

---

## 3️⃣ Deletion

```java
for(int i = index; i < size - 1; i++) {
    arr[i] = arr[i + 1];
}
size--;
```

---

## 4️⃣ Searching

### Linear Search

```java
for(int i = 0; i < size; i++) {
    if(arr[i] == key) {
        System.out.println("Found at index " + i);
    }
}
```

---

## 5️⃣ Update

```java
arr[index] = newValue;
```

---

## 6️⃣ Get / Set

```java
int value = arr[index];  // get
arr[index] = 50;         // set
```

---

# ⚡ TIME COMPLEXITY

| Operation       | Time Complexity |
| --------------- | --------------- |
| Access          | O(1)            |
| Insert (end)    | O(1)            |
| Insert (middle) | O(n)            |
| Delete          | O(n)            |
| Search          | O(n)            |

---

## 🧠 WHY INSERT/DELETE IS O(n)?

👉 Because elements need to be shifted

---

# 🧩 MEMORY CONCEPT

---

## 📌 Important Points

* Array uses **contiguous memory**
* Index = direct access

```text
Index:   0   1   2   3
Value:  10  20  30  40
```

---

## 🎯 Key Insight

> Fast access but costly modification

---

# 🔥 PART 3 — ARRAYLIST (DYNAMIC ARRAY)

---

## 🧠 What is ArrayList?

> ArrayList is a **resizable array implementation in Java**

---

## 📌 Example

```java
ArrayList<Integer> list = new ArrayList<>();

list.add(10);
list.add(20);
```

---

## ⚙️ Internal Working

* Uses array internally
* When full:

  * Creates new bigger array
  * Copies old data

---

## 🔁 Resize Concept

```text
Old: [10,20]
New: [10,20,_,_]
```

---

# ⚔️ ARRAY vs ARRAYLIST

---

| Feature     | Array             | ArrayList       |
| ----------- | ----------------- | --------------- |
| Size        | Fixed             | Dynamic         |
| Speed       | Faster            | Slightly slower |
| Memory      | Manual            | Automatic       |
| Flexibility | Low               | High            |
| Type        | Primitive allowed | Objects only    |

---

## 🎯 Important Concept

> ArrayList is built using Array ADT

---

# 🔥 PART 4 — STACK DATA STRUCTURE

---

## 🧠 What is Stack?

> Stack follows **LIFO (Last In First Out)**

---

## 📦 Real-Life Examples

* Stack of plates 🍽
* Undo operation
* Browser history

---

## 🔑 OPERATIONS

| Operation | Meaning        |
| --------- | -------------- |
| push()    | Insert element |
| pop()     | Remove element |
| peek()    | View top       |
| isEmpty() | Check empty    |

---

# 🧱 STACK USING ARRAY

---

## ✅ Implementation

```java
class Stack {
    int[] arr;
    int top = -1;
    int size;

    Stack(int size) {
        this.size = size;
        arr = new int[size];
    }

    void push(int x) {
        if(top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    int pop() {
        if(top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    int peek() {
        if(top == -1) return -1;
        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }
}
```

---

## ⚠️ CONDITIONS

* Overflow → stack full
* Underflow → stack empty

---

# 🔥 PART 5 — PROBLEM SOLVING (LEETCODE STYLE)

---

## 🧩 Problem 1 — Valid Parentheses

### 💡 Idea:

* Use stack
* Push opening brackets
* Match closing brackets

---

## 🧩 Problem 2 — Remove Duplicates

### 💡 Idea:

* Use stack or two pointer

---

## 🧩 Problem 3 — Next Greater Element

### 💡 Idea:

* Use stack to track next greater

---

# 🧠 THINKING PATTERN

---

## Before solving any problem:

Ask:

1. What is input?
2. What is output?
3. Which data structure fits?
4. Can I optimize?

---

# ⚠️ COMMON MISTAKES

---

* Confusing Array and ArrayList
* Not understanding shifting
* Ignoring time complexity
* Using stack without LIFO understanding

---

# 🎯 FINAL SUMMARY

---

## 🔥 Key Takeaways

* Array ADT = concept of operations
* ArrayList = dynamic implementation
* Stack = first behavior-based DS
* DSA = logic + efficiency

---

## 🧠 One-Line Understanding

> Array stores data
> Stack controls access
> DSA begins when behavior matters

---

# 🚀 HOMEWORK

---

## Practice:

1. Insert element at index
2. Delete element
3. Implement stack
4. Solve:

   * Valid Parentheses
   * Next Greater Element

---

# 🏁 END OF DAY 6
