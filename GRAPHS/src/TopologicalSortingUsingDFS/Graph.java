package TopologicalSortingUsingDFS;

import java.util.ArrayList;
import java.util.Stack;

public class Graph {
    public static class Edge{
        int source;
        int destination;

        public Edge(int source, int destination) {
            this.source = source;
            this.destination = destination;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void TSO(ArrayList<Edge>[] graph){
        boolean[] visited = new boolean[graph.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < graph.length; i++) {
            if(!visited[i]){
                TSOUtil(graph, i, visited, stack);
            }
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }

    public static void TSOUtil(ArrayList<Edge>[] graph, int current, boolean[] visited, Stack<Integer> stack){
        visited[current] = true;

        for (int i = 0; i < graph[current].size(); i++) {
            Edge e = graph[current].get(i);
            if(!visited[e.destination]){
                TSOUtil(graph, e.destination, visited, stack);
            }
        }

        stack.push(current);
    }
    public static void main(String[] args) {
        int V = 6;

        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        TSO(graph);
    }
}
