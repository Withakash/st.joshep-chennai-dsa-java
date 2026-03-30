# 📘 Day 9 - Binary Search Tree (DSA - Java) – In-Depth Notes

---

## 🌳 Binary Search Tree (BST) – Core Concept

A **Binary Search Tree (BST)** is a special type of binary tree where:

* Left subtree → values **less than root**
* Right subtree → values **greater than root**
* Maintains **sorted order via inorder traversal**

---

## 🧱 Node Structure

```java
static class Node {
    int val;
    Node left, right;

    Node(int v) {
        val = v;
        left = right = null;
    }
}
```

---

## 🔁 Inorder Traversal

### 🧠 Concept:

* Traversal order → **Left → Root → Right**
* In BST → gives **sorted order**

---

### 💻 Code

```java
List<Integer> in = new ArrayList<>();

List<Integer> inorder(Node root){
    if(root == null) return in;

    inorder(root.left);
    in.add(root.val);
    inorder(root.right);

    return in;
}
```

---

### ⚠️ Important Design Note

* Using a **global list (`in`)** requires clearing before reuse

```java
in.clear();
```

---

## ⏱ Complexity

| Type  | Complexity |
| ----- | ---------- |
| Time  | O(n)       |
| Space | O(n)       |

---

## ✅ Validate BST using List (Inorder Approach)

### 🧠 Key Idea

Inorder traversal of a BST should be **strictly increasing**.

---

### 🪜 Steps

1. Perform inorder traversal
2. Store values in list
3. Check if sorted

---

### 💻 Code

```java
boolean isValid(Node root){
    in.clear();
    inorder(root);

    for(int i = 1; i < in.size(); i++){
        if(in.get(i) <= in.get(i-1))
            return false;
    }

    return true;
}
```

---

## 🔍 Example

### Valid BST

```
        10
       /  \
      5    12
     / \
    2   7
```

Inorder: `[2, 5, 7, 10, 12]` ✅

---

### Invalid BST

```
    10
   /  \
  5    8
```

Inorder: `[5, 10, 8]` ❌

---

## 🌱 BST Insertion (Iterative)

### 🧠 Logic

1. Start from root
2. Move left/right
3. Insert at null

---

### 💻 Code

```java
void insert(int v) {
    Node new_node = new Node(v);

    if(root == null) {
        root = new_node;
        return;
    }

    Node curr = root;
    while(curr != null){
        if(v < curr.val && curr.left != null){
            curr = curr.left;
        }
        else if(v > curr.val && curr.right != null){
            curr = curr.right;
        }
        else break;
    }

    if(v < curr.val) curr.left = new_node;
    else curr.right = new_node;
}
```

---

## 🔍 Dry Run

Insert: `10, 5, 2, 7, 12`

Tree:

```
        10
       /  \
      5    12
     / \
    2   7
```

---

## 🔁 Execution

```java
BinarySearchTree bst = new BinarySearchTree();

bst.insert(10);
bst.insert(5);
bst.insert(2);
bst.insert(7);
bst.insert(12);

System.out.println(bst.inorder(bst.root));
System.out.println(bst.isValid(bst.root));
```

---

## ⚠️ Common Mistakes

| Mistake                   | Issue                 |
| ------------------------- | --------------------- |
| Not clearing list         | Duplicate values      |
| Global list usage         | Poor design           |
| Using `<` instead of `<=` | Allows duplicates     |
| Ignoring inorder logic    | Core misunderstanding |

---

## 🧠 Interview Insights

Ways to validate BST:

1. Inorder + List
2. Min/Max Range
3. Inorder with prev pointer

---

## 🎯 Summary

* BST → Ordered tree
* Inorder → Sorted sequence
* Validation → Check increasing order

---

## 📌 Practice

* LeetCode 98
* LeetCode 700
* LeetCode 701

---

🔥 End of Day 9 Notes
