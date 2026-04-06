# Unary Increment & Decrement Operators – Practice Set

## Instructions

* Predict the output of each program.
* Do NOT run the code initially.
* Solve step-by-step using:

  * Post Increment → use first, then increment (`a++`)
  * Pre Increment → increment first, then use (`++a`)

---

# 🟢 EASY LEVEL

### 1.

```java
int a = 5;
System.out.println(a++);
```

### 2.

```java
int a = 5;
System.out.println(++a);
```

### 3.

```java
int a = 10;
a++;
System.out.println(a);
```

### 4.

```java
int a = 10;
++a;
System.out.println(a);
```

### 5.

```java
int a = 5;
int b = a++;
System.out.println(a + " " + b);
```

---

# 🟡 MEDIUM LEVEL

### 6.

```java
int a = 5;
int b = ++a;
System.out.println(a + " " + b);
```

### 7.

```java
int a = 5;
int b = a++ + ++a;
System.out.println(b);
```

### 8.

```java
int a = 3;
int b = 4;
int c = a++ + b++;
System.out.println(a + " " + b + " " + c);
```

### 9.

```java
int x = 2;
int y = x++ + ++x;
System.out.println(x + " " + y);
```

### 10.

```java
int a = 5;
int b = 10;

int c = a++ + b-- + ++a + --b;
System.out.println(c);
```

---

# 🔴 HARD LEVEL

### 11.

```java
int a = 5;
int b = a++ + a++ + ++a;
System.out.println(a + " " + b);
```

### 12.

```java
int a = 1;
int b = a++ + ++a + a++ + ++a;
System.out.println(a + " " + b);
```

### 13.

```java
int a = 3;
int b = 2;

int c = a++ + ++b * a++ + b++;
System.out.println(a + " " + b + " " + c);
```

### 14.

```java
int x = 5;

x = x++ + ++x + x++ + ++x;
System.out.println(x);
```

### 15.

```java
int a = 10;

int b = a++ + ++a + a-- + --a;
System.out.println(a + " " + b);
```

---

# 🔥 Golden Rule Reminder

* `a++` → Use value first, then increment
* `++a` → Increment first, then use
* Always evaluate **left to right**
* Track values step-by-step on paper
