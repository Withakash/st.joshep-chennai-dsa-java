# JAVA - Day 4 - Arrays + Class & Object (Complete Teaching Notes)

---

# 🎯 Day 4 Goal

By end of this session, students should:

* Understand Arrays deeply
* Understand memory (stack vs heap)
* Understand Reference concept
* Learn Class & Object basics
* Use constructors

---

# 🟢 PART 1: ARRAYS

---

# 🟢 1. Why Arrays?

```java
int m1 = 90;
int m2 = 85;
```

❌ Not scalable

👉 Need Array

---

# 🟢 2. What is Array?

👉 Collection of same type elements stored in continuous memory

---

# 🟢 3. Declaration

```java
int[] arr = new int[5];
```

---

# 🟢 4. Memory (CORE)

```
Stack:          Heap:

arr -------> [0][0][0][0][0]
```

👉 Array stores reference

---

# 🟢 5. Assign & Access

```java
arr[0] = 10;
System.out.println(arr[0]);
```

---

# 🟢 6. Loop

```java
for(int i = 0; i < arr.length; i++){
    System.out.println(arr[i]);
}
```

---

# 🟢 7. Declaration Styles

```java
int[] a = new int[5];
int[] b = {1,2,3};
int[] c;
c = new int[5];
```

---

# 🟢 8. Reference Concept

```java
int[] a = {1,2};
int[] b = a;
b[0] = 99;
```

👉 Both affected

---

# 🟢 9. Null Case

```java
int[] arr = null;
arr[0] = 10; // error
```

---

# 🟢 10. Problems

### Sum

```java
int sum = 0;
for(int i=0;i<arr.length;i++) sum += arr[i];
```

### Max

```java
int max = arr[0];
for(int i=1;i<arr.length;i++){
 if(arr[i] > max) max = arr[i];
}
```

---

# 🟢 PART 2: CLASS & OBJECT

---

# 🟢 1. Class

```java
class Car {
    String color;
    int speed;
}
```

---

# 🟢 2. Object

```java
Car c1 = new Car();
```

```
Stack:          Heap:

c1 -------> [color=null, speed=0]
```

---

# 🟢 3. Assign Values

```java
c1.color = "Red";
c1.speed = 100;
```

---

# 🟢 4. Reference Behavior

```java
Car c1 = new Car();
Car c2 = c1;
c2.speed = 200;
```

---

# 🟢 5. Constructors

```java
class Car {
    String color;
    int speed;

    Car(){
        color = "Black";
        speed = 0;
    }

    Car(String color){
        this.color = color;
        this.speed = 0;
    }

    Car(String color, int speed){
        this.color = color;
        this.speed = speed;
    }
}
```

---

# 🟢 6. Main Class Usage

```java
public class Main {
    public static void main(String[] args){
        Car c1 = new Car();
        Car c2 = new Car("Red");
        Car c3 = new Car("Blue", 120);

        System.out.println(c1.color + " " + c1.speed);
        System.out.println(c2.color + " " + c2.speed);
        System.out.println(c3.color + " " + c3.speed);
    }
}
```

---

# 🟢 7. this Keyword

```java
this.color = color;
```

---

# 🟢 8. Hidden Concepts

* Object not created without new
* Reference copy shares data
* Default values exist
* Constructor runs automatically

---

# 🟢 9. Common Mistakes

❌ Missing new
❌ Confusing copy vs reference
❌ Accessing null
❌ Forgetting this

---

# 🧠 Final Summary

👉 Arrays = continuous memory
👉 Objects = real-world modeling
👉 Reference = address
👉 Heap stores data
👉 Stack stores reference

---

# 🔥 Golden Rule

👉 "Data lives in heap, reference lives in stack"

---

# 🎯 Homework

### Arrays

1. Reverse array
2. Find min
3. Count odd

### OOP

1. Create Student class
2. Add 2 constructors
3. Print details

---
