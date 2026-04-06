# LOOPING (MASTER PLAN)

---

## How to 

"Print numbers from 1 to 100"

simple answer

```java
System.out.println(1);
System.out.println(2);
...
```

Then show:

```java
for(int i = 1; i <= 100; i++){
    System.out.println(i);
}
```

💡 **Key Line:**

> Loops are repetition with intelligence.

---

# 🧠 CORE CONCEPT

A loop has **3 parts**:

```java
for(initialization; condition; update)
```

Example:

```java
for(int i = 1; i <= 5; i++)
```

| Part      | Meaning        |
| --------- | -------------- |
| int i = 1 | Start          |
| i <= 5    | Stop condition |
| i++       | Movement       |

---

# 🔁 TYPES OF LOOPS

## 1️⃣ FOR LOOP

👉 Use when iterations are known

```java
for(int i = 1; i <= 5; i++){
    System.out.println(i);
}
```

---

## 2️⃣ WHILE LOOP

👉 Use when condition matters

```java
int i = 1;
while(i <= 5){
    System.out.println(i);
    i++;
}
```

---

## 3️⃣ DO-WHILE LOOP

👉 Runs at least once

```java
int i = 1;
do{
    System.out.println(i);
    i++;
}while(i <= 5);
```

---

# 🔥 BREAK & CONTINUE (IMPORTANT THEORY)

## 🔴 break

👉 Immediately exits the loop

```java
for(int i = 1; i <= 5; i++){
    if(i == 3) break;
    System.out.print(i);
}
```

👉 Output: `12`

---

## 🟡 continue

👉 Skips current iteration and moves to next

```java
for(int i = 1; i <= 5; i++){
    if(i == 3) continue;
    System.out.print(i);
}
```

👉 Output: `1245`

---

# 🧠 DRY RUN (MUST TEACH)

## Example: break

```java
for(int i = 1; i <= 5; i++){
    if(i == 3) break;
    System.out.print(i);
}
```

| i | Condition | Action | Output |
| - | --------- | ------ | ------ |
| 1 | false     | print  | 1      |
| 2 | false     | print  | 12     |
| 3 | true      | break  | STOP   |

---

## Example: continue

```java
for(int i = 1; i <= 5; i++){
    if(i == 3) continue;
    System.out.print(i);
}
```

| i | Condition | Action | Output |
| - | --------- | ------ | ------ |
| 1 | false     | print  | 1      |
| 2 | false     | print  | 12     |
| 3 | true      | skip   | 12     |
| 4 | false     | print  | 124    |
| 5 | false     | print  | 1245   |

---

# ⚠️ EDGE CASES (MUST TEACH)

### 1. Loop never runs

```java
for(int i = 10; i < 5; i++){
    System.out.println(i);
}
```

---

### 2. Infinite loop

```java
for(;;){
    System.out.println("Infinite");
}
```

---

### 3. Missing update

```java
int i = 1;
while(i <= 5){
    System.out.println(i);
}
```

---

### 4. Update inside loop

```java
for(int i = 1; i <= 5; ){
    System.out.println(i);
    i++;
}
```

---

### 5. Multiple variables

```java
for(int i = 1, j = 5; i <= 5; i++, j--){
    System.out.println(i + " " + j);
}
```

---

### 6. Nested loops

```java
for(int i = 1; i <= 3; i++){
    for(int j = 1; j <= 2; j++){
        System.out.println(i + " " + j);
    }
}
```

---

### 7. Semicolon mistake

```java
for(int i = 1; i <= 5; i++);
{
    System.out.println("Hello");
}
```

---

# 🎯 OUTPUT PREDICTION QUESTIONS

## 🟢 EASY

### Q1

```java
for(int i=1;i<=3;i++)
    System.out.print(i);
```

### Q2

```java
for(int i=3;i>=1;i--)
    System.out.print(i);
```

### Q3

```java
int i=1;
while(i<=3){
    System.out.print(i);
    i++;
}
```

### Q4

```java
int i=1;
do{
    System.out.print(i);
    i++;
}while(i<=3);
```

### Q5

```java
for(int i=1;i<=5;i+=2)
    System.out.print(i);
```

---

## 🟡 MEDIUM

### Q6

```java
for(int i=1;i<=5;i++){
    if(i==3) break;
    System.out.print(i);
}
```

### Q7

```java
for(int i=1;i<=5;i++){
    if(i==3) continue;
    System.out.print(i);
}
```

### Q8

```java
for(int i=1;i<=3;i++)
    for(int j=1;j<=2;j++)
        System.out.print(i+" "+j+" ");
```

### Q9

```java
for(int i=1;i<=10;i*=2)
    System.out.print(i+" ");
```

### Q10

```java
for(int i=5;i>0;i--)
    System.out.print(i);
```

---

## 🔴 HARD

### Q11

```java
int i=1;
while(i<=5){
    System.out.print(i++);
}
```

### Q12

```java
for(int i=0;i<5;i++)
    System.out.print(i++);
```

### Q13

```java
for(int i=1;i<=3;i++){
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
}
```

### Q14

```java
for(int i=1;i<=3;i++){
    for(int j=1;j<=3;j++){
        if(i==j) continue;
        System.out.print(j);
    }
}
```

### Q15

```java
for(int i=1;i<=3;i++){
    for(int j=1;j<=3;j++){
        if(i==j) break;
        System.out.print(j);
    }
}
```

---

## 💣 TRICKY

### Q16

```java
for(int i=0;i<3;i++){
    System.out.print(i);
    i++;
}
```

### Q17

```java
for(int i=1;i<=3;i++);
{
    System.out.print("A");
}
```

### Q18

```java
int i=1;
while(i<5)
    System.out.print(i++);
```

### Q19

```java
int i=5;
while(i>0){
    System.out.print(i--);
}
```

### Q20

```java
int i=1;
do{
    System.out.print(i);
}while(i++<3);
```

---

## 🧠 NESTED THINKING

### Q21

```java
for(int i=1;i<=2;i++){
    for(int j=1;j<=2;j++){
        System.out.print(i+j);
    }
}
```

### Q22

```java
for(int i=1;i<=3;i++){
    for(int j=3;j>=1;j--){
        System.out.print(j);
    }
}
```

### Q23

```java
for(int i=1;i<=3;i++){
    for(int j=1;j<=3;j++){
        if(i+j==4) System.out.print("*");
        else System.out.print("-");
    }
}
```

### Q24

```java
for(int i=1;i<=3;i++){
    System.out.print(i);
    for(int j=1;j<=2;j++){
        System.out.print(j);
    }
}
```

### Q25

```java
for(int i=1;i<=3;i++){
    for(int j=1;j<=i;j++){
        System.out.print(i);
    }
}
```

---

# 🧑‍💻 CODING PROBLEMS

1. Print numbers 1 to N
2. Print even numbers till N
3. Sum of first N numbers
4. Factorial of a number
5. Reverse a number
6. Count digits
7. Check palindrome number
8. Print multiplication table
9. Pattern

```
*
**
***
```

10. Pattern

```
1
12
123
```

---

# 💡 TEACHING STRATEGY

Ask for every loop:

* How many times it runs?
* When does it stop?
* What is changing?

---

# 🧠 ANSWERS

1. 123
2. 321
3. 123
4. 123
5. 135
6. 12
7. 1245
8. 1 1 1 2 2 1 2 2 3 1 3 2
9. 1 2 4 8
10. 54321
11. 12345
12. 024
13. ---
14. 231312
15. 112
16. 02
17. A
18. 1234
19. 54321
20. 123
21. 2334
22. 321321321
23. --*-*--*
24. 112122132
25. 122333

---


