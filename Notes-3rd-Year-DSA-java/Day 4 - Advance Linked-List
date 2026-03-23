# 📘 Linked List Day 4 – Complete Codes

This file contains all Java implementations for:

* Circular Linked List (CLL)
* Doubly Linked List (DLL)
* Circular Doubly Linked List (CDLL)
* Important Interview Functions
* Sparse Matrix (LL)
* Polynomial (LL)

---

# 🔵 Circular Linked List (CLL)

```java
class CircularLinkedList {

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    Node head = null;

    void insertAtStart(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            newNode.next = newNode;
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
        head = newNode;
    }

    void insertAtEnd(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            newNode.next = newNode;
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    void deleteHead() {
        if (head == null) return;

        if (head.next == head) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = head.next;
        head = head.next;
    }

    void deleteLast() {
        if (head == null || head.next == head) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != head) {
            temp = temp.next;
        }

        temp.next = head;
    }

    void deleteValue(int key) {
        if (head == null) return;

        if (head.val == key) {
            deleteHead();
            return;
        }

        Node curr = head;
        while (curr.next != head) {
            if (curr.next.val == key) {
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }
    }

    void display() {
        if (head == null) return;

        Node temp = head;
        do {
            System.out.print(temp.val + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }
}
```

---

# 🟣 Doubly Linked List (DLL)

```java
class DoublyLinkedList {

    static class Node {
        int val;
        Node prev, next;

        Node(int val) {
            this.val = val;
        }
    }

    Node head = null;

    void insertAtStart(int val) {
        Node newNode = new Node(val);

        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }

        head = newNode;
    }

    void insertAtEnd(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    void deleteHead() {
        if (head == null) return;

        head = head.next;

        if (head != null)
            head.prev = null;
    }

    void deleteTail() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.prev.next = null;
    }

    void deleteValue(int key) {
        Node temp = head;

        while (temp != null) {
            if (temp.val == key) {

                if (temp.prev != null)
                    temp.prev.next = temp.next;
                else
                    head = temp.next;

                if (temp.next != null)
                    temp.next.prev = temp.prev;

                return;
            }
            temp = temp.next;
        }
    }

    void reverse() {
        Node curr = head;
        Node temp = null;

        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }

        if (temp != null)
            head = temp.prev;
    }

    void displayForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
```

---

# 🔴 Circular Doubly Linked List (CDLL)

```java
class CircularDoublyLL {

    static class Node {
        int val;
        Node prev, next;

        Node(int val) {
            this.val = val;
        }
    }

    Node head = null;

    void insert(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            newNode.next = newNode;
            newNode.prev = newNode;
            head = newNode;
            return;
        }

        Node last = head.prev;

        last.next = newNode;
        newNode.prev = last;

        newNode.next = head;
        head.prev = newNode;
    }

    void display() {
        if (head == null) return;

        Node temp = head;
        do {
            System.out.print(temp.val + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }
}
```

---

# 🟡 Find Middle (Slow/Fast)

```java
ListNode findMiddle(ListNode head) {
    ListNode slow = head, fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}
```

---

# 🟡 Intersection of Two Linked Lists

```java
ListNode getIntersection(ListNode a, ListNode b) {
    ListNode p1 = a, p2 = b;

    while (p1 != p2) {
        p1 = (p1 == null) ? b : p1.next;
        p2 = (p2 == null) ? a : p2.next;
    }
    return p1;
}
```

---

# 🟢 Sparse Matrix using Linked List

```java
public class SparseMetrix {
    Node head = null;

    static class Node{
        int r,c,val;
        Node next;

        Node(int row, int col,int val)  {
               r = row;
               c = col;
               this.val = val;
               next = null;

               System.out.println("C is Created with Value : " + val + " at indexs Row & Col :" + r + " " + c );
        }
    }

    void insert(int r, int c,int val){
        Node new_node = new Node(r,c,val);

        if(head == null) {
           head = new_node;
           return; 
        }

        new_node.next = head;
        head = new_node;
    }

    void display(){
        Node curr = head;

        while(curr != null) {
            System.out.print(" value : " + curr.val + " index : "+curr.r+curr.c);

            curr = curr.next;
        }


    }


    public static void main(String[] str) {
        SparseMetrix sm = new SparseMetrix();
        sm.insert(1,2,55);
        sm.insert(2,1,55);
        sm.insert(3,1,75);

        sm.display();
    }
}

```

---

# 🟠 Polynomial using Linked List

```java
public class Polynomial {
    Node head = null;

    static class Node{
        int coeff;
        int power;
        Node next;

        Node(int c , int p) {
            coeff = c;
            power = p;
            next = null;
            System.out.println(coeff+"a^"+power + " : is Createed");
        }
    }

    void display(){
        Node curr = head;

        while(curr != null){
            System.out.print(curr.coeff+"a^"+curr.power +" + ");
            curr = curr.next;
        }
    }

    public static void main(String[]args){
        Polynomial poly = new Polynomial();
        poly.head = new Node(1,2);
        poly.head.next = new Node(2,1);
        poly.head.next.next = new Node(2,0);
        poly.display();
    }
}

```

---

# 🎯 End of Day 4 Codes

👉 Use this file for:

* Teaching reference
* Student notes
* Quick revision
