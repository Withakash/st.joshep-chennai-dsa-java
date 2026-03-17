# 📌 Linked List Placement Training Cheat Sheet

---

## 🚀 Visual Board Diagrams

### 1. Traversal

```
head → 10 → 20 → 30 → 40 → null
         ↑
        temp → → →
```

### 2. Fast & Slow Pointer

```
head → 1 → 2 → 3 → 4 → 5 → 6
          ↑
        slow (1 step)
               ↑
              fast (2 steps)
```

### 3. Dummy Node

```
dummy → head → 10 → 20 → 30
```

### 4. Reversal

```
Before:
1 → 2 → 3 → 4

After:
4 → 3 → 2 → 1
```

### 5. Merge Two Lists

```
1 → 3 → 5
2 → 4 → 6

Output:
1 → 2 → 3 → 4 → 5 → 6
```

---

## ⚡ Super Trick Sheet (Must Remember)

### 🔹 Fast & Slow Pointer

* slow → 1 step
* fast → 2 steps
* Use for:

  * Middle node
  * Cycle detection

### 🔹 Dummy Node Trick

* Avoid edge case when head changes
* Always do:

```
ListNode dummy = new ListNode(0);
dummy.next = head;
```

### 🔹 Two Pointer Gap

* Move fast `n` steps first
* Then move both
* Used in: Remove Nth Node

### 🔹 3 Pointer Reversal

```
prev → curr → next
```

---

## 📚 7 Important LeetCode Problems (Learning Order)

---

### 1️⃣ Remove Linked List Elements

**Concept:** Traversal + Dummy Node

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

### 2️⃣ Reverse Linked List

**Concept:** 3 Pointer Reversal

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

### 3️⃣ Middle of Linked List

**Concept:** Fast & Slow Pointer

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

### 4️⃣ Linked List Cycle

**Concept:** Floyd’s Algorithm

```java
class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) return true;
        }
        return false;
    }
}
```

---

### 5️⃣ Merge Two Sorted Lists

**Concept:** Two Pointer Merge

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

### 6️⃣ Remove Nth Node From End

**Concept:** Two Pointer Gap + Dummy

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

### 7️⃣ Add Two Numbers

**Concept:** Linked List + Carry

```java
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int sum = carry;

            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }

        return dummy.next;
    }
}
```

---

## 🧠 Final Pattern Summary

```
1. Traversal
2. Fast & Slow Pointer
3. Dummy Node
4. Reversal (3 pointers)
5. Merge Lists
```

---

## 🎯 Bonus Challenge (Placement Level)

### Reverse Nodes in k-Group

👉 Combines:

* Reversal
* Pointer manipulation
* Group processing

---

## 💡 Pro Tip for Students

If you can identify the pattern → problem becomes EASY.

> Pattern recognition = Placement success 🚀
