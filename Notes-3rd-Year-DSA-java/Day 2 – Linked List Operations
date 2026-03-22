# 📘 Day 2 – Linked List Operations & Interview Preparation

---

## 🔹 Quick Revision (5–7 mins)

Diagram:

```
head → 10 → 20 → 30 → 40 → null
```

Questions:

* What is head?
* What is Node?
* What does next store?

```java
class Node {
   int data;
   Node next;
}
```

👉 Focus: Operations + Interview Problems

---

# 🔹 PART 1 — Traversal Based Problems

## Count Nodes

```java
static int count(Node head){
   int count = 0;
   Node temp = head;

   while(temp != null){
       count++;
       temp = temp.next;
   }
   return count;
}
```

## Sum of Nodes

```java
static int sum(Node head){
   int sum = 0;
   Node temp = head;

   while(temp != null){
       sum += temp.data;
       temp = temp.next;
   }
   return sum;
}
```

---

# 🔹 PART 2 — Max & Search

## Maximum Element

```java
static int max(Node head){
   int max = Integer.MIN_VALUE;
   Node temp = head;

   while(temp != null){
       if(temp.data > max)
           max = temp.data;
       temp = temp.next;
   }
   return max;
}
```

## Search Element

```java
static boolean search(Node head, int key){
   Node temp = head;

   while(temp != null){
       if(temp.data == key)
           return true;
       temp = temp.next;
   }
   return false;
}
```

⏱ Time Complexity: O(n)

---

# 🔹 PART 3 — Insert Operations

## Insert at Beginning

```java
Node insertAtStart(Node head, int val){
   Node newNode = new Node(val);
   newNode.next = head;
   return newNode;
}
```

## Insert at End

```java
Node insertAtEnd(Node head, int val){
   Node newNode = new Node(val);

   if(head == null)
       return newNode;

   Node temp = head;
   while(temp.next != null)
       temp = temp.next;

   temp.next = newNode;
   return head;
}
```

## Insert at Position

```java
Node insertAtPos(Node head, int pos, int val){
   Node newNode = new Node(val);

   if(pos == 0){
       newNode.next = head;
       return newNode;
   }

   Node temp = head;
   for(int i = 0; i < pos - 1; i++)
       temp = temp.next;

   newNode.next = temp.next;
   temp.next = newNode;

   return head;
}
```

---

# 🔹 PART 4 — Delete Operations

## Delete by Value

```java
Node delete(Node head, int key){
   if(head == null) return null;

   if(head.data == key)
       return head.next;

   Node temp = head;

   while(temp.next != null){
       if(temp.next.data == key){
           temp.next = temp.next.next;
           break;
       }
       temp = temp.next;
   }

   return head;
}
```

---

# 🚀 INTERVIEW PROBLEMS (WITH LEETCODE NUMBERS)

---

## 🔹 LeetCode 203 — Remove Linked List Elements

```java
class Solution {
   public ListNode removeElements(ListNode head, int val) {
       ListNode dummy = new ListNode(0);
       dummy.next = head;
       ListNode curr = dummy;

       while(curr.next != null){
           if(curr.next.val == val)
               curr.next = curr.next.next;
           else
               curr = curr.next;
       }
       return dummy.next;
   }
}
```

---

## 🔹 LeetCode 206 — Reverse Linked List

```java
class Solution {
   public ListNode reverseList(ListNode head) {
       ListNode prev = null;
       ListNode curr = head;

       while(curr != null){
           ListNode next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next;
       }
       return prev;
   }
}
```

---

## 🔹 LeetCode 876 — Middle of Linked List

```java
class Solution {
   public ListNode middleNode(ListNode head) {
       ListNode slow = head;
       ListNode fast = head;

       while(fast != null && fast.next != null){
           slow = slow.next;
           fast = fast.next.next;
       }
       return slow;
   }
}
```

---

## 🔹 LeetCode 141 — Linked List Cycle

```java
class Solution {
   public boolean hasCycle(ListNode head) {
       ListNode slow = head;
       ListNode fast = head;

       while(fast != null && fast.next != null){
           slow = slow.next;
           fast = fast.next.next;

           if(slow == fast)
               return true;
       }
       return false;
   }
}
```

---

## 🔹 LeetCode 21 — Merge Two Sorted Lists

```java
class Solution {
   public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       ListNode dummy = new ListNode(0);
       ListNode curr = dummy;

       while(list1 != null && list2 != null){
           if(list1.val < list2.val){
               curr.next = list1;
               list1 = list1.next;
           } else {
               curr.next = list2;
               list2 = list2.next;
           }
           curr = curr.next;
       }

       if(list1 != null) curr.next = list1;
       if(list2 != null) curr.next = list2;

       return dummy.next;
   }
}
```

---

## 🔹 LeetCode 19 — Remove Nth Node From End

```java
class Solution {
   public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode dummy = new ListNode(0);
       dummy.next = head;

       ListNode fast = dummy;
       ListNode slow = dummy;

       for(int i = 0; i <= n; i++)
           fast = fast.next;

       while(fast != null){
           fast = fast.next;
           slow = slow.next;
       }

       slow.next = slow.next.next;
       return dummy.next;
   }
}
```

---

---

## 🔹 LeetCode 160 — Intersection of Two Linked Lists

```java
class Solution {
   public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       ListNode a = headA;
       ListNode b = headB;

       while(a != b){
           a = (a == null) ? headB : a.next;
           b = (b == null) ? headA : b.next;
       }
       return a;
   }
}
```

---

## 🔹 LeetCode 707 — Design Linked List

Operations:

* get(index)
* addAtHead()
* addAtTail()
* addAtIndex()
* deleteAtIndex()

(Full implementation done in class)

---

# 🎯 Practice Levels

## Easy

* Count nodes
* Sum
* Max
* Search

## Medium

* Reverse
* Middle
* Insert at position

## Advanced

* Cycle detection
* Merge lists
* Remove nth node
* Add two numbers

---

# 🧠 Key Patterns

* Traversal
* Dummy node
* Two pointers
* Pointer manipulation
* Linked list design

---

# 🚀 Teaching Order (Placement Focused)

1. Remove elements (203)
2. Reverse (206)
3. Middle (876)
4. Cycle (141)
5. Merge (21)
6. Remove nth (19)

---

# ✅ End of Day 2

Students now understand:

* All core Linked List operations
* Interview patterns
* LeetCode problem solving

👉 Ready for advanced problems 🚀
