# 📘 Day 1 – DSA Training Notes (Java Basics + Linked List)

---

## 🔹 1. Java Warm-up Revision

### Example

```java
int a = 10;
int b = 20;
System.out.println(a + b);
```

### Output

```
30
```

### Key Concepts

* `System.out.println()` → prints output to console
* **Class** → blueprint of object
* **main() method** → entry point of program

---

## 🔹 2. Quick Java Concepts

* **Array** → collection of elements (fixed size)
* **Array vs ArrayList**

  * Array → fixed size
  * ArrayList → dynamic size
* **Object** → instance of class
* **Class** → defines structure

---

## 🔹 3. Small Coding Exercise

### Problem: Sum of 5 Numbers

```java
import java.util.Scanner;

class Main {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int sum = 0;

       for(int i = 0; i < 5; i++) {
           sum += sc.nextInt();
       }

       System.out.println(sum);
   }
}
```

---

## 🔹 4. Arrays Revision

```java
int arr[] = {10, 20, 30, 40, 50};
System.out.println(arr[0]); // 10
```

### Problems with Arrays

* Fixed size
* Insertion costly
* Deletion costly
* Memory wastage

👉 Solution: **Dynamic Data Structures**

---

## 🔹 5. Dynamic Data Structures

* Linked List
* Stack
* Queue
* Tree
* Graph

👉 Today Focus: **Linked List**

---

## 🔹 6. Linked List Concept

Structure:

```
[10 | next] → [20 | next] → [30 | NULL]
```

### Each Node Contains

1. Data
2. Reference to next node

---

## 🔹 7. Real-Life Analogy

Train Example 🚆

* Engine → Coach → Coach
* Each coach knows next coach

👉 Same as Linked List

---

## 🔹 8. Node Structure in Java

```java
class Node {
   int data;
   Node next;
}
```

---

## 🔹 9. Create First Node

```java
class Node {
   int data;
   Node next;
}

public class Main {
   public static void main(String[] args) {
       Node head = new Node();
       head.data = 10;
       head.next = null;

       System.out.println(head.data);
   }
}
```

👉 `head` = starting node

---

## 🔹 10. Create Multiple Nodes

```java
Node n1 = new Node();
Node n2 = new Node();
Node n3 = new Node();

n1.data = 10;
n2.data = 20;
n3.data = 30;

n1.next = n2;
n2.next = n3;
n3.next = null;

Node head = n1;
```

Structure:

```
head → 10 → 20 → 30 → null
```

---

## 🔹 11. Traversal of Linked List

```java
Node temp = head;

while(temp != null) {
   System.out.print(temp.data + " ");
   temp = temp.next;
}
```

### Logic

* Start from head
* Move to next node
* Stop at null

---

## 🔹 12. Display Function

```java
static void display(Node head) {
   Node temp = head;

   while(temp != null) {
       System.out.print(temp.data + " ");
       temp = temp.next;
   }
}
```

---

## 🔹 13. Practice Problems

### 1. Create and Print Linked List

```java
// 5 → 10 → 15
```

### 2. Count Nodes

```java
static int count(Node head) {
   int c = 0;
   Node temp = head;
   while(temp != null) {
       c++;
       temp = temp.next;
   }
   return c;
}
```

### 3. Sum of Nodes

```java
static int sum(Node head) {
   int s = 0;
   Node temp = head;
   while(temp != null) {
       s += temp.data;
       temp = temp.next;
   }
   return s;
}
```

### 4. Search Element

```java
static boolean search(Node head, int key) {
   Node temp = head;
   while(temp != null) {
       if(temp.data == key) return true;
       temp = temp.next;
   }
   return false;
}
```

---

## 🔹 14. Insert at Beginning

```java
static Node insertAtBeginning(Node head, int data) {
   Node newNode = new Node();
   newNode.data = data;
   newNode.next = head;
   return newNode;
}
```

Example:

```
Before: 10 → 20 → 30
After : 5 → 10 → 20 → 30
```

---

## 🔹 15. Final Challenge

Given:

```
10 → 20 → 30 → 40 → 50
```

Do:

* Count nodes
* Find sum
* Search element
* Display list

---

# 📌 Java Practice Questions

## 1. Input & Output

```java
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
System.out.println(a + b);
```

## 2. Loop (1 to 10)

```java
for(int i = 1; i <= 10; i++) {
   System.out.print(i + " ");
}
```

## 3. Array Print

```java
int arr[] = {10,20,30,40,50};
for(int i = 0; i < arr.length; i++) {
   System.out.println(arr[i]);
}
```

## 4. Max Function

```java
static int max(int a, int b) {
   return (a > b) ? a : b;
}
```

## 5. Class & Object

```java
class Student {
   String name;
   int age;
}

Student s = new Student();
s.name = "Ravi";
s.age = 20;
```

---

# 📌 Java Basics Checklist

Students must know:

* Program structure
* Variables & data types
* Operators
* Scanner input
* If-else
* Loops
* Arrays
* Methods
* Classes & Objects
* References

---

# 🎯 Key Linked List Concepts

1. Arrays
2. Loops
3. Classes
4. Objects
5. References

---

# 🧠 Concept Questions

* Why Linked List better than array?
* What is NULL?
* What is HEAD?
* What is traversal?
* What happens if next is wrong?

👉 Traversal = Visiting each node

---

# 🚀 Build Linked-List from Start

```java


class Main {

    public static class LinkedList {

        class Node {
            int data;
            Node next;

            Node(int d) {
                data = d;
                next = null;
            }
        }

        Node head;

        // ================= BASIC =================

        boolean isEmpty() {
            return head == null;
        }

        void print() {
            if (head == null) {
                System.out.println("List Empty");
                return;
            }

            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data);
                if (temp.next != null)
                    System.out.print(" -> ");
                temp = temp.next;
            }
            System.out.println();
        }

        int countNodes() {
            int count = 0;
            Node temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        // ================= INSERT =================

        void insertAtFirst(int val) {
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;
            System.out.println(val + " : First pr Insert Ho gya");
        }

        void insertAtLast(int val) {
            Node newNode = new Node(val);

            if (head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null)
                    temp = temp.next;
                temp.next = newNode;
            }
            System.out.println(val + " : Last pr Insert Ho gya");
        }

        void insertAtPosition(int val, int pos) {
            if (pos == 1) {
                insertAtFirst(val);
                return;
            }

            Node temp = head;
            for (int i = 1; i < pos - 1 && temp != null; i++)
                temp = temp.next;

            if (temp == null) {
                System.out.println("Invalid Position");
                return;
            }

            Node newNode = new Node(val);
            newNode.next = temp.next;
            temp.next = newNode;
            System.out.println(val + " : Position " + pos + " pr Insert Ho gya");
        }

        // ================= DELETE =================

        int deleteAtFirst() {
            if (head == null) {
                System.out.println("List Empty");
                return -1;
            }

            int val = head.data;
            head = head.next;
            System.out.println(val + " : First se Delete Ho gya");
            return val;
        }

        int deleteAtLast() {
            if (head == null) {
                System.out.println("List Empty");
                return -1;
            }

            if (head.next == null) {
                int val = head.data;
                head = null;
                System.out.println(val + " : Last se Delete Ho gya");
                return val;
            }

            Node temp = head;
            while (temp.next.next != null)
                temp = temp.next;

            int val = temp.next.data;
            temp.next = null;
            System.out.println(val + " : Last se Delete Ho gya");
            return val;
        }

        int deleteAtPosition(int pos) {
            if (pos == 1)
                return deleteAtFirst();

            Node temp = head;
            for (int i = 1; i < pos - 1 && temp != null; i++)
                temp = temp.next;

            if (temp == null || temp.next == null) {
                System.out.println("Invalid Position");
                return -1;
            }

            int val = temp.next.data;
            temp.next = temp.next.next;
            System.out.println(val + " : Position " + pos + " se Delete Ho gya");
            return val;
        }

        int deleteByValue(int key) {
            if (head == null)
                return -1;

            if (head.data == key)
                return deleteAtFirst();

            Node temp = head;
            while (temp.next != null && temp.next.data != key)
                temp = temp.next;

            if (temp.next == null) {
                System.out.println("Element Not Found");
                return -1;
            }

            int val = temp.next.data;
            temp.next = temp.next.next;
            System.out.println(val + " : Delete Ho gya");
            return val;
        }

        void deleteAfterValue(int key) {
            Node temp = head;
            while (temp != null && temp.data != key)
                temp = temp.next;

            if (temp == null || temp.next == null) {
                System.out.println("Delete Not Possible");
                return;
            }

            System.out.println(temp.next.data + " : Delete After " + key);
            temp.next = temp.next.next;
        }

        void deleteBeforeValue(int key) {
            if (head == null || head.data == key)
                return;

            if (head.next.data == key) {
                deleteAtFirst();
                return;
            }

            Node prev = null;
            Node curr = head;

            while (curr.next != null && curr.next.data != key) {
                prev = curr;
                curr = curr.next;
            }

            if (curr.next == null)
                return;

            prev.next = curr.next;
            System.out.println(curr.data + " : Delete Before " + key);
        }

        void deleteEntireList() {
            head = null;
            System.out.println("Entire List Delete Ho gyi");
        }

        // ================= SEARCH =================

        void search(int key) {
            Node temp = head;
            int pos = 1;

            while (temp != null) {
                if (temp.data == key) {
                    System.out.println(key + " : Found at position " + pos);
                    return;
                }
                temp = temp.next;
                pos++;
            }
            System.out.println(key + " : Not Found");
        }

        // ================= UPDATE =================

        void updateByValue(int oldVal, int newVal) {
            Node temp = head;
            while (temp != null) {
                if (temp.data == oldVal) {
                    temp.data = newVal;
                    System.out.println(oldVal + " Updated to " + newVal);
                    return;
                }
                temp = temp.next;
            }
        }

        void updateAtPosition(int pos, int newVal) {
            Node temp = head;
            for (int i = 1; i < pos && temp != null; i++)
                temp = temp.next;

            if (temp == null)
                return;

            temp.data = newVal;
            System.out.println("Position " + pos + " Updated");
        }

        // ================= ADVANCED =================

        void reverse() {
            Node prev = null, curr = head, next;
            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
            System.out.println("List Reverse Ho gyi");
        }

        void findMiddle() {
            Node slow = head, fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            System.out.println("Middle Element : " + slow.data);
        }

        int nthFromEnd(int n) {
            Node fast = head, slow = head;
            for (int i = 0; i < n; i++)
                fast = fast.next;

            while (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow.data;
        }

        // ================= LOOP =================

        boolean detectLoop() {
            Node slow = head, fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast)
                    return true;
            }
            return false;
        }

        // ================= SORT =================

        void sort() {
            for (Node i = head; i != null; i = i.next) {
                for (Node j = i.next; j != null; j = j.next) {
                    if (i.data > j.data) {
                        int t = i.data;
                        i.data = j.data;
                        j.data = t;
                    }
                }
            }
            System.out.println("List Sort Ho gyi");
        }

        // ================= DUPLICATE =================

        void removeDuplicates() {
            Node curr = head;
            while (curr != null && curr.next != null) {
                if (curr.data == curr.next.data)
                    curr.next = curr.next.next;
                else
                    curr = curr.next;
            }
        }
    }

    // ================= MAIN =================

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.insertAtLast(10);
        ll.insertAtLast(20);
        ll.insertAtLast(30);
        ll.insertAtLast(40);

        ll.print();
        ll.reverse();
        ll.print();
        ll.findMiddle();
        ll.search(20);
    }
}

```


---

# ✅ End of Day 1

You covered:

* Java Basics
* Arrays
* Problem with Arrays
* Linked List Basics
* Traversal
* Basic Problems

👉 Students are ready for Day 2 🚀
