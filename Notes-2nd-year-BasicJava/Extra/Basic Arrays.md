# JAVA - Basic - Part 8 - Arrays 

---

# 🎯 Goal of This Session

By the end of this topic, students should:

* Understand why arrays are needed
* Know how memory works (stack vs heap)
* Understand reference concept clearly
* Declare, initialize, and use arrays
* Solve basic problems using arrays

---

# 🟢 1. Why Arrays?

## Problem

```java
int m1 = 90;
int m2 = 85;
int m3 = 78;
int m4 = 92;
int m5 = 88;
```

👉 What if 100 students?

❌ Too many variables
❌ Not scalable

## Solution

👉 Use ARRAY

---

# 🟢 2. What is an Array?

👉 "Array is a collection of elements of same type stored in continuous memory"

---

# 🟢 3. Syntax & Declaration

```java
int[] arr = new int[5];
```

## Breakdown

* `int[]` → type
* `arr` → variable name
* `new int[5]` → memory allocation

---

# 🟢 4. Memory Allocation (VERY IMPORTANT)

## Step 1: Stack Memory

```text
arr → ?
```

## Step 2: Heap Memory

```text
[0] [0] [0] [0] [0]
```

## Step 3: Reference Link

```text
arr ---------> [0][0][0][0][0]
```

👉 Array variable stores ADDRESS, not values

---

# 🟢 5. Assigning Values

```java
arr[0] = 10;
arr[1] = 20;
```

```text
[10] [20] [0] [0] [0]
```

---

# 🟢 6. Accessing Elements

```java
System.out.println(arr[0]);
```

⚠️ Index starts from 0

---

# 🟢 7. Traversing Array (Loop)

```java
for(int i = 0; i < arr.length; i++){
    System.out.println(arr[i]);
}
```

👉 Loop + Array = Powerful

---

# 🟢 8. Taking Input

```java
Scanner sc = new Scanner(System.in);

int[] arr = new int[5];

for(int i = 0; i < arr.length; i++){
    arr[i] = sc.nextInt();
}
```

---

# 🟢 9. Array Declaration Styles

## Style 1

```java
int[] arr = new int[5];
```

## Style 2

```java
int[] arr = {10, 20, 30};
```

## Style 3

```java
int[] arr;
arr = new int[5];
```

## Style 4 (Old Style)

```java
int arr[] = {1, 2, 3};
```

---

# 🟢 10. Internal Difference

| Style      | Memory         | Values       |
| ---------- | -------------- | ------------ |
| new int[5] | Heap allocated | Default (0)  |
| {1,2,3}    | Heap allocated | Given values |
| Split      | Heap later     | Default      |

---

# 🟢 11. Reference Concept (CORE TOPIC)

## Primitive Example

```java
int a = 10;
int b = a;

b = 20;
```

```text
a → 10
b → 20
```

👉 Value copied

---

## Array Example

```java
int[] arr1 = {10, 20};
int[] arr2 = arr1;

arr2[0] = 99;
```

```text
arr1 ----\
          → [99][20]
arr2 ----/
```

👉 Same reference

---

# 🟢 12. What is Reference?

👉 "Reference means variable storing address of memory"

---

# 🟢 13. Primitive vs Reference

| Feature | Primitive   | Reference     |
| ------- | ----------- | ------------- |
| Stores  | Value       | Address       |
| Copy    | Independent | Shared        |
| Example | int, float  | array, object |

---

# 🟢 14. Null Reference

```java
int[] arr = null;
```

```java
arr[0] = 10; // ❌ NullPointerException
```

---

# 🟢 15. Common Mistakes

* Index out of bounds
* Forgetting `.length`
* Thinking array stores values directly
* Confusing reference with copy

---

# 🟢 16. Basic Problems

## Sum of Array

```java
int sum = 0;
for(int i = 0; i < arr.length; i++){
    sum += arr[i];
}
```

## Maximum Element

```java
int max = arr[0];
for(int i = 1; i < arr.length; i++){
    if(arr[i] > max){
        max = arr[i];
    }
}
```

## Count Even Numbers

```java
int count = 0;
for(int i = 0; i < arr.length; i++){
    if(arr[i] % 2 == 0){
        count++;
    }
}
```

---

# 🟢 17. Bonus: For-each Loop

```java
for(int num : arr){
    System.out.println(num);
}
```

---

# 🧠 Final Summary

👉 Array is stored in heap
👉 Variable stores reference
👉 Index starts from 0
👉 Arrays are fixed size
👉 Reference causes shared changes

---

# 🎯 Homework

1. Find minimum element
2. Reverse print array
3. Count odd numbers
4. Sum of even numbers

---

# 🔥 One-Line Golden Rule

👉 "Array lives in heap, variable lives in stack, and variable points to array"

---
