# 📘 Day 1 - Java Basics (Placement-Oriented Training)

---

## 🎯 Objective

By the end of this session, students will:

* Understand how Java programs run
* Write basic Java programs confidently
* Use variables, operators, conditions, loops
* Solve basic logic problems (placement-focused)

---

# 🔥 Part 1: Introduction to Programming

## 💡 What is Programming?

Programming is the process of giving instructions to a computer to perform tasks.

👉 Real-life analogy:

* Giving step-by-step instructions to a friend

---

## ☕ Why Java?

* Platform independent (Write Once, Run Anywhere)
* Widely used in backend development
* Strong presence in placement interviews

---

# ⚙️ How Java Works

```
Java Code (.java)
      ↓
Compiler (javac)
      ↓
Bytecode (.class)
      ↓
JVM (Java Virtual Machine)
      ↓
Output
```

## 🧠 Key Points

* Java is both **compiled and interpreted**
* `javac` converts source code to bytecode
* JVM executes bytecode
* Platform independence comes from JVM

---

# 💻 First Java Program

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

## 🔍 Explanation

| Component          | Meaning                           |
| ------------------ | --------------------------------- |
| public class Main  | Class name (must match file name) |
| main()             | Entry point of program            |
| System.out.println | Prints output                     |

---

# 📦 Part 2: Data Types & Variables

## 🧠 Variables

A variable is a container used to store data.

```java
int age = 20;
double price = 99.5;
char grade = 'A';
boolean isPass = true;
```

## 📊 Data Types

| Type    | Example | Description      |
| ------- | ------- | ---------------- |
| int     | 10      | Integer values   |
| double  | 10.5    | Decimal values   |
| char    | 'A'     | Single character |
| boolean | true    | True/False       |

---

# ➕ Operators

## Arithmetic Operators

```java
int a = 10, b = 5;
System.out.println(a + b);
System.out.println(a - b);
System.out.println(a * b);
System.out.println(a / b);
System.out.println(a % b);
```

## Relational Operators

```java
System.out.println(a > b);
System.out.println(a == b);
```

## Logical Operators

```java
System.out.println(a > 5 && b < 10);
```

---

# 🧮 Part 3: Expressions & Precedence

## 💡 Expression

Combination of variables, constants, and operators.

```java
int result = 10 + 5 * 2;
```

## 🔢 Precedence

* `*` and `/` have higher priority than `+` and `-`

```java
int x = 10 + 2 * 5;      // 20
int y = (10 + 2) * 5;    // 60
```

---

# 🔀 Part 4: Conditional Statements

## if-else

```java
int age = 18;

if(age >= 18){
    System.out.println("Adult");
}else{
    System.out.println("Minor");
}
```

## Nested if

```java
int a = 10, b = 20, c = 15;

if(a > b && a > c){
    System.out.println("a is largest");
}else if(b > c){
    System.out.println("b is largest");
}else{
    System.out.println("c is largest");
}
```

---

## 🔘 Switch Statement

```java
int day = 2;

switch(day){
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    default: System.out.println("Invalid");
}
```

---

# 🔁 Part 5: Loops

## for loop

```java
for(int i = 1; i <= 5; i++){
    System.out.println(i);
}
```

## while loop

```java
int i = 1;
while(i <= 5){
    System.out.println(i);
    i++;
}
```

---

# 🔢 Part 6: Digit Manipulation

## Extract digits

```java
int n = 1234;

while(n > 0){
    int digit = n % 10;
    System.out.println(digit);
    n = n / 10;
}
```

## Reverse number

```java
int n = 1234, rev = 0;

while(n > 0){
    int d = n % 10;
    rev = rev * 10 + d;
    n /= 10;
}
System.out.println(rev);
```

## Count digits

```java
int count = 0;

while(n > 0){
    count++;
    n /= 10;
}
```

---

# ⭐ Patterns

## Star Pattern

```
*
* *
* * *
```

```java
for(int i = 1; i <= 3; i++){
    for(int j = 1; j <= i; j++){
        System.out.print("* ");
    }
    System.out.println();
}
```

## Number Pattern

```
1
12
123
```

---

# 🧠 Important Problems (Placement Focus)

## Prime Number

## Fibonacci Series

```java
int a = 0, b = 1;

for(int i = 1; i <= 5; i++){
    System.out.print(a + " ");
    int c = a + b;
    a = b;
    b = c;
}
```

## Armstrong Number

## Palindrome Number

---

# ⚠️ Common Mistakes

* Missing semicolon `;`
* Infinite loops
* Wrong condition checks
* Variable scope issues

---

# 🎯 End of Day Assignment

## Mini Tasks:

1. ATM menu program
2. Student marks calculator
3. 5 pattern problems
4. 5 number-based problems

---

# 🏁 Final Tip

👉 Focus ratio:

* 20% Theory
* 80% Coding + Practice

👉 Golden Rule:
Explain → Code → Ask → Practice

---

🔥 This completes your Day 1 Java foundation.
