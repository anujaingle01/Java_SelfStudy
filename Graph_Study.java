import java.util.*;

public class Graph_Study {

        static class Edge {     // edge = connection
            int src;
            int dest;
            int wt;
            public Edge(int s, int d, int w) {      // constructor
                this.src = s;
                this.dest = d;
                this.wt = w;
            }
        }

        static void createGraph(ArrayList<Edge> graph[]) {
            for(int i=0; i<graph.length; i++) {
                graph[i] = new ArrayList<>();               // create empty list ... Not null = (invalid)
            }
            // new Edge = circles (Nodes)
            graph[0].add(new Edge(0, 1, 1));
            graph[0].add(new Edge(0, 2, 1));

            graph[1].add(new Edge(1, 0, 1));
            graph[1].add(new Edge(1, 3, 1));

            graph[2].add(new Edge(2, 0, 1));
            graph[2].add(new Edge(2, 4, 1));

            graph[3].add(new Edge(3, 1, 1));
            graph[3].add(new Edge(3, 4, 1));
            graph[3].add(new Edge(3, 5, 1));

            graph[4].add(new Edge(4, 2, 1));
            graph[4].add(new Edge(4, 3, 1));
            graph[4].add(new Edge(4, 5, 1));

            graph[5].add(new Edge(5, 3, 1));
            graph[5].add(new Edge(5, 4, 1));
            graph[5].add(new Edge(5, 6, 1));
            graph[5].add(new Edge(6, 5, 1));
        }


        public static void bfs(ArrayList<Edge> graph[], int V) {          // Breadth First Search
            boolean visited[] = new boolean[V];
            Queue<Integer> q = new LinkedList<>();

            q.add(0);                                                       //Source = 0
            while(!q.isEmpty()) {
                int curr = q.remove();
                if(!visited[curr]) {        // default false
                    System.out.print(curr+" ");
                    visited[curr] = true;

                    for(int i=0; i<graph[curr].size(); i++) {
                        Edge e = graph[curr].get(i);
                        q.add(e.dest);
                    }
                }
            }
            System.out.println();
        }



    public static void dfs(ArrayList<Edge> graph[], int curr, boolean visited[]) {      // Depth First Search
        if(visited[curr]) {
            return;
        }
        System.out.print(curr+" ");
        visited[curr] = true;

        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            dfs(graph, e.dest, visited);
        }
    }



        public static void main(String args[]) {

            int V = 7;
            ArrayList<Edge> graph[] = new ArrayList[V];

            createGraph(graph);

            System.out.print("Breadth First Search = ");
            bfs(graph, V);                                // Breadth First Search

            System.out.print("Depth First Search = ");
            dfs(graph, 0, new boolean[V]);          // Depth First Search
        }

    }

