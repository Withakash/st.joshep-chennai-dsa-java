# 🚀 JAVA PRACTICE SHEET

## Conditional Statements + Switch Statements (Deep Practice)

---

## 🧠 Instructions

* Do NOT run the code immediately
* First **predict the output**
* Then verify
* Focus on **WHY the output came**

---

# 🔥 PART 1 — CONDITIONAL STATEMENTS

## 🟢 Basic Level

### Q1

```java
int x = 5;
if(x > 3) System.out.println("A");
```

### Q2

```java
int x = 2;
if(x > 3) System.out.println("A");
else System.out.println("B");
```

### Q3

```java
if(true) System.out.println("Yes");
```

### Q4

```java
if(false) System.out.println("No");
```

### Q5

```java
int x = 10;
if(x == 10) System.out.println("Equal");
```

---

## 🟡 Intermediate Level

### Q6

```java
int x = 5;
if(x != 5) System.out.println("A");
else System.out.println("B");
```

### Q7

```java
int x = -1;
if(x > 0) System.out.println("Positive");
else System.out.println("Negative");
```

### Q8 (Nested If)

```java
int x = 10;
if(x > 5)
    if(x < 15)
        System.out.println("A");
    else
        System.out.println("B");
```

### Q9 (Dangling Else)

```java
int x = 20;
if(x > 10)
    if(x < 15)
        System.out.println("A");
    else
        System.out.println("B");
```

### Q10 (Logical AND)

```java
if(5 > 3 && 2 < 1)
    System.out.println("Yes");
```

---

## 🔴 Advanced Level

### Q11 (Logical OR)

```java
if(5 > 3 || 2 < 1)
    System.out.println("Yes");
```

### Q12 (Post Increment)

```java
int x = 5;
if(x++ == 5)
    System.out.println(x);
```

### Q13 (Pre Increment)

```java
int x = 5;
if(++x == 6)
    System.out.println(x);
```

### Q14 (Short Circuit)

```java
int x = 10;
if(x++ > 10 && ++x > 11)
    System.out.println(x);
else
    System.out.println(x);
```

### Q15 (OR + Increment)

```java
int x = 5;
if(x++ == 5 || ++x == 7)
    System.out.println(x);
```

---

## 💣 Tricky Level

### Q16

```java
int x = 5;
if(++x == 6 && x++ == 6)
    System.out.println(x);
```

### Q17

```java
if(false || true && false)
    System.out.println("A");
else
    System.out.println("B");
```

### Q18 (Multiple if)

```java
int x = 10;
if(x > 5)
    System.out.println("A");
if(x > 3)
    System.out.println("B");
```

### Q19 (else-if ladder)

```java
int x = 10;
if(x > 5)
    System.out.println("A");
else if(x > 3)
    System.out.println("B");
```

### Q20 (Empty if trap)

```java
int x = 5;
if(x > 5);
System.out.println("Hello");
```

---

## 🧠 Logical Thinking

### Q21

```java
int x = 0;
if(x == 0)
    System.out.println("Zero");
else
    System.out.println("Non-zero");
```

### Q22

```java
int a = 5, b = 10;
if(a > b)
    System.out.println("A");
else if(a == b)
    System.out.println("Equal");
else
    System.out.println("B");
```

### Q23

```java
int x = 3;
if(x % 2 == 0)
    System.out.println("Even");
else
    System.out.println("Odd");
```

### Q24

```java
int x = 15;
if(x % 3 == 0 && x % 5 == 0)
    System.out.println("Both");
```

### Q25

```java
int x = 30;
if(x >= 10 && x <= 50 && x != 30)
    System.out.println("Valid");
else
    System.out.println("Invalid");
```

---

# 🔁 PART 2 — SWITCH STATEMENTS

## 🟢 Basic

### Q26

```java
int x = 1;
switch(x){
    case 1: System.out.println("A");
}
```

### Q27

```java
int x = 2;
switch(x){
    case 1: System.out.println("A");
    case 2: System.out.println("B");
}
```

### Q28

```java
int x = 2;
switch(x){
    case 1: System.out.println("A"); break;
    case 2: System.out.println("B"); break;
}
```

### Q29

```java
int x = 5;
switch(x){
    case 1: System.out.println("A");
    default: System.out.println("D");
}
```

### Q30

```java
int x = 3;
switch(x){
    case 1:
    case 2:
    case 3: System.out.println("Group");
}
```

---

## 🟡 Intermediate

### Q31

```java
int x = 2;
switch(x){
    case 1: System.out.println("A");
    case 2: System.out.println("B");
    case 3: System.out.println("C");
}
```

### Q32

```java
int x = 2;
switch(x){
    case 1: System.out.println("A");
    case 2: System.out.println("B"); break;
    case 3: System.out.println("C");
}
```

### Q33

```java
int x = 5;
switch(x){
    default: System.out.println("D");
    case 5: System.out.println("E");
}
```

### Q34

```java
int x = 1;
switch(x){
    case 1:
        System.out.println("A");
    case 2:
        System.out.println("B");
}
```

### Q35

```java
char c = 'A';
switch(c){
    case 'A': System.out.println("Apple");
}
```

---

## 🔴 Advanced

### Q36

```java
String s = "Hi";
switch(s){
    case "Hi": System.out.println("Hello");
}
```

### Q37

```java
int x = 10;
switch(x/5){
    case 1: System.out.println("A");
    case 2: System.out.println("B");
}
```

### Q38

```java
int x = 3;
switch(x){
    case 1:
    case 3:
        System.out.println("Odd");
}
```

### Q39

```java
int x = 7;
switch(x){
    case 1: System.out.println("A");
    case 2: System.out.println("B");
    default: System.out.println("D");
}
```

### Q40

```java
int x = 2;
switch(x){
    case 2:
        System.out.println("A");
    default:
        System.out.println("B");
}
```

---

## 💣 Tricky

### Q41

```java
int x = 1;
switch(x){
    case 1: break;
    default: System.out.println("D");
}
```

### Q42

```java
int x = 4;
switch(x){
    case 1:
    case 2:
        System.out.println("Low");
        break;
    case 3:
    case 4:
        System.out.println("High");
}
```

### Q43

```java
int x = 2;
switch(x){
    case 2:
    case 3:
    case 4:
        System.out.println("Range");
}
```

### Q44

```java
int x = 6;
switch(x){
    case 1:
    case 2:
        System.out.println("A");
    default:
        System.out.println("B");
}
```

### Q45

```java
int x = 2;
switch(x){
    default:
        System.out.println("D");
    case 1:
        System.out.println("A");
}
```

---

## 🧠 Logical

### Q46

```java
int x = 0;
switch(x){
    case 0:
        System.out.println("Zero");
        break;
    default:
        System.out.println("Other");
}
```

### Q47

```java
int x = 2;
switch(x){
    case 2: System.out.println("A");
    case 3: System.out.println("B");
    case 4: System.out.println("C");
}
```

### Q48

```java
int x = 3;
switch(x){
    case 1: break;
    case 2: break;
    case 3: System.out.println("C");
}
```

### Q49

```java
int x = 5;
switch(x){
    case 5:
        System.out.println("A");
        break;
    default:
        System.out.println("B");
}
```

### Q50

```java
int x = 8;
switch(x){
    case 1:
    case 2:
    case 3:
        System.out.println("Small");
        break;
    default:
        System.out.println("Big");
}
```

---

# 🌍 REAL-LIFE PROBLEMS (WITH CODE)

## 1. Voting Eligibility

```java
int age = 18;
if(age >= 18)
    System.out.println("Can Vote");
else
    System.out.println("Cannot Vote");
```

## 2. Largest of 3 Numbers

```java
int a = 10, b = 20, c = 15;
if(a > b && a > c)
    System.out.println("A is largest");
else if(b > c)
    System.out.println("B is largest");
else
    System.out.println("C is largest");
```

## 3. Even or Odd

```java
int x = 7;
if(x % 2 == 0)
    System.out.println("Even");
else
    System.out.println("Odd");
```

## 4. Grade System

```java
int marks = 85;
if(marks >= 90)
    System.out.println("A");
else if(marks >= 75)
    System.out.println("B");
else if(marks >= 50)
    System.out.println("C");
else
    System.out.println("Fail");
```

## 5. Leap Year

```java
int year = 2024;
if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
    System.out.println("Leap Year");
else
    System.out.println("Not Leap Year");
```

## 6. Menu Calculator

```java
int a = 10, b = 5;
char op = '+';
switch(op){
    case '+': System.out.println(a+b); break;
    case '-': System.out.println(a-b); break;
    case '*': System.out.println(a*b); break;
    case '/': System.out.println(a/b); break;
}
```

## 7. ATM Withdrawal

```java
int balance = 5000, amount = 2000;
if(amount <= balance)
    System.out.println("Withdraw Success");
else
    System.out.println("Insufficient Balance");
```

## 8. Login Validation

```java
String user = "admin";
String pass = "1234";
if(user.equals("admin") && pass.equals("1234"))
    System.out.println("Login Success");
else
    System.out.println("Invalid");
```

## 9. Traffic Signal

```java
String signal = "Red";
switch(signal){
    case "Red": System.out.println("Stop"); break;
    case "Yellow": System.out.println("Wait"); break;
    case "Green": System.out.println("Go"); break;
}
```

## 10. Day of Week

```java
int day = 3;
switch(day){
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    case 3: System.out.println("Wednesday"); break;
}
```

---

# ✅ ANSWERS (SERIAL ORDER)

## Conditional

1. A
2. B
3. Yes
4. No Output
5. Equal
6. B
7. Negative
8. A
9. B
10. No Output
11. Yes
12. 6
13. 6
14. 11
15. 6
16. 7
17. B
18. A B
19. A
20. Hello
21. Zero
22. B
23. Odd
24. Both
25. Invalid

## Switch

26. A
27. B
28. B
29. D
30. Group
31. B C
32. B
33. E
34. A B
35. Apple
36. Hello
37. B
38. Odd
39. D
40. A B
41. No Output
42. High
43. Range
44. B
45. D A
46. Zero
47. A B C
48. C
49. A
50. Big

---

# 💡 Teaching Tip

Force explanation of execution flow. No guessing allowed.
