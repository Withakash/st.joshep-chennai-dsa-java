# 📘 Day 9 – Binary Tree 


# 🔵 1. Introduction to Trees 

## 🎯 Goal

Understand why trees are needed

### Problems with existing DS

* Array → No hierarchy
* Linked List → Linear only

### Tree Use Cases

* File System
* Organization hierarchy

### Diagram

```
        1
       / \
      2   3
     / \
    4   5
```

---

# 🔵 2. Tree Terminology (45 min)

### Terms

* Root → 1
* Leaf → 4,5,3
* Parent/Child
* Height
* Depth

### Height Code

```java
int height(Node root) {
    if (root == null) return 0;
    return 1 + Math.max(height(root.left), height(root.right));
}
```

---

# 🔵 3. Types of Trees (1.5 hr)

## Binary Tree

Max 2 children

## Full Binary Tree

0 or 2 children

## Complete Binary Tree

All levels filled except last
Last level filled left to right

## Perfect Binary Tree

All nodes filled
Nodes = 2^h - 1

## Balanced Tree

Height difference ≤ 1

---

# 🔵 4. Array Representation (1 hr – In Depth)

## 🎯 Concept

Store tree in level order

### Example

```
        10
       /  \
     20    30
    / \    /
  40  50  60
```

### Array

```
Index:  0   1   2   3   4   5
Value: 10  20  30  40  50  60
```

---

## 📌 Formulas (0-Based Index)

* Left = 2*i + 1
* Right = 2*i + 2
* Parent = (i - 1) / 2

---

## 📌 1-Based Index (Important)

* Left = 2*i
* Right = 2*i + 1
* Parent = i/2

---

## 📌 Why Formula Works

* Each node has 2 children
* Levels double → 2^L nodes

---

## 📌 Height using Array

```
Height = floor(log2(n))
```

---

## 📌 Leaf Nodes

```
Indices from n/2 to n-1
```

---

## 📌 Invalid Case (Gap)

```
Index: 0 1 2 3 4 5
Value: 10 20 30 X 50 60
```

Not complete

---

## 📌 Skewed Tree Problem

```
    10
      \
       20
         \
          30
```

Wastes space

---

## 📌 Traversal using Array

```java
void preorder(int[] tree, int i, int n) {
    if (i >= n || tree[i] == 0) return;

    System.out.print(tree[i] + " ");
    preorder(tree, 2*i + 1, n);
    preorder(tree, 2*i + 2, n);
}
```

---

## 📌 Connection to Heap

* Heap uses array representation
* No pointers needed

---

# 🔵 5. Linked List Representation (20 min)

```java
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
```

---

# 🔵 6. Creating Binary Tree (1.5 hr)

## Level Order Insert

```java
class BinaryTree {
    Node root = null;

    static class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = right = null;
        }
    }

    Node insert(int val) {
        Node new_node = new Node(val);

        if (root == null) {
            root = new_node;
            return root;
        }

        java.util.Queue<Node> q = new java.util.LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node curr = q.poll();

            if (curr.left == null) {
                curr.left = new_node;
                break;
            } else q.add(curr.left);

            if (curr.right == null) {
                curr.right = new_node;
                break;
            } else q.add(curr.right);
        }

        return root;
    }
}
```

---

## Recursive Creation

```java
class BinaryTree {
    int i = 0;

    static class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = right = null;
        }
    }

    Node build(int[] arr) {
        if (i >= arr.length || arr[i] == -1) {
            i++;
            return null;
        }

        Node root = new Node(arr[i++]);
        root.left = build(arr);
        root.right = build(arr);

        return root;
    }
}
```

---

# 🔵 7. Traversals (1 hr)

## Preorder

```java
void preorder(Node root) {
    if (root == null) return;
    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
}
```

## Inorder

```java
void inorder(Node root) {
    if (root == null) return;
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
}
```

## Postorder

```java
void postorder(Node root) {
    if (root == null) return;
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data + " ");
}
```

---
