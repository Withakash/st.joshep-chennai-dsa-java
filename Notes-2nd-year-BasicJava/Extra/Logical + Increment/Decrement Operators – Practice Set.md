# Logical + Increment/Decrement Operators – Practice Set

## Instructions

* Predict the output of each expression.
* Also track the final values of variables after execution.
* Follow rules:

  * Post Increment (`a++`) → use first, then increment
  * Pre Increment (`++a`) → increment first, then use
  * `&&` → stops if left side is FALSE
  * `||` → stops if left side is TRUE

---

## Questions

### 1.

```java
int a = 5, b = 6;
System.out.println(a++ > b++ && a-- < b--);
```

### 2.

```java
int a = 7, b = 5;
System.out.println(++a > b++ && a++ > --b);
```

### 3.

```java
int a = 4, b = 4;
System.out.println(a++ == b++ || ++a > b++);
```

### 4.

```java
int a = 3, b = 2;
System.out.println(++a > b && a++ > b++);
```

### 5.

```java
int a = 6, b = 6;
System.out.println(a++ > b || ++a < b++);
```

### 6.

```java
int a = 2, b = 3;
System.out.println(a++ < b && ++a > b++ && a++ > b);
```

### 7.

```java
int a = 5, b = 4;
System.out.println(a++ > b && ++a > b++ || a-- < ++b);
```

---

## Answers

### 1.

Output: false
Final Values: a = 6, b = 7

### 2.

Output: true
Final Values: a = 9, b = 5

### 3.

Output: true
Final Values: a = 5, b = 5

### 4.

Output: true
Final Values: a = 5, b = 3

### 5.

Output: false
Final Values: a = 7, b = 7

### 6.

Output: false
Final Values: a = 3, b = 3

### 7.

Output: true
Final Values: a = 6, b = 5

---

## Key Learning Points

* Always evaluate LEFT → RIGHT
* `&&` stops on FALSE
* `||` stops on TRUE
* Track variable changes step-by-step
* Be careful with mixed operators (`&&` and `||` together)
