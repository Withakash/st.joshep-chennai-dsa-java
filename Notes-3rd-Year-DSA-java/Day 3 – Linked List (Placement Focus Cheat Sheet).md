# 📘 Day 3 – Linked List (Placement Focus Cheat Sheet)

---

## 🔹 1. Check if Linked List is Sorted

**Idea:** Compare current with next

```java
boolean isSorted(ListNode head) {
    while (head != null && head.next != null) {
        if (head.val > head.next.val) return false;
        head = head.next;
    }
    return true;
}
```

---

## 🔹 2. Remove Duplicates (LeetCode 83)

```java
ListNode deleteDuplicates(ListNode head) {
    ListNode curr = head;
    while (curr != null && curr.next != null) {
        if (curr.val == curr.next.val)
            curr.next = curr.next.next;
        else
            curr = curr.next;
    }
    return head;
}
```

---

## 🔹 3. Remove Duplicates II (LeetCode 82)

```java
ListNode deleteDuplicates(ListNode head) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode prev = dummy;

    while (head != null) {
        if (head.next != null && head.val == head.next.val) {
            while (head.next != null && head.val == head.next.val)
                head = head.next;
            prev.next = head.next;
        } else {
            prev = prev.next;
        }
        head = head.next;
    }
    return dummy.next;
}
```

---

## 🔹 4. Reverse Linked List (LeetCode 206)

```java
ListNode reverseList(ListNode head) {
    ListNode prev = null, curr = head;

    while (curr != null) {
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    return prev;
}
```

---

## 🔹 5. Reverse Linked List II (LeetCode 92)

```java
ListNode reverseBetween(ListNode head, int left, int right) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode prev = dummy;

    for (int i = 1; i < left; i++)
        prev = prev.next;

    ListNode curr = prev.next;

    for (int i = 0; i < right - left; i++) {
        ListNode next = curr.next;
        curr.next = next.next;
        next.next = prev.next;
        prev.next = next;
    }
    return dummy.next;
}
```

---

## 🔹 6. Swap Nodes in Pairs (LeetCode 24)

```java
ListNode swapPairs(ListNode head) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode curr = dummy;

    while (curr.next != null && curr.next.next != null) {
        ListNode first = curr.next;
        ListNode second = curr.next.next;

        first.next = second.next;
        second.next = first;
        curr.next = second;

        curr = first;
    }
    return dummy.next;
}
```



---

## 🔹 8. Merge Two Sorted Lists (LeetCode 21)

```java
ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(0);
    ListNode curr = dummy;

    while (l1 != null && l2 != null) {
        if (l1.val < l2.val) {
            curr.next = l1;
            l1 = l1.next;
        } else {
            curr.next = l2;
            l2 = l2.next;
        }
        curr = curr.next;
    }
    curr.next = (l1 != null) ? l1 : l2;
    return dummy.next;
}
```

---

## 🔥 10. Linked List Cycle (LeetCode 141)

```java
boolean hasCycle(ListNode head) {
    ListNode slow = head, fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) return true;
    }
    return false;
}
```

---

## 🔥 11. Linked List Cycle II (LeetCode 142)

```java
ListNode detectCycle(ListNode head) {
    ListNode slow = head, fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;

        if (slow == fast) {
            slow = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
    }
    return null;
}
```

---

## 🔥 12. Remove Nth Node From End (LeetCode 19)

```java
ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;

    ListNode fast = dummy, slow = dummy;

    for (int i = 0; i <= n; i++)
        fast = fast.next;

    while (fast != null) {
        fast = fast.next;
        slow = slow.next;
    }

    slow.next = slow.next.next;
    return dummy.next;
}
```

---

## 🔥 13. Palindrome Linked List (LeetCode 234)

```java
boolean isPalindrome(ListNode head) {
    ListNode slow = head, fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    ListNode prev = null;
    while (slow != null) {
        ListNode next = slow.next;
        slow.next = prev;
        prev = slow;
        slow = next;
    }

    while (prev != null) {
        if (head.val != prev.val) return false;
        head = head.next;
        prev = prev.next;
    }
    return true;
}
```

---

## 🔥 14. Intersection of Two Lists (LeetCode 160)

```java
ListNode getIntersectionNode(ListNode a, ListNode b) {
    ListNode p1 = a, p2 = b;

    while (p1 != p2) {
        p1 = (p1 == null) ? b : p1.next;
        p2 = (p2 == null) ? a : p2.next;
    }
    return p1;
}
```

---

## 🔥 15. Add Two Numbers (LeetCode 2)

```java
ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(0), curr = dummy;
    int carry = 0;

    while (l1 != null || l2 != null || carry != 0) {
        int sum = carry;

        if (l1 != null) { sum += l1.val; l1 = l1.next; }
        if (l2 != null) { sum += l2.val; l2 = l2.next; }

        carry = sum / 10;
        curr.next = new ListNode(sum % 10);
        curr = curr.next;
    }
    return dummy.next;
}
```

---

# 🧠 Key Patterns to Remember

* 🔁 Reverse → 3 pointers
* 🐢🐇 Slow/Fast → cycle, middle, palindrome
* 🔗 Dummy node → handle edge cases
* 🔀 Merge → 2 pointers / heap

---

# 🚀 Final Tip

👉 Focus on **patterns, not memorizing code**

If you understand these patterns → you can solve **80% of Linked List interview problems** 🔥

---

# ✅ End of Day 3

Students are now:

* Placement ready for Linked List
* Strong in patterns & problem solving

👉 Ready for next topic 🚀
