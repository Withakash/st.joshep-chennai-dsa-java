# 🚀 JAVA DAY 3 — COMPLETE NOTES

## Digit Manipulation + Nested Loops + Patterns + Number Problems

---

# 🎯 TEACHING OBJECTIVE (READ THIS FIRST)

👉 Students should NOT memorize code.
👉 They should understand:

* How loops work internally
* How numbers break into digits
* How patterns are built row by row

If they miss this → they will fail in DSA.

---

# 🔹 PART 1 — DIGIT MANIPULATION (CORE FOUNDATION)

## 🔥 The Only Logic You Need

```java
while(n > 0) {
    int digit = n % 10;
    n = n / 10;
}
```

👉 This is used in:

* Reverse
* Palindrome
* Armstrong
* Sum of digits
* Count digits

---

## 📌 Extract Digits Example

```java
int n = 1234;

while(n > 0) {
    int digit = n % 10;
    System.out.print(digit + " ");
    n /= 10;
}
```

Output: 4 3 2 1

---

## 📌 Reverse Number

```java
int n = 1234, rev = 0;

while(n > 0) {
    int digit = n % 10;
    rev = rev * 10 + digit;
    n /= 10;
}

System.out.println(rev);
```

---

## 📌 Palindrome

```java
int n = 121, temp = n, rev = 0;

while(n > 0) {
    int digit = n % 10;
    rev = rev * 10 + digit;
    n /= 10;
}

System.out.println(temp == rev);
```

---

## 📌 Armstrong (Generic)

```java
int n = 153, temp = n;
int sum = 0;
int digits = String.valueOf(n).length();

while(n > 0) {
    int digit = n % 10;
    sum += Math.pow(digit, digits);
    n /= 10;
}

System.out.println(sum == temp);
```

---

# ⚠️ COMMON MISTAKE

👉 Students think each problem is new.

Reality:
👉 Same loop + different logic.

---

# 🔹 PART 2 — NESTED LOOPS (CRITICAL FOR PATTERNS)

## 🔥 Concept

👉 Loop inside a loop

```java
for(int i = 1; i <= 3; i++) {
    for(int j = 1; j <= 3; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

Output:

```
* * *
* * *
* * *
```

---

## 🧠 RULE

👉 Outer loop → rows
👉 Inner loop → columns

If student doesn't get this → patterns impossible.

---

# 🔹 PART 3 — PATTERNS (STAR + NUMBER)

---

# 📌 1. Right Triangle

```java
for(int i = 1; i <= 5; i++) {
    for(int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

```
*
* *
* * *
* * * *
* * * * *
```

---

# 📌 2. Inverted Triangle

```java
for(int i = 5; i >= 1; i--) {
    for(int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

---

# 📌 3. Pyramid

```java
for(int i = 1; i <= 5; i++) {
    for(int j = 1; j <= 5 - i; j++) System.out.print(" ");
    for(int j = 1; j <= i; j++) System.out.print("* ");
    System.out.println();
}
```

---

# 📌 4. Hollow Square

```java
int n = 5;

for(int i = 1; i <= n; i++) {
    for(int j = 1; j <= n; j++) {
        if(i == 1 || i == n || j == 1 || j == n)
            System.out.print("* ");
        else
            System.out.print("  ");
    }
    System.out.println();
}
```

---

# 📌 5. Number Triangle

```java
for(int i = 1; i <= 5; i++) {
    for(int j = 1; j <= i; j++) {
        System.out.print(j + " ");
    }
    System.out.println();
}
```

---

# 📌 6. Floyd’s Triangle

```java
int num = 1;

for(int i = 1; i <= 5; i++) {
    for(int j = 1; j <= i; j++) {
        System.out.print(num++ + " ");
    }
    System.out.println();
}
```

---

# 🔹 PART 4 — NUMBER PROBLEMS (APPLICATION)

---

# 📌 Prime Number

```java
int n = 7;
boolean isPrime = true;

if(n <= 1) isPrime = false;

for(int i = 2; i <= Math.sqrt(n); i++) {
    if(n % i == 0) {
        isPrime = false;
        break;
    }
}

System.out.println(isPrime);
```

---

# 📌 Fibonacci Series

```java
int a = 0, b = 1;

for(int i = 1; i <= 10; i++) {
    System.out.print(a + " ");
    int next = a + b;
    a = b;
    b = next;
}
```

---

# 📌 Factorial

```java
int n = 5;
int fact = 1;

for(int i = 1; i <= n; i++) {
    fact *= i;
}

System.out.println(fact);
```

---

# 🔥 PART 5 — PREDICT OUTPUT (MUST PRACTICE)

## Q1

```java
int n = 100;
int sum = 0;
while(n > 0) {
    sum += n % 10;
    n /= 10;
}
System.out.println(sum);
```

## Q2

```java
for(int i = 1; i <= 3; i++) {
    for(int j = 1; j <= i; j++) {
        System.out.print(i);
    }
    System.out.println();
}
```

## Q3

```java
int a = 0, b = 1;
for(int i = 0; i < 5; i++) {
    System.out.print(a + " ");
    int temp = a + b;
    a = b;
    b = temp;
}
```

## Q4

```java
int n = 121, rev = 0;
int temp = n;

while(n > 0) {
    rev = rev*10 + n%10;
    n /= 10;
}

System.out.println(temp == rev);
```

## Q5

```java
for(int i = 5; i >= 1; i--) {
    for(int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

---

# ⚠️ HARD TRUTH (IMPORTANT)

If students:

* Copy patterns without dry run
* Don't trace loops manually
* Don't understand row vs column

👉 They will get stuck forever.

---

# 🎯 FINAL STRATEGY (HOW TO TEACH)

Step 1: Explain logic (NOT code)
Step 2: Dry run on board
Step 3: Ask students to predict output
Step 4: Then show code

👉 This is the only way they will learn.

---

# 🚀 END OF DAY 3
