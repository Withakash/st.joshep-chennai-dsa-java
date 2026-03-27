# 📘 Day 8 – Binary Tree Traversals & Basics (Placement Training)

---

## 🎯 Goal

* Understand DFS & BFS traversals
* Learn recursive and iterative approaches
* Solve basic tree problems

---

## 🌳 Binary Tree Node Structure

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

## 🌳 Sample Tree

```
        1
       / \
      2   3
     / \
    4   5
```

---

# 🔹 Part 48 – Preorder Traversal (Recursive)

**Order:** Root → Left → Right

```java
void preorder(Node root) {
    if (root == null) return;

    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
}
```

---

# 🔹 Part 49 – Inorder Traversal (Recursive)

**Order:** Left → Root → Right

```java
void inorder(Node root) {
    if (root == null) return;

    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
}
```

---

# 🔹 Part 50 – Postorder Traversal (Recursive)

**Order:** Left → Right → Root

```java
void postorder(Node root) {
    if (root == null) return;

    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data + " ");
}
```

---

# 🔹 Part 51 – Level Order Traversal (BFS)

```java
import java.util.*;

void levelOrder(Node root) {
    if (root == null) return;

    Queue<Node> q = new LinkedList<>();
    q.add(root);

    while (!q.isEmpty()) {
        Node curr = q.poll();
        System.out.print(curr.data + " ");

        if (curr.left != null) q.add(curr.left);
        if (curr.right != null) q.add(curr.right);
    }
}
```

---

# 🔹 Part 52 – Level Order Traversal Line by Line

````java
void levelOrderLineByLine(Node root) {
    if (root == null) return;

    Queue<Node> q = new LinkedList<>();
    q.add(root);

    while (!q.isEmpty()) {
        int size = q.size();

        for (int i = 0; i < size; i++) {
            Node curr = q.poll();
            System.out.print(curr.data + " ");

            if (curr.left != null) q.add(curr.left);
            if (curr.right != null) q.add(curr.right);
        }
        System.out.println();
    }
}

---

# 🔹 Part 53 – Iterative Preorder

```java
void iterativePreorder(Node root) {
    if (root == null) return;

    Stack<Node> st = new Stack<>();
    st.push(root);

    while (!st.isEmpty()) {
        Node curr = st.pop();
        System.out.print(curr.data + " ");

        if (curr.right != null) st.push(curr.right);
        if (curr.left != null) st.push(curr.left);
    }
}
````

---

# 🔹 Part 54 – Iterative Inorder

```java
void iterativeInorder(Node root) {
    Stack<Node> st = new Stack<>();
    Node curr = root;

    while (curr != null || !st.isEmpty()) {
        while (curr != null) {
            st.push(curr);
            curr = curr.left;
        }

        curr = st.pop();
        System.out.print(curr.data + " ");

        curr = curr.right;
    }
}
```

---

# 🔹 Part 55 – Iterative Postorder (2 Stack)

```java
void iterativePostorder(Node root) {
    if (root == null) return;

    Stack<Node> st1 = new Stack<>();
    Stack<Node> st2 = new Stack<>();

    st1.push(root);

    while (!st1.isEmpty()) {
        Node curr = st1.pop();
        st2.push(curr);

        if (curr.left != null) st1.push(curr.left);
        if (curr.right != null) st1.push(curr.right);
    }

    while (!st2.isEmpty()) {
        System.out.print(st2.pop().data + " ");
    }
}
```

---

# 🔹 Part 56 – Height of Binary Tree

```java
int height(Node root) {
    if (root == null) return 0;

    return 1 + Math.max(height(root.left), height(root.right));
}
```

---

# 🔹 Part 57 – Count Nodes

```java
int countNodes(Node root) {
    if (root == null) return 0;

    return 1 + countNodes(root.left) + countNodes(root.right);
}
```

---

# 🔹 Part 58 – Count Leaf Nodes

```java
int countLeaf(Node root) {
    if (root == null) return 0;

    if (root.left == null && root.right == null)
        return 1;

    return countLeaf(root.left) + countLeaf(root.right);
}
```

---

# 🚀 Summary

* Preorder = Root Left Right
* Inorder = Left Root Right
* Postorder = Left Right Root
* BFS = Level Order
* Iterative = Stack based
* Height = Depth of tree
* Leaf = Node with no children

---

# 🧠 Practice Questions

## 🔹 Easy Level

* 144. Binary Tree Preorder Traversal
* 94. Binary Tree Inorder Traversal
* 145. Binary Tree Postorder Traversal
* 102. Binary Tree Level Order Traversal
* 104. Maximum Depth of Binary Tree
* 100. Same Tree
* 101. Symmetric Tree

---

## 🔹 Medium Level

* 103. Binary Tree Zigzag Level Order Traversal
* 199. Binary Tree Right Side View
* 236. Lowest Common Ancestor of a Binary Tree
* 662. Maximum Width of Binary Tree
* 113. Path Sum II
* 129. Sum Root to Leaf Numbers
* 114. Flatten Binary Tree to Linked List

---

## 🔹 Hard Level (Optional for Placement)

* 124. Binary Tree Maximum Path Sum
* 297. Serialize and Deserialize Binary Tree
* 968. Binary Tree Cameras

---

# 🚀 Summary

* Preorder = Root Left Right
* Inorder = Left Root Right
* Postorder = Left Right Root
* BFS = Level Order
* Iterative = Stack based
* Height = Depth of tree
* Leaf = Node with no children

---

# 💡 Assignment for Students

1. Solve all Easy problems
2. Pick at least 3 Medium problems
3. Try 1 Hard problem (optional)
4. Write both recursive & iterative solutions wherever possible
