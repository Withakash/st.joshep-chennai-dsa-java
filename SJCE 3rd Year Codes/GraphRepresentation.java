import java.util.*;

public class GraphRepresentation {

    static class GraphMatrix {
        int V;
        int[][] adj;

        GraphMatrix(int nV){
            V = nV;
            adj = new int[V][V];
        }

        void addEdge(int s, int d){
            adj[s][d] = 1;
            adj[d][s] = 1;  //remove this fro directed graph
        }

        void printMatrix(){
            System.out.println("Adjacency Matrix : ");
            for(int i = 0 ; i < V ; i++){
                for(int j = 0 ; j < V ; j++){
                    System.out.print(adj[i][j] + " ");
                }
                System.out.println();
            } 
        }
    }


    static class GraphList{
        int V;
        ArrayList<ArrayList<Integer>> adj;

        GraphList(int nV){
            V = nV;
            adj = new ArrayList<>();

            for(int i =0 ; i < V ; i++){
                adj.add(new ArrayList<>());
            }
        }

        void addEdge(int s,int d){
            adj.get(s).add(d);
            // adj.get(d).add(s);
        }

        void printList(){
            System.out.println("\nAdjacency List :");
            for(int i =0 ; i < V ; i++){
                System.out.print(i + " -> ");
                for(int nei : adj.get(i)){
                    System.out.print(nei + " ");
                }
                System.out.println();;
            }
        }

        // BFS  using Queue
        ArrayList<Integer> bfsTraval = new ArrayList<>();
        void bfs(int start){
          boolean[] visited = new boolean[V];
          Queue<Integer> q = new java.util.LinkedList<>();

          q.add(start);
          visited[start] =  true;

          while(!q.isEmpty()){
            int node = q.poll();
            bfsTraval.add(node);

            for(int n : adj.get(node)){
                if(!visited[n]){
                    visited[n] = true;
                    q.add(n);
                }
            }
          }

          System.out.println("BFS Traval is :  " +  bfsTraval);

        }



        //DFS Travals using Stack
        ArrayList<Integer> dfsTraval = new ArrayList<>();

        void dfs(int start){
            boolean[] visited = new boolean[V];
            Stack<Integer> st = new Stack<>();

            st.push(start);

            while(!st.isEmpty()){
                int node = st.pop();

                if(!visited[node]){
                    visited[node] = true;
                    dfsTraval.add(node);

                    for(int n :adj.get(node)){
                        if(!visited[n]) {
                            st.push(n);
                        }
                    }

                }
            }

                      System.out.println("DFS Traval is :  " +  dfsTraval);

        }

    }



    public static void main(String[] args){
        // GraphMatrix g = new GraphMatrix(3);
        // g.addEdge(0,1);
        // g.addEdge(0,2);
        // g.printMatrix();

        GraphList g = new GraphList(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 0);
        g.addEdge(1, 4);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        g.addEdge(3, 2);
        g.addEdge(3, 4);
        g.addEdge(4, 1);
        g.addEdge(4, 3);



        g.printList();
        g.bfs(0);
        g.dfs(0);

    }   
}