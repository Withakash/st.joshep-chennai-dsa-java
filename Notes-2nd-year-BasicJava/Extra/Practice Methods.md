# 🧪 JAVA Methods Practice (Day 11 & 12)

---

# 🔥 Part 1: 50 Output-Based Questions

## 🟢 Basic Level

### Q1

```java
class Test {
    static void show() {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        show();
    }
}
```

👉 Output: Hello

---

### Q2

```java
class Test {
    static int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(add(2,3));
    }
}
```

👉 Output: 5

---

### Q3

```java
class Test {
    static void test(int x) {
        x = x + 10;
        System.out.println(x);
    }
    public static void main(String[] args) {
        int a = 5;
        test(a);
        System.out.println(a);
    }
}
```

👉 Output: 15 5

---

### Q4

```java
class Test {
    static int test() {
        return 10;
    }
    public static void main(String[] args) {
        int x = test();
        System.out.println(x + 5);
    }
}
```

👉 Output: 15

---

### Q5

```java
class Test {
    static void show() {
        System.out.println("A");
    }
    public static void main(String[] args) {
        show();
        show();
    }
}
```

👉 Output: A A

---

## 🟡 Medium Level

### Q6

```java
class Test {
    static int square(int x) {
        return x * x;
    }
    public static void main(String[] args) {
        System.out.println(square(3) + square(2));
    }
}
```

👉 Output: 13

---

### Q7

```java
class Test {
    static int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(add(add(1,2),3));
    }
}
```

👉 Output: 6

---

### Q8

```java
class Test {
    static void test(int x) {
        x++;
        System.out.println(x);
    }
    public static void main(String[] args) {
        int a = 10;
        test(a);
        System.out.println(a);
    }
}
```

👉 Output: 11 10

---

### Q9

```java
class Test {
    static int test(int x) {
        return x++;
    }
    public static void main(String[] args) {
        int a = 5;
        System.out.println(test(a));
        System.out.println(a);
    }
}
```

👉 Output: 5 5

---

### Q10

```java
class Test {
    static int test(int x) {
        return ++x;
    }
    public static void main(String[] args) {
        int a = 5;
        System.out.println(test(a));
        System.out.println(a);
    }
}
```

👉 Output: 6 5

---

## 🔴 Advanced Level

### Q11

```java
class A {
    static void show() { System.out.println("A"); }
}
class B extends A {
    static void show() { System.out.println("B"); }
}
class Test {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}
```

👉 Output: A

---

### Q12

```java
class A {
    void show() { System.out.println("A"); }
}
class B extends A {
    void show() { System.out.println("B"); }
}
class Test {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}
```

👉 Output: B

---

### Q13

```java
class Test {
    static int a = 10;
    static void test() {
        a += 5;
    }
    public static void main(String[] args) {
        test();
        System.out.println(a);
    }
}
```

👉 Output: 15

---

### Q14

```java
class Test {
    int a = 10;
    void test() {
        a += 5;
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.test();
        System.out.println(t.a);
    }
}
```

👉 Output: 15

---

### Q15

```java
class Test {
    static void test(String s) {
        s = "Java";
    }
    public static void main(String[] args) {
        String str = "Hi";
        test(str);
        System.out.println(str);
    }
}
```

👉 Output: Hi

---

### Q16

```java
class Test {
    static int a = 5;
    static void change() {
        a *= 2;
    }
    public static void main(String[] args) {
        change();
        System.out.println(a);
    }
}
```

👉 Output: 10

---

### Q17

```java
class Test {
    int a = 5;
    void change() {
        a *= 2;
    }
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        t1.change();
        System.out.println(t1.a + " " + t2.a);
    }
}
```

👉 Output: 10 5

---

### Q18

```java
class Test {
    static void test(int a, int b) {
        System.out.println(a + b);
    }
    public static void main(String[] args) {
        test(2, 3);
    }
}
```

👉 Output: 5

---

### Q19

```java
class Test {
    static int test(int a) {
        return a * 2;
    }
    public static void main(String[] args) {
        System.out.println(test(test(2)));
    }
}
```

👉 Output: 8

---

### Q20

```java
class Test {
    static int test(int a) {
        a = a + 5;
        return a;
    }
    public static void main(String[] args) {
        int x = 5;
        test(x);
        System.out.println(x);
    }
}
```

👉 Output: 5

---

### Q21

```java
class Test {
    static int a = 10;
    static void test() {
        int a = 5;
        System.out.println(a);
    }
    public static void main(String[] args) {
        test();
        System.out.println(a);
    }
}
```

👉 Output: 5 10

---

### Q22

```java
class Test {
    static void test() {
        System.out.println("X");
    }
    static void test(int a) {
        System.out.println("Y");
    }
    public static void main(String[] args) {
        test();
        test(5);
    }
}
```

👉 Output: X Y

---

### Q23

```java
class Test {
    static int test(int a, int b) {
        return a > b ? a : b;
    }
    public static void main(String[] args) {
        System.out.println(test(3,7));
    }
}
```

👉 Output: 7

---

### Q24

```java
class Test {
    static void test(int x) {
        System.out.println(x);
    }
    public static void main(String[] args) {
        test(5);
        test(10);
    }
}
```

👉 Output: 5 10

---

### Q25

```java
class Test {
    static int test(int x) {
        return x * x;
    }
    public static void main(String[] args) {
        int a = test(3);
        int b = test(4);
        System.out.println(a + b);
    }
}
```

👉 Output: 25

---

### Q26

```java
class A {
    void show() { System.out.println("A"); }
}
class B extends A {
    void show() { System.out.println("B"); }
}
class Test {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
```

👉 Output: B

---

### Q27

```java
class A {
    static void show() { System.out.println("A"); }
}
class B extends A {
    static void show() { System.out.println("B"); }
}
class Test {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
```

👉 Output: B

---

### Q28

```java
class Test {
    static int test(int x) {
        return x--;
    }
    public static void main(String[] args) {
        System.out.println(test(5));
    }
}
```

👉 Output: 5

---

### Q29

```java
class Test {
    static int test(int x) {
        return --x;
    }
    public static void main(String[] args) {
        System.out.println(test(5));
    }
}
```

👉 Output: 4

---

### Q30

```java
class Test {
    static void test() {
        System.out.println("Hello");
        return;
    }
    public static void main(String[] args) {
        test();
    }
}
```

👉 Output: Hello

---

### Q31

```java
class Test {
    static int test(int x) {
        if(x > 5) return x;
        return x * 2;
    }
    public static void main(String[] args) {
        System.out.println(test(4));
    }
}
```

👉 Output: 8

---

### Q32

```java
class Test {
    static int test(int x) {
        if(x > 5) return x;
        return x * 2;
    }
    public static void main(String[] args) {
        System.out.println(test(6));
    }
}
```

👉 Output: 6

---

### Q33

```java
class Test {
    static void test(int x) {
        x = x * 10;
    }
    public static void main(String[] args) {
        int a = 2;
        test(a);
        System.out.println(a);
    }
}
```

👉 Output: 2

---

### Q34

```java
class Test {
    static int a = 1;
    static void test() {
        a++;
    }
    public static void main(String[] args) {
        test();
        test();
        System.out.println(a);
    }
}
```

👉 Output: 3

---

### Q35

```java
class Test {
    int a = 1;
    void test() {
        a++;
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.test();
        t.test();
        System.out.println(t.a);
    }
}
```

👉 Output: 3

---

### Q36

```java
class Test {
    static int test(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(test(2, test(3,4)));
    }
}
```

👉 Output: 9

---

### Q37

```java
class Test {
    static void test() {
        System.out.println("A");
    }
    public static void main(String[] args) {
        test();
        System.out.println("B");
    }
}
```

👉 Output: A B

---

### Q38

```java
class Test {
    static int test() {
        return 5;
    }
    public static void main(String[] args) {
        int x = test();
        x += test();
        System.out.println(x);
    }
}
```

👉 Output: 10

---

### Q39

```java
class Test {
    static int test(int x) {
        return x + test(x - 1);
    }
    public static void main(String[] args) {
        System.out.println(test(2));
    }
}
```

👉 Output: StackOverflowError (no base case)

---

### Q40

```java
class Test {
    static int test(int x) {
        if(x == 0) return 0;
        return x + test(x - 1);
    }
    public static void main(String[] args) {
        System.out.println(test(3));
    }
}
```

👉 Output: 6

---

### Q41

```java
class Test {
    static void test(String s) {
        s = s + " Java";
    }
    public static void main(String[] args) {
        String str = "Hi";
        test(str);
        System.out.println(str);
    }
}
```

👉 Output: Hi

---

### Q42

```java
class Test {
    static void test(int[] arr) {
        arr[0] = 100;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        test(arr);
        System.out.println(arr[0]);
    }
}
```

👉 Output: 100

---

### Q43

```java
class Test {
    static void test(int[] arr) {
        arr = new int[]{5,6,7};
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        test(arr);
        System.out.println(arr[0]);
    }
}
```

👉 Output: 1

---

### Q44

```java
class Test {
    static int test(int x) {
        return x > 0 ? test(x-1) : 0;
    }
    public static void main(String[] args) {
        System.out.println(test(3));
    }
}
```

👉 Output: 0

---

### Q45

```java
class Test {
    static int test(int x) {
        return x == 1 ? 1 : x * test(x-1);
    }
    public static void main(String[] args) {
        System.out.println(test(4));
    }
}
```

👉 Output: 24

---

### Q46

```java
class Test {
    static void test() {
        System.out.println("Start");
        return;
    }
    public static void main(String[] args) {
        test();
        System.out.println("End");
    }
}
```

👉 Output: Start End

---

### Q47

```java
class Test {
    static int test(int x) {
        if(x == 0) return 1;
        return x * test(x-1);
    }
    public static void main(String[] args) {
        System.out.println(test(3));
    }
}
```

👉 Output: 6

---

### Q48

```java
class Test {
    static void test(int x) {
        System.out.println(x);
        if(x > 1) test(x-1);
    }
    public static void main(String[] args) {
        test(3);
    }
}
```

👉 Output: 3 2 1

---

### Q49

```java
class Test {
    static void test(int x) {
        if(x > 1) test(x-1);
        System.out.println(x);
    }
    public static void main(String[] args) {
        test(3);
    }
}
```

👉 Output: 1 2 3

---

### Q50

```java
class Test {
    static int test(int x) {
        if(x <= 1) return 1;
        return test(x-1) + test(x-2);
    }
    public static void main(String[] args) {
        System.out.println(test(5));
    }
}
```

👉 Output: 8

---

---

# 💻 Part 2: 15 Method-Based Problems

## 🟢 Easy

1. Create method to print numbers from 1 to N
2. Create method to check even or odd
3. Create method to return square of number
4. Create method to print multiplication table
5. Create method to count digits

---

## 🟡 Medium

6. Method to reverse a number
7. Method to check palindrome number
8. Method to find max of 3 numbers
9. Method to calculate factorial
10. Method to sum digits

---

## 🔴 Hard

11. Method to check prime number
12. Method to print Fibonacci series
13. Method to implement calculator using switch
14. Method overloading for area (circle, square, rectangle)
15. Method overriding example using Shape class

---

# 🎯 Final Tip

Practice output questions daily → builds strong logic

Practice problems → builds coding confidence 🚀
