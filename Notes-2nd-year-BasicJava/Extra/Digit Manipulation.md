# 🔢 DIGIT MANIPULATION

---

# 🧠 CORE CONCEPT

| Operation | Meaning           |
| --------- | ----------------- |
| n % 10    | Last digit        |
| n / 10    | Remove last digit |

### Example

```java
int n = 1234;
while(n > 0){
    int digit = n % 10;
    System.out.print(digit + " ");
    n = n / 10;
}
```

**Output:** `4 3 2 1`

---

# ⚠️ EDGE CASES (WITH EXAMPLES)

## 1. Number = 0

```java
int n = 0;
if(n == 0) System.out.println(0);
```

## 2. Negative Number

```java
int n = -123;
n = Math.abs(n);
```

## 3. Single Digit

```java
int n = 7;
System.out.println(n % 10); // 7
```

## 4. Leading Zero Loss

```java
int n = 100;
int rev = 0;
while(n > 0){
    rev = rev * 10 + n % 10;
    n /= 10;
}
System.out.println(rev); // 1
```

## 5. Reverse Overflow (concept)

👉 For very large numbers, reverse may overflow `int`

---

# 🚀 CONCEPT PROGRAMS

## 1. Sum of Digits

```java
int n = 123, sum = 0;
while(n > 0){
    sum += n % 10;
    n /= 10;
}
System.out.println(sum);
```

## 2. Count Digits

```java
int n = 12345, count = 0;
while(n > 0){
    count++;
    n /= 10;
}
System.out.println(count);
```

## 3. Reverse Number

```java
int n = 1234, rev = 0;
while(n > 0){
    rev = rev * 10 + n % 10;
    n /= 10;
}
System.out.println(rev);
```

## 4. Palindrome

```java
int n = 121, temp = n, rev = 0;
while(n > 0){
    rev = rev * 10 + n % 10;
    n /= 10;
}
System.out.println(temp == rev ? "Palindrome" : "Not Palindrome");
```

## 5. Armstrong (3-digit)

```java
int n = 153, temp = n, sum = 0;
while(n > 0){
    int d = n % 10;
    sum += d*d*d;
    n /= 10;
}
System.out.println(sum == temp ? "Armstrong" : "Not Armstrong");
```

## 6. Prime Number

```java
int n = 7;
boolean isPrime = true;
if(n <= 1) isPrime = false;
for(int i = 2; i < n; i++){
    if(n % i == 0){
        isPrime = false;
        break;
    }
}
System.out.println(isPrime ? "Prime" : "Not Prime");
```

---

# 🎯 OUTPUT PREDICTION

## 🟢 EASY

### Q1

```java
int n = 456;
while(n > 0){
    System.out.print(n % 10);
    n /= 10;
}
```

### Q2

```java
int n = 123, sum = 0;
while(n > 0){
    sum += n % 10;
    n /= 10;
}
System.out.println(sum);
```

### Q3

```java
int n = 100, count = 0;
while(n > 0){
    count++;
    n /= 10;
}
System.out.println(count);
```

### Q4

```java
int n = 7;
System.out.println(n % 10);
```

---

## 🟡 MEDIUM

### Q5

```java
int n = 123, rev = 0;
while(n > 0){
    rev = rev * 10 + n % 10;
    n /= 10;
}
System.out.println(rev);
```

### Q6

```java
int n = 121, rev = 0, temp = n;
while(n > 0){
    rev = rev * 10 + n % 10;
    n /= 10;
}
System.out.println(temp == rev);
```

### Q7

```java
int n = 153, sum = 0, temp = n;
while(n > 0){
    int d = n % 10;
    sum += d*d*d;
    n /= 10;
}
System.out.println(sum == temp);
```

### Q8

```java
int n = 10;
while(n > 0){
    System.out.print(n % 2);
    n /= 2;
}
```

---

## 🔴 HARD

### Q9

```java
int n = 101, rev = 0;
while(n > 0){
    rev = rev * 10 + n % 10;
    n /= 10;
}
System.out.println(rev);
```

### Q10

```java
int n = 120, rev = 0;
while(n > 0){
    rev = rev * 10 + n % 10;
    n /= 10;
}
System.out.println(rev);
```

### Q11

```java
int n = 5;
boolean prime = true;
for(int i = 2; i < n; i++){
    if(n % i == 0){
        prime = false;
        break;
    }
}
System.out.println(prime);
```

### Q12

```java
int n = 1;
boolean prime = true;
for(int i = 2; i < n; i++){
    if(n % i == 0){
        prime = false;
        break;
    }
}
System.out.println(prime);
```

---

## 💣 TRICKY

### Q13

```java
int n = 10;
while(n > 0){
    System.out.print(n % 10);
    n = n / 10;
}
System.out.print(n);
```

### Q14

```java
int n = 1010, count = 0;
while(n > 0){
    if(n % 10 == 0) count++;
    n /= 10;
}
System.out.println(count);
```

### Q15

```java
int n = 1221, rev = 0;
while(n > 0){
    rev = rev * 10 + n % 10;
    n /= 10;
}
System.out.println(rev == 1221);
```

---

# 🧑‍💻 CODING PROBLEMS (WRITE CODE)

## 1. Sum of digits

```java
// input: n
// output: sum
```

## 2. Reverse number

```java
// reverse logic
```

## 3. Palindrome

```java
// compare original and reverse
```

## 4. Count digits

```java
// count loop
```

## 5. Largest digit

```java
int n = 5729, max = 0;
while(n > 0){
    int d = n % 10;
    if(d > max) max = d;
    n /= 10;
}
System.out.println(max);
```

## 6. Smallest digit

```java
int n = 5729, min = 9;
while(n > 0){
    int d = n % 10;
    if(d < min) min = d;
    n /= 10;
}
System.out.println(min);
```

## 7. Armstrong

```java
// cube logic
```

## 8. Print digits line by line

```java
int n = 123;
while(n > 0){
    System.out.println(n % 10);
    n /= 10;
}
```

## 9. Prime

```java
// check divisibility
```

## 10. Print primes till N

```java
int n = 10;
for(int i = 2; i <= n; i++){
    boolean prime = true;
    for(int j = 2; j < i; j++){
        if(i % j == 0){
            prime = false;
            break;
        }
    }
    if(prime) System.out.print(i + " ");
}
```

## 11. Product of digits

```java
int n = 123, prod = 1;
while(n > 0){
    prod *= n % 10;
    n /= 10;
}
System.out.println(prod);
```

## 12. Count even digits

```java
int n = 1234, count = 0;
while(n > 0){
    if((n % 10) % 2 == 0) count++;
    n /= 10;
}
System.out.println(count);
```

---

# ✅ ANSWERS

1. 654
2. 6
3. 3
4. 7
5. 321
6. true
7. true
8. 0101
9. 101
10. 21
11. true
12. true ❌ (1 is not prime)
13. 010
14. 2
15. true

---

# ⚡ GOLDEN RULE

Digit Problems = Loop + %10 + /10 + Logic
