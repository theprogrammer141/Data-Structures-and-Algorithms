package BipartiteGraph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
    }

    public static boolean isBiPartite(ArrayList<Edge>[] graph){
        int[] color = new int[graph.length];

        for (int i = 0; i < color.length; i++) {
            color[i] = -1;
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < graph.length; i++) {
            if(color[i] == -1){//BFS
                q.add(i);
                color[i] = 0; //Yellow

                while(!q.isEmpty()){
                    int current = q.remove();

                    for (int j = 0; j < graph[current].size(); j++) {
                        Edge e = graph[current].get(j);

                        if(color[e.destination] == 1){
                            int nextColor = color[current] == 0 ? 1 : 0;
                            color[e.destination] = nextColor;
                            q.add(e.destination);
                        }

                        else if(color[e.destination] == color[current]){
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int V = 5;

        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        System.out.println(isBiPartite(graph));
    }
}
