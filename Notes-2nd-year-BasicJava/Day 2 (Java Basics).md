# 🚀 JAVA — DAY 2 NOTES

## 📚 Topics Covered

* Conditional Statements
* Switch Statements
* Looping
* Digit Manipulation
* Nested Loops
* Pattern Programming

---

# 🔥 1. CONDITIONAL STATEMENTS

## 👉 Types

### 1. if

```java
if(condition){
    // code
}
```

### 2. if-else

```java
if(condition)
    // code
else
    // code
```

### 3. else-if ladder

```java
if(condition1)
else if(condition2)
else
```

---

## ⚡ Important Concepts

* Condition must be **boolean**
* Only one block executes in ladder
* Nested if possible

---

# 🔁 2. SWITCH STATEMENT

```java
switch(value){
    case 1: // code; break;
    case 2: // code; break;
    default: // code;
}
```

## ⚡ Rules

* Works with int, char, String
* break prevents fall-through
* Without break → next cases execute

---

# 🔄 3. LOOPING

## 👉 Types

### 1. for loop

```java
for(int i=1;i<=n;i++){
    // code
}
```

### 2. while loop

```java
while(condition){
    // code
}
```

### 3. do-while

```java
do{
    // code
}while(condition);
```

---

## ⚡ Key Concepts

* Initialization → start
* Condition → stop
* Update → movement

---

## 🔥 break & continue

### break

* Stops loop completely

### continue

* Skips current iteration

---

# 🔢 4. DIGIT MANIPULATION

## 👉 Core Logic

```java
int digit = n % 10; // last digit
n = n / 10;         // remove last digit
```

---

## 🔥 Common Problems

### Sum of digits

```java
while(n>0){
    sum += n%10;
    n/=10;
}
```

### Reverse number

```java
rev = rev*10 + n%10;
```

### Palindrome

* Compare original and reverse

---

# 🔁 5. NESTED LOOPS

👉 Loop inside another loop

```java
for(int i=1;i<=3;i++){
    for(int j=1;j<=2;j++){
        System.out.println(i+" "+j);
    }
}
```

---

## ⚡ Concept

* Outer loop → rows
* Inner loop → columns

---

# ⭐ 6. PATTERN PROGRAMMING

## 🧠 Core Idea

👉 Pattern = Nested loops + logic

---

## 🔺 Basic Patterns

### Increasing Star

```
*
**
***
```

```java
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}
```

---

### Number Pattern

```
1
12
123
```

```java
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print(j);
    }
    System.out.println();
}
```

---

### Pyramid

```
  *
 ***
*****
```

```java
for(int i=1;i<=n;i++){
    for(int s=1;s<=n-i;s++) System.out.print(" ");
    for(int j=1;j<=2*i-1;j++) System.out.print("*");
    System.out.println();
}
```

---

# ⚠️ COMMON MISTAKES

* Missing break in switch
* Infinite loop (missing update)
* Wrong loop conditions
* Not understanding i & j roles
* Space misalignment in patterns

---

# 🎯 PROBLEM CHECKLIST

Students should be able to:

* Use if-else correctly
* Use switch with break
* Write all loop types
* Solve digit problems
* Write nested loops
* Build basic patterns

---

# ⚡ GOLDEN RULES

* Condition must be clear
* Track variable change
* Dry run every problem
* Pattern = relation between i & j

---

# 🧠 FINAL THOUGHT

👉 Logic > Syntax
👉 Practice > Reading
👉 Dry Run > Guessing

---

# 📌 DAY 2 COMPLETE

Next Focus: Arrays / Strings / Advanced Logic
