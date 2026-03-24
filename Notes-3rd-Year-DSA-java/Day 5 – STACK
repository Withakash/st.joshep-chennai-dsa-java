# 📘 Day 5 – STACK (Complete Notes + Code + Teaching Guide)

---

# 🧠 1. Introduction to Stack

## 🔹 Definition

Stack is a linear data structure that follows:

👉 **LIFO (Last In First Out)**

## 🔹 Real Life Examples

* Plates stacking
* Undo/Redo
* Browser history

---

## 🔹 Basic Operations

| Operation | Description     |
| --------- | --------------- |
| push()    | Insert element  |
| pop()     | Remove element  |
| peek()    | Get top element |
| isEmpty() | Check empty     |

---

# 💻 2. Stack using Array

```java
class StackArray {
    int top;
    int size;
    int[] arr;

    StackArray(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    void push(int x) {
        if (top == size - 1) {
            System.out.println("Overflow");
            return;
        }
        arr[++top] = x;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Underflow");
            return -1;
        }
        return arr[top--];
    }

    int peek() {
        if (top == -1) return -1;
        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }
}
```

---

# 💻 3. Stack using Linked List

```java
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class StackLL {
    Node top;

    void push(int x) {
        Node temp = new Node(x);
        temp.next = top;
        top = temp;
    }

    int pop() {
        if (top == null) return -1;
        int val = top.data;
        top = top.next;
        return val;
    }

    int peek() {
        if (top == null) return -1;
        return top.data;
    }

    boolean isEmpty() {
        return top == null;
    }
}
```

---

# 🔍 4. Parenthesis Matching

## 🔹 Concept

* Push opening brackets
* Match on closing

```java
import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.isEmpty()) return false;

                char top = st.pop();

                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
```

---

# 🧠 5. Expression Types

| Type    | Example |
| ------- | ------- |
| Infix   | A + B   |
| Postfix | AB+     |
| Prefix  | +AB     |

---

# 🔥 6. Infix to Postfix Conversion

## 🔹 Rules

1. Operand → Output
2. '(' → Push
3. ')' → Pop till '('
4. Operator → Check precedence
5. End → Pop all

---

## 🔹 Code

```java
import java.util.*;

class Solution {

    public String infixToPostfix(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {

            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }

            else if (c == '(') {
                st.push(c);
            }

            else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    result.append(st.pop());
                }
                st.pop();
            }

            else {
                while (!st.isEmpty() &&
                      (prec(c) < prec(st.peek()) ||
                      (prec(c) == prec(st.peek()) && c != '^'))) {
                    result.append(st.pop());
                }
                st.push(c);
            }
        }

        while (!st.isEmpty()) {
            result.append(st.pop());
        }

        return result.toString();
    }

    int prec(char c) {
        if (c == '+' || c == '-') return 1;
        if (c == '*' || c == '/') return 2;
        if (c == '^') return 3;
        return -1;
    }
}
```

---

# 🔥 7. Postfix Evaluation

```java
import java.util.*;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (String token : tokens) {

            if (token.equals("+") || token.equals("-") ||
                token.equals("*") || token.equals("/")) {

                int a = st.pop();
                int b = st.pop();

                if (token.equals("+")) st.push(b + a);
                else if (token.equals("-")) st.push(b - a);
                else if (token.equals("*")) st.push(b * a);
                else st.push(b / a);
            }
            else {
                st.push(Integer.parseInt(token));
            }
        }

        return st.pop();
    }
}
```

---

# 🔥 8. Min Stack (LeetCode 155)

```java
import java.util.*;

class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int val) {
        stack.push(val);

        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (stack.pop().equals(minStack.peek())) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
```

---

# 🔥 9. Next Greater Element

```java
import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) res[i] = -1;
            else res[i] = st.peek();

            st.push(arr[i]);
        }

        return res;
    }
}
```

---

# 🎯 10. Key Concepts Summary

* Stack → LIFO
* Parenthesis → Matching top
* Infix → Postfix → Precedence
* Postfix → Evaluation using stack
* MinStack → Extra stack
* NGE → Monotonic stack

---

# 🧑‍🏫 Teaching Flow (Important)

1. Start with real-life examples
2. Draw stack diagrams
3. Dry run code
4. Give problems immediately

---

# 🧪 Practice Problems

* 20. Valid Parentheses
* 155. Min Stack
* 150. Evaluate Reverse Polish Notation
* 496. Next Greater Element I
* 739. Daily Temperatures
* 84. Largest Rectangle in Histogram

---

# 💯 Final Outcome

After Day 5:

✅ Strong in stack basics
✅ Can solve expression problems
✅ Ready for interview questions

---
