# 🚀 JAVA OOP UTILITY METHODS (CLASS & OBJECT)

---

# 🎯 PURPOSE

👉 Understand important built-in methods related to:

* Objects
* Classes
* Type checking

👉 These are heavily asked in interviews.

---

# 🔥 ROOT CONCEPT

👉 Every class in Java extends:

```java
class Object
```

👉 So every object has access to Object class methods.

---

# 🔹 1. instanceof (TYPE CHECKING)

## 📌 Syntax

```java
object instanceof ClassName
```

---

## 📌 Example

```java
class Animal {}
class Dog extends Animal {}

Dog d = new Dog();

System.out.println(d instanceof Dog);     // true
System.out.println(d instanceof Animal);  // true
System.out.println(d instanceof Object);  // true
```

---

## 🔥 Use Cases

👉 Runtime type checking
👉 Safe type casting

```java
if(obj instanceof Dog) {
    Dog d = (Dog) obj;
}
```

---

## ⚠️ Trap

```java
Animal a = new Dog();
System.out.println(a instanceof Dog); // true
```

👉 Checks actual object, NOT reference type

---

# 🔹 2. getClass()

## 📌 Syntax

```java
object.getClass()
```

---

## 📌 Example

```java
String s = "Hello";
System.out.println(s.getClass());
```

Output:

```
class java.lang.String
```

---

## 🔥 Use Cases

👉 Get runtime class info
👉 Reflection

```java
System.out.println(s.getClass().getName());
```

---

## ⚠️ Important

👉 Works at runtime (not compile-time)

---

# 🔹 3. equals()

## 📌 Default Behavior

```java
== → compares reference
.equals() → compares content (if overridden)
```

---

## 📌 Example

```java
String a = new String("Hello");
String b = new String("Hello");

System.out.println(a == b);        // false
System.out.println(a.equals(b));   // true
```

---

## 🔥 Use Cases

👉 Content comparison
👉 Custom logic in classes

---

# 🔹 4. hashCode()

## 📌 Example

```java
String s = "Hello";
System.out.println(s.hashCode());
```

---

## 🔥 Use Cases

👉 Used in:

* HashMap
* HashSet

👉 Must override with equals()

---

# 🔹 5. toString()

## 📌 Default Behavior

```java
System.out.println(obj);
```

Output:

```
ClassName@hashcode
```

---

## 📌 Custom Example

```java
class Student {
    int id = 1;

    public String toString() {
        return "Student ID: " + id;
    }
}
```

---

## 🔥 Use Cases

👉 Debugging
👉 Logging

---

# 🔹 6. getClass().getName()

```java
System.out.println(obj.getClass().getName());
```

👉 Gives full class name

---

# 🔹 7. getClass().getSimpleName()

```java
System.out.println(obj.getClass().getSimpleName());
```

👉 Only class name (no package)

---

# 🔹 8. clone()

## 📌 Example

```java
int[] arr = {1,2,3};
int[] copy = arr.clone();

System.out.println(copy[0]);
```

---

## 🔥 Use Cases

👉 Copy objects/arrays

---

## ⚠️ Trap

👉 Shallow copy, not deep copy

---

# 🔹 9. instanceof vs getClass()

| Feature            | instanceof | getClass() |
| ------------------ | ---------- | ---------- |
| Checks inheritance | ✅          | ❌          |
| Exact class match  | ❌          | ✅          |
| Runtime check      | ✅          | ✅          |

---

## 📌 Example

```java
Animal a = new Dog();

System.out.println(a instanceof Animal); // true
System.out.println(a.getClass() == Animal.class); // false
```

---

# 🔥 REAL INTERVIEW CASES

## Case 1 — Safe Casting

```java
if(obj instanceof String) {
    String s = (String) obj;
}
```

---

## Case 2 — Debugging Type

```java
System.out.println(obj.getClass().getName());
```

---

## Case 3 — Compare Objects

```java
if(a.equals(b)) {
    System.out.println("Same content");
}
```

---

# ⚠️ COMMON MISTAKES

❌ Using == for objects
❌ Forgetting to override equals()
❌ Thinking instanceof checks reference type

---

# 🎯 FINAL TRUTH

If student doesn’t understand these:

* They will fail in OOP
* They will fail in interviews
* They will misuse objects badly

👉 This is NOT optional knowledge

---

# 🚀 END
