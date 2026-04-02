# 📘 Day 12 - Hashing & Trie (DSA - Java)

## 🔥 Topics Covered

* Hashing Fundamentals
* Collision Handling
* HashMap (Java)
* Problem Solving using Hashing
* Introduction to Trie
* Trie Implementation (Insert, Search, Prefix)

---

# 🧠 PART 1: HASHING

---

## 🔷 What is Hashing?

Hashing is a technique to **store and retrieve data in O(1) time** using a **hash function**.

---

## 🔷 Direct Addressing

### ✅ Idea:

Use key directly as index

```java
int[] arr = new int[100];
arr[23] = 90;
```

### ❌ Problem:

* Memory waste if keys are large

---

## 🔷 Hash Function

### ✅ Definition:

A function that maps large keys to smaller indices

```java
index = key % size;
```

### 🎯 Example:

| Key | Hash (mod 10) |
| --- | ------------- |
| 23  | 3             |
| 33  | 3             |

👉 Leads to **Collision**

---

## 🔷 Collision Handling

---

### 🔗 1. Separate Chaining

* Use LinkedList at each index

```java
import java.util.*;

class ChainingHash {
    LinkedList<Integer>[] table;
    int size;

    ChainingHash(int size) {
        this.size = size;
        table = new LinkedList[size];

        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    void insert(int key) {
        int index = key % size;
        table[index].add(key);
    }

    boolean search(int key) {
        int index = key % size;
        return table[index].contains(key);
    }
}
```

---

### 🚪 2. Open Addressing (Linear Probing)

```java
class LinearProbingHash {
    Integer[] table;
    int size;

    LinearProbingHash(int size) {
        this.size = size;
        table = new Integer[size];
    }

    void insert(int key) {
        int index = key % size;

        while (table[index] != null) {
            index = (index + 1) % size;
        }

        table[index] = key;
    }

    boolean search(int key) {
        int index = key % size;

        while (table[index] != null) {
            if (table[index] == key) return true;
            index = (index + 1) % size;
        }

        return false;
    }
}
```

---

## 🔷 HashMap in Java

```java
import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(1, 10);
        map.put(2, 20);

        System.out.println(map.get(1)); // 10
        System.out.println(map.containsKey(2)); // true

        map.remove(1);
    }
}
```

---

## 🔷 Frequency Count Problem

```java
import java.util.*;

public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map);
    }
}
```

---

## 🔷 Two Sum Problem

```java
import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];

            if (map.containsKey(diff)) {
                System.out.println("Pair: " + diff + ", " + arr[i]);
                return;
            }

            map.put(arr[i], i);
        }
    }
}
```

---

## 🔷 Detect Duplicates

```java
import java.util.*;

public class DetectDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num)) {
                System.out.println("Duplicate found: " + num);
                return;
            }
            set.add(num);
        }

        System.out.println("No duplicates");
    }
}
```

---

# 🌳 PART 2: TRIE (PREFIX TREE)

---

## 🔷 What is Trie?

A Trie is a tree-like data structure used to store strings efficiently.

### ✅ Use Cases:

* Autocomplete
* Dictionary search
* Prefix matching

---

## 🔷 Trie Node Structure

```java
class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isEndOfWord;
}
```

---

## 🔷 Trie Implementation

```java
class Trie {
    TrieNode root;

    Trie() {
        root = new TrieNode();
    }

    // Insert
    void insert(String word) {
        TrieNode node = root;

        for (char ch : word.toCharArray()) {
            int index = ch - 'a';

            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }

            node = node.children[index];
        }

        node.isEndOfWord = true;
    }

    // Search
    boolean search(String word) {
        TrieNode node = root;

        for (char ch : word.toCharArray()) {
            int index = ch - 'a';

            if (node.children[index] == null) {
                return false;
            }

            node = node.children[index];
        }

        return node.isEndOfWord;
    }

    // Prefix Search
    boolean startsWith(String prefix) {
        TrieNode node = root;

        for (char ch : prefix.toCharArray()) {
            int index = ch - 'a';

            if (node.children[index] == null) {
                return false;
            }

            node = node.children[index];
        }

        return true;
    }
}
```

---

## 🔷 Trie Main Method (Testing)

```java
public class TrieDemo {
    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("cat");
        trie.insert("car");

        System.out.println(trie.search("cat")); // true
        System.out.println(trie.search("cap")); // false

        System.out.println(trie.startsWith("ca")); // true
    }
}
```

---

# 🧠 Hashing vs Trie

| Feature       | Hashing     | Trie         |
| ------------- | ----------- | ------------ |
| Search        | O(1) avg    | O(L)         |
| Prefix Search | ❌           | ✅            |
| Memory        | Efficient   | High         |
| Use Case      | Exact match | Prefix-based |

---

# 🎯 Key Takeaways

* Hashing gives **fast lookup (O(1))**
* Collisions must be handled properly
* HashMap is widely used in real problems
* Trie is best for **string prefix problems**
* Choose structure based on problem

---

# 🚀 Practice Suggestions

1. Frequency Count
2. Two Sum
3. Longest Substring Without Repeating Characters
4. Implement Trie (LeetCode)
