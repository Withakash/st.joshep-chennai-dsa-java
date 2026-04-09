# 🚀 JAVA ARRAYS — OUTPUT BASED QUESTIONS (HARD + TRICKY)

---

# 🎯 INSTRUCTIONS

👉 Do NOT run code immediately
👉 First predict output
👉 Then verify
👉 Focus on WHY

---

# 🔥 SECTION 1 — BASICS WITH TWIST

## Q1

```java
int[] arr = {1,2,3};
System.out.println(arr[1]);
```

## Q2

```java
int[] arr = new int[3];
System.out.println(arr[0]);
```

## Q3

```java
int[] arr = {1,2,3};
arr[1] = 10;
System.out.println(arr[1]);
```

## Q4

```java
int[] arr = {1,2,3};
System.out.println(arr.length);
```

## Q5

```java
int[] arr = {1,2,3};
System.out.println(arr[3]);
```

---

# 🔥 SECTION 2 — LOOP CONFUSION

## Q6

```java
int[] arr = {1,2,3};
for(int i=0;i<arr.length;i++) {
    System.out.print(arr[i]+" ");
}
```

## Q7

```java
int[] arr = {1,2,3};
for(int i=arr.length-1;i>=0;i--) {
    System.out.print(arr[i]+" ");
}
```

## Q8

```java
int[] arr = {1,2,3};
for(int i=0;i<=arr.length;i++) {
    System.out.print(arr[i]+" ");
}
```

## Q9

```java
int[] arr = {1,2,3};
for(int i=0;i<arr.length;i++) {
    arr[i] = arr[i] * 2;
}
System.out.println(arr[2]);
```

## Q10

```java
int[] arr = {1,2,3};
for(int i=0;i<arr.length;i++) {
    arr[i] += i;
}
System.out.println(arr[2]);
```

---

# 🔥 SECTION 3 — REFERENCE TRAPS

## Q11

```java
int[] a = {1,2,3};
int[] b = a;
b[0] = 100;
System.out.println(a[0]);
```

## Q12

```java
int[] a = {1,2,3};
int[] b = a.clone();
b[0] = 100;
System.out.println(a[0]);
```

## Q13

```java
int[] a = {1,2,3};
int[] b = new int[3];
b = a;
System.out.println(b[1]);
```

## Q14

```java
int[] a = {1,2,3};
a = new int[5];
System.out.println(a[2]);
```

## Q15

```java
int[] a = {1,2,3};
a = null;
System.out.println(a[0]);
```

---

# 🔥 SECTION 4 — FOR-EACH TRAPS

## Q16

```java
int[] arr = {1,2,3};
for(int x : arr) {
    x = x * 2;
}
System.out.println(arr[1]);
```

## Q17

```java
int[] arr = {1,2,3};
for(int x : arr) {
    System.out.print(x+" ");
}
```

## Q18

```java
int[] arr = {1,2,3};
for(int i=0;i<arr.length;i++) {
    arr[i]++;
}
for(int x: arr) System.out.print(x+" ");
```

---

# 🔥 SECTION 5 — MULTI-DIMENSIONAL TRAPS

## Q19

```java
int[][] arr = new int[2][3];
System.out.println(arr[1][2]);
```

## Q20

```java
int[][] arr = {{1,2},{3,4}};
System.out.println(arr[1][0]);
```

## Q21

```java
int[][] arr = new int[2][];
System.out.println(arr[0]);
```

## Q22

```java
int[][] arr = {{1,2,3},{4,5}};
System.out.println(arr[1].length);
```

---

# 🔥 SECTION 6 — EDGE CASES

## Q23

```java
int[] arr = new int[0];
System.out.println(arr.length);
```

## Q24

```java
int[] arr = new int[3];
System.out.println(arr);
```

## Q25

```java
int[] arr = {1,2,3};
System.out.println(arr.hashCode());
```

---

# 🔥 SECTION 7 — ADVANCED TRAPS

## Q26

```java
int[] arr = {1,2,3};
int sum = 0;
for(int x : arr) sum += x;
System.out.println(sum);
```

## Q27

```java
int[] arr = {1,2,3};
int[] b = arr;
arr = new int[]{5,6,7};
System.out.println(b[0]);
```

## Q28

```java
int[] arr = {1,2,3};
System.out.println(arr.equals(new int[]{1,2,3}));
```

## Q29

```java
int[] arr = {1,2,3};
System.out.println(java.util.Arrays.equals(arr, new int[]{1,2,3}));
```

## Q30

```java
int[] arr = {1,2,3};
System.out.println(arr.toString());
```

---

# 🔥 SECTION 8 — FINAL LEVEL (CONFUSION ZONE)

## Q31

```java
int[] arr = {1,2,3};
for(int i=0;i<arr.length;i++) {
    arr[i] = arr[i] + arr.length;
}
System.out.println(arr[2]);
```

## Q32

```java
int[] arr = {1,2,3};
for(int i=0;i<arr.length;i++) {
    arr[i] = arr[arr.length - i - 1];
}
System.out.println(arr[0]);
```

## Q33

```java
int[] arr = {1,2,3};
int temp = arr[0];
arr[0] = arr[2];
arr[2] = temp;
System.out.println(arr[1]);
```

## Q34

```java
int[] arr = {1,2,3};
System.out.println(arr instanceof Object);
```

## Q35

```java
int[] arr = {1,2,3};
Object obj = arr;
System.out.println(obj.getClass().getName());
```

---

# 🔥 BONUS (VERY TRICKY)

## Q36

```java
int[] arr = {1,2,3};
System.out.println(arr == arr.clone());
```

## Q37

```java
int[] arr = {1,2,3};
System.out.println(arr.clone()[1]);
```

## Q38

```java
int[] arr = {1,2,3};
System.out.println(arr.getClass());
```

## Q39

```java
int[] arr = {1,2,3};
System.out.println(arr.getClass().getSuperclass());
```

## Q40

```java
int[] arr = {1,2,3};
System.out.println(arr.getClass().isArray());
```

---

# ⚠️ FINAL REALITY CHECK

If students fail here, they don’t understand:

* References
* Memory
* Loops

👉 Which means they are NOT ready for DSA.

---

# 🚀 END
