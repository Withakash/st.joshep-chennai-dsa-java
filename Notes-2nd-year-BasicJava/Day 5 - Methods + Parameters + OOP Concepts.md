# 🚀 JAVA - Basic - Part 11 & 12

## Methods + Parameters + OOP Concepts (Complete Teaching Notes)

---

# 🧠 1. What is a Method?

A **method** is a block of code that performs a specific task and can be reused.

### Example

```java
public static void greet() {
    System.out.println("Hello Students");
}
```

---

# 🧱 2. Method Syntax

```java
returnType methodName(parameters) {
    // code
}
```

---

# 🎯 3. Three Types of Methods

## 1. No Input, No Return

```java
public static void greet() {
    System.out.println("Hello");
}
```

## 2. Input, No Return

```java
public static void greetUser(String name) {
    System.out.println("Hello " + name);
}
```

## 3. Input + Return ⭐

```java
public static int add(int a, int b) {
    return a + b;
}
```

---

# 🔄 4. Parameters vs Arguments

| Term      | Meaning                       |
| --------- | ----------------------------- |
| Parameter | Variable in method definition |
| Argument  | Value passed during call      |

```java
add(int a, int b); // parameters
add(5, 3); // arguments
```

---

# 🧠 5. Static vs Instance Methods

## 🔹 Static Method

* Belongs to class
* Called without object

```java
class Demo {
    static void greet() {
        System.out.println("Hello");
    }
}
```

## 🔹 Instance Method

* Belongs to object

```java
class Demo {
    void show() {
        System.out.println("Instance Method");
    }
}
```

---

# ⚔️ Difference

| Static                          | Instance              |
| ------------------------------- | --------------------- |
| Class level                     | Object level          |
| No object needed                | Object required       |
| Cannot access instance directly | Can access everything |

---

# 🔥 Hidden Truths (Very Important)

## 1. Static cannot access instance directly

```java
class Demo {
    int x = 10;
    static void test() {
        // System.out.println(x); ❌ ERROR
    }
}
```

### Fix

```java
Demo d = new Demo();
System.out.println(d.x);
```

---

## 2. Overriding requires inheritance

```java
class A {
    void show() {}
}
class B extends A {
    void show() {}
}
```

---

## 3. Private methods cannot be overridden

```java
class A {
    private void show() {}
}
class B extends A {
    void show() {} // new method
}
```

---

## 4. Static methods are hidden, not overridden

```java
class A {
    static void show() { System.out.println("A"); }
}
class B extends A {
    static void show() { System.out.println("B"); }
}
```

```java
A obj = new B();
obj.show(); // A
```

---

# 🔁 Call by Value

```java
public static void change(int x) {
    x = 100;
}
```

```java
int a = 10;
change(a);
System.out.println(a); // 10
```

---

# 🔥 Method Overloading

```java
int add(int a, int b) {}
int add(int a, int b, int c) {}
```

✔ Same name
✔ Different parameters

---

# 🔥 Method Overriding

```java
class A {
    void show() { System.out.println("A"); }
}

class B extends A {
    void show() { System.out.println("B"); }
}
```

```java
A obj = new B();
obj.show(); // B
```

---

# 🔐 Access Modifiers

| Modifier  | Access             |
| --------- | ------------------ |
| public    | everywhere         |
| private   | same class         |
| protected | package + subclass |
| default   | same package       |

---

# 🏧 ATM Simulator (Full Project)

```java
class BankAccount {

    private int balance;

    BankAccount(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void deposit(int amount, String note) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | Note: " + note);
    }

    public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public int checkBalance() {
        return balance;
    }

    private void secretLog() {
        System.out.println("Logging transaction...");
    }

    public void performSecretLog() {
        secretLog();
    }
}

class PremiumAccount extends BankAccount {

    PremiumAccount(int balance) {
        super(balance);
    }

    @Override
    public void withdraw(int amount) {
        System.out.println("Premium Withdrawal");
        super.withdraw(amount - 10);
    }
}

public class ATM {

    public static void displayMenu() {
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
    }

    public static void main(String[] args) {

        BankAccount acc = new BankAccount(1000);
        acc.deposit(500);
        acc.deposit(200, "Gift");
        acc.withdraw(300);

        System.out.println("Balance: " + acc.checkBalance());

        BankAccount ref = new PremiumAccount(2000);
        ref.withdraw(500);
    }
}
```

---

# 🎯 Final Summary

* Static → Class level
* Instance → Object level
* Overloading → Same method, different parameters
* Overriding → Same method, different behavior
* Java → Always call by value
* Private → Cannot be overridden
* Static methods → Hidden, not overridden

---

# 🧪 Practice Questions

## Easy

1. Create static method to print name
2. Create instance method to print number

## Medium

3. Overload a method
4. Demonstrate call by value

## Hard

5. Create class with overriding
6. Modify ATM with new feature

---

# 🧠 Teaching Line

"Methods are machines: Input → Process → Output"

"Objects use methods to perform actions"
