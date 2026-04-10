
# JAVA - Basic - Part 14 - Strings (Complete Teaching Notes)

---

# 📌 1. What is a String?

* A **String** is a sequence of characters.
* In Java, String is an **object**, not a primitive.
* Strings are **immutable** (cannot be changed after creation).

```java
String name = "Akash";
```

---

# 🧠 2. Memory Concept (VERY IMPORTANT)

## 🔹 String Constant Pool (SCP)

```java
String a = "hello";
String b = "hello";

System.out.println(a == b); // true
```

👉 Both refer to same memory in SCP

---

## 🔹 Heap Memory

```java
String a = new String("hello");
String b = new String("hello");

System.out.println(a == b); // false
```

👉 Different objects in heap

---

# 🔥 3. Immutability

```java
String s = "hello";
s.concat(" world");

System.out.println(s); // hello
```

👉 String does not change

```java
s = s.concat(" world");
System.out.println(s); // hello world
```

---

# 🛠️ 4. Important String Methods

---

## 🔹 4.1 length()

```java
String s = "Akash";
System.out.println(s.length()); // 5
```

---

## 🔹 4.2 charAt()

```java
System.out.println(s.charAt(2)); // a
```

---

## 🔹 4.3 equals()

```java
String a = "java";
String b = "java";

System.out.println(a.equals(b)); // true
```

---

## 🔹 4.4 equalsIgnoreCase()

```java
System.out.println("JAVA".equalsIgnoreCase("java")); // true
```

---

## 🔹 4.5 compareTo()

```java
System.out.println("apple".compareTo("banana")); // negative
```

---

## 🔹 4.6 indexOf()

```java
String s = "programming";
System.out.println(s.indexOf('g')); // first occurrence
```

---

## 🔹 4.7 lastIndexOf()

```java
System.out.println(s.lastIndexOf('g')); // last occurrence
```

---

## 🔹 4.8 contains()

```java
System.out.println(s.contains("gram")); // true
```

---

## 🔹 4.9 substring()

```java
String s = "Programming";

System.out.println(s.substring(3));     // gramming
System.out.println(s.substring(3, 6));  // gra
```

---

## 🔹 4.10 toUpperCase() & toLowerCase()

```java
System.out.println("java".toUpperCase());
System.out.println("JAVA".toLowerCase());
```

---

## 🔹 4.11 trim()

```java
String s = "  hello  ";
System.out.println(s.trim()); // "hello"
```

---

## 🔹 4.12 replace()

```java
String s = "java";
System.out.println(s.replace('a', 'o')); // jovo
```

---

## 🔹 4.13 split()

```java
String s = "a,b,c";
String[] arr = s.split(",");

for(String val : arr){
    System.out.println(val);
}
```

---

## 🔹 4.14 startsWith() / endsWith()

```java
String s = "Akash";

System.out.println(s.startsWith("A")); // true
System.out.println(s.endsWith("sh"));  // true
```

---

## 🔹 4.15 toCharArray()

```java
char[] arr = "hello".toCharArray();

for(char c : arr){
    System.out.println(c);
}
```

---

# 🔗 5. Method Chaining

```java
String s = "Java Programming";

System.out.println(
    s.substring(5)
     .toUpperCase()
     .replace("A", "@")
);
```

---

# 🔧 6. StringBuilder

## 🔹 Why?

* String is immutable
* StringBuilder is mutable

```java
StringBuilder sb = new StringBuilder("Hello");

sb.append(" World");
System.out.println(sb);
```

---

## 🔹 Methods

```java
sb.append("!");
sb.insert(5, "_");
sb.delete(0, 2);
sb.reverse();
System.out.println(sb.length());
```

---

# 🔧 7. StringBuffer

```java
StringBuffer sb = new StringBuffer("Hello");
sb.append(" World");
System.out.println(sb);
```

### Difference

* StringBuilder → Fast
* StringBuffer → Thread-safe

---

# 💣 8. Important Edge Cases

## 🔹 == vs equals()

```java
String a = "java";
String b = new String("java");

System.out.println(a == b);      // false
System.out.println(a.equals(b)); // true
```

---

## 🔹 Empty vs Null

```java
String s1 = "";
String s2 = null;

System.out.println(s1.length()); // 0
// s2.length(); // Exception
```

---

## 🔹 intern()

```java
String s1 = new String("java");
String s2 = s1.intern();

System.out.println(s1 == s2); // false
```

---

# 🔁 9. Important Programs

## 🔹 Reverse String

```java
String s = "hello";
String rev = "";

for(int i = s.length()-1; i >= 0; i--){
    rev += s.charAt(i);
}

System.out.println(rev);
```

---

## 🔹 Palindrome

```java
String s = "madam";
String rev = "";

for(int i = s.length()-1; i >= 0; i--){
    rev += s.charAt(i);
}

System.out.println(s.equals(rev));
```

---

## 🔹 Count Vowels

```java
String s = "education";
int count = 0;

for(char c : s.toCharArray()){
    if("aeiou".contains(c+"")){
        count++;
    }
}

System.out.println(count);
```

---

# 🎯 10. Hidden Truths (Must Teach)

* String is immutable
* "==" checks reference
* concat() does not modify original
* String pool saves memory
* StringBuilder is best for modifications

---

# ⚡ 11. Quick Revision

* String = immutable
* SCP vs Heap
* equals vs ==
* substring, split, replace (important)
* StringBuilder vs StringBuffer

---

# 🏁 END

👉 This covers everything needed to teach Strings effectively in 1 hour.
