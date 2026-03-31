# Day 10 - Graph + BFS + DFS (Complete Notes in Java)

---

# 🔷 Part 68 — Introduction to Graph

## ✅ Definition

A **Graph** is:

* A set of **Vertices (nodes)**
* A set of **Edges (connections)**

---

## 📊 Example

```
A —— B
|    |
C —— D
```

---

## 💡 Key Idea

* Graph = general structure
* Tree = special graph (no cycles)

---

## 🎯 Real-Life Examples

* Google Maps → cities & roads
* Social media → users & connections

---

# 🔷 Part 69 — Graph Terminology

| Term      | Meaning             |
| --------- | ------------------- |
| Vertex    | Node                |
| Edge      | Connection          |
| Degree    | No. of connections  |
| Path      | Sequence of nodes   |
| Cycle     | Path that loops     |
| Connected | All nodes reachable |

---

# 🔷 Part 70 — Directed vs Undirected

## Undirected

```
A — B
```

## Directed

```
A → B
```

| Feature  | Undirected | Directed |
| -------- | ---------- | -------- |
| Movement | Both ways  | One way  |

---

# 🔷 Part 71 — Adjacency Matrix

## 💡 Idea

Store graph in 2D array

## 💻 Code

```java
class GraphMatrix {
    int[][] adj;
    int V;

    GraphMatrix(int V) {
        this.V = V;
        adj = new int[V][V];
    }

    void addEdge(int u, int v) {
        adj[u][v] = 1;
        adj[v][u] = 1;
    }
}
```

## ⚠️ Drawback

* Space = **O(V²)**

---

# 🔷 Part 72 — Adjacency List (IMPORTANT)

## 💡 Idea

Store neighbors of each node

## 💻 Code

```java
import java.util.*;

class GraphList {
    ArrayList<ArrayList<Integer>> adj;
    int V;

    GraphList(int V) {
        this.V = V;
        adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}
```

## ✅ Advantage

* Space = **O(V + E)**

---

# 🔷 Part 73 — BFS (Breadth First Search)

## 💡 Intuition

> Visit nearest nodes first (level by level)

## 📊 Example

```
0 → 1,2
1 → 3
2 → 4
```

BFS:

```
0 1 2 3 4
```

## 🧠 Why Queue?

* FIFO → maintains level order

## 💻 Code

```java
import java.util.*;

class BFS {
    static void bfs(ArrayList<ArrayList<Integer>> adj, int start) {
        boolean[] visited = new boolean[adj.size()];
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");

            for (int nei : adj.get(node)) {
                if (!visited[nei]) {
                    visited[nei] = true;
                    q.add(nei);
                }
            }
        }
    }
}
```

---

# 🧠 BFS LeetCode Problems

## 🟢 Number of Islands

### 💡 Idea

* Grid = graph
* BFS to explore island

### 💻 Code

```java
void bfs(int i, int j, char[][] grid) {
    Queue<int[]> q = new LinkedList<>();
    q.add(new int[]{i,j});
    grid[i][j] = '0';

    int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

    while (!q.isEmpty()) {
        int[] cell = q.poll();

        for (int[] d : dirs) {
            int ni = cell[0] + d[0];
            int nj = cell[1] + d[1];

            if (ni >= 0 && nj >= 0 && ni < grid.length && nj < grid[0].length
                && grid[ni][nj] == '1') {

                grid[ni][nj] = '0';
                q.add(new int[]{ni,nj});
            }
        }
    }
}
```

---

## 🟢 Rotting Oranges

### 💡 Idea

* Multi-source BFS
* Level = time

### 💻 Code

```java
int orangesRotting(int[][] grid) {
    Queue<int[]> q = new LinkedList<>();
    int fresh = 0, time = 0;

    for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[0].length; j++) {
            if (grid[i][j] == 2) q.add(new int[]{i,j});
            if (grid[i][j] == 1) fresh++;
        }
    }

    int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

    while (!q.isEmpty() && fresh > 0) {
        int size = q.size();
        time++;

        for (int i = 0; i < size; i++) {
            int[] cell = q.poll();

            for (int[] d : dirs) {
                int ni = cell[0] + d[0];
                int nj = cell[1] + d[1];

                if (ni >= 0 && nj >= 0 && ni < grid.length && nj < grid[0].length
                    && grid[ni][nj] == 1) {

                    grid[ni][nj] = 2;
                    fresh--;
                    q.add(new int[]{ni,nj});
                }
            }
        }
    }

    return fresh == 0 ? time : -1;
}
```

---

# 🔷 Part 74–75 — DFS (Depth First Search)

## 💡 Intuition

> Go deep, then backtrack

## 📊 Example

```
0 → 1 → 3
      → 4
→ 2 → 5
```

DFS:

```
0 1 3 4 2 5
```

---

## 💻 Recursive DFS

```java
class DFS {
    static void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int nei : adj.get(node)) {
            if (!visited[nei]) {
                dfs(nei, visited, adj);
            }
        }
    }
}
```

---

## 💻 Iterative DFS

```java
import java.util.*;

class DFSIterative {
    static void dfs(int start, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[adj.size()];
        Stack<Integer> st = new Stack<>();

        st.push(start);

        while (!st.isEmpty()) {
            int node = st.pop();

            if (!visited[node]) {
                visited[node] = true;
                System.out.print(node + " ");

                for (int nei : adj.get(node)) {
                    if (!visited[nei]) {
                        st.push(nei);
                    }
                }
            }
        }
    }
}
```

---

# 🧠 DFS LeetCode Problems

## 🟢 Flood Fill

### 💡 Idea

* Change connected cells

### 💻 Code

```java
void dfs(int[][] image, int i, int j, int color, int newColor) {
    if (i < 0 || j < 0 || i >= image.length || j >= image[0].length ||
        image[i][j] != color) return;

    image[i][j] = newColor;

    dfs(image, i+1, j, color, newColor);
    dfs(image, i-1, j, color, newColor);
    dfs(image, i, j+1, color, newColor);
    dfs(image, i, j-1, color, newColor);
}
```

---

## 🟢 Max Area of Island

### 💡 Idea

* DFS + count area

### 💻 Code

```java
int dfs(int[][] grid, int i, int j) {
    if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length ||
        grid[i][j] == 0) return 0;

    grid[i][j] = 0;

    return 1 + dfs(grid,i+1,j) + dfs(grid,i-1,j)
             + dfs(grid,i,j+1) + dfs(grid,i,j-1);
}
```

---

# 🔥 BFS vs DFS

| Feature   | BFS           | DFS             |
| --------- | ------------- | --------------- |
| Structure | Queue         | Stack/Recursion |
| Traversal | Level         | Depth           |
| Use       | Shortest path | Backtracking    |

---

# 🎯 Final Summary

## BFS

* Queue
* Level order
* Shortest path

## DFS

* Recursion
* Deep traversal
* Backtracking
