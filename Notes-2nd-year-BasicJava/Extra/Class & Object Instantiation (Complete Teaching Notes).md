# JAVA - Basic - Part 9 - Class & Object Instantiation (Complete Teaching Notes)

---

# 🎯 Goal of This Session

By the end of this topic, students should:

* Understand what a Class and Object are
* Know how objects are created in memory (stack vs heap)
* Understand reference behavior with objects
* Use constructors (default & parameterized)
* Avoid common mistakes

---

# 🟢 1. Why Class & Object?

## Real-Life Thinking

```
Car:
- color
- speed
```

👉 This is NOT a real car → just a definition

💡 This is a **CLASS**

---

# 🟢 2. What is a Class?

👉 "Class is a blueprint/template used to create objects"

```java
class Car {
    String color;
    int speed;
}
```

💡 No memory allocated yet

---

# 🟢 3. What is an Object?

```java
Car c1 = new Car();
```

### Breakdown

| Part      | Meaning                |
| --------- | ---------------------- |
| Car       | Class type             |
| c1        | Reference variable     |
| new Car() | Creates object in heap |

---

# 🟢 4. Memory Representation

```
Stack:              Heap:

c1  ----------->   [color=null, speed=0]
```

👉 Variable stores reference (address)
👉 Object lives in heap

---

# 🟢 5. Assign & Access Values

```java
c1.color = "Red";
c1.speed = 120;

System.out.println(c1.color);
System.out.println(c1.speed);
```

---

# 🟢 6. Multiple Objects

```java
Car c1 = new Car();
Car c2 = new Car();
```

👉 Separate memory

---

# 🟢 7. Reference Behavior

```java
Car c1 = new Car();
Car c2 = c1;

c2.speed = 200;
System.out.println(c1.speed); // 200
```

👉 Both point to SAME object

---

# 🟢 8. Constructors (CORE PART)

👉 Constructor = special method used to initialize object

## 🔥 Full Car Example (3 Constructors)

```java
class Car {
    String color;
    int speed;

    // 1. Default Constructor
    Car() {
        color = "Black";
        speed = 0;
    }

    // 2. Single Parameter Constructor (only color)
    Car(String color) {
        this.color = color;
        this.speed = 0;
    }

    // 3. Two Parameter Constructor (color + speed)
    Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }
}
```

## Usage:

```java
public class Main {
    public static void main(String[] args) {

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

# 🟢 9. Important Keyword: this

👉 Refers to current object

```java
this.color = color;
```

💡 Used to differentiate instance variable & parameter

---

# 🟢 10. Hidden Concepts (VERY IMPORTANT)

### 🔸 1. Object is NOT created without `new`

```java
Car c1;
c1.color = "Red"; // ❌ NullPointerException
```

👉 Because:

```
c1 = null
```

---

### 🔸 2. Reference Copy Problem

```java
Car c1 = new Car("Red", 100);
Car c2 = c1;

c2.speed = 200;
```

👉 c1 also changes

---

### 🔸 3. Default Values

| Type   | Default |
| ------ | ------- |
| int    | 0       |
| String | null    |

---

### 🔸 4. Constructor is NOT a method

* No return type
* Same name as class

---

### 🔸 5. Overloading Constructors

👉 Same name, different parameters

---

# 🟢 11. Common Mistakes

❌ Forgetting `new`
❌ Thinking variable stores object
❌ Confusing reference with copy
❌ Not using `this`
❌ Expecting independent objects after assignment

---

# 🟢 12. Mini Practice

### Q1

```java
Car c1 = new Car("Red", 100);
Car c2 = c1;
c2.color = "Blue";

System.out.println(c1.color);
```

---

### Q2

```java
Car c1 = new Car("Red", 100);
Car c2 = new Car("Red", 100);

c2.speed = 200;
System.out.println(c1.speed);
```

---

# 🧠 Final Summary

👉 Class = blueprint
👉 Object = real entity
👉 new = memory allocation
👉 Variable = reference
👉 Constructor = initializes object

---

# 🔥 One-Line Golden Rule

👉 "Class defines structure, object brings it to life"

---
