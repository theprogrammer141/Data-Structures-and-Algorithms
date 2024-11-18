package DijkstrasAlgorithm;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Graph {
    public static class Edge{
        int source;
        int destination;
        int weight;

        public Edge(int source, int destination, int weight){
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    static class Pair implements Comparable<Pair>{
        int n;
        int path;

        public Pair(int n, int path){
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.path - p2.path;
        }
    }

    public static void dijkstra(ArrayList<Edge>[] graph, int source){
        int[] distance = new int[graph.length]; //distance[i] -> source to i

        for (int i = 0; i < graph.length; i++) {
            if(i != source){
                distance[i] = Integer.MAX_VALUE;
            }
        }
        
        boolean[] visited = new boolean[graph.length];

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(source, 0));

        while(!pq.isEmpty()){
            Pair current = pq.remove();

            if(!visited[current.n]){
                visited[current.n] = true;

                for (int i = 0; i < graph[current.n].size(); i++) {
                    Edge e = graph[current.n].get(i);
                    int u = e.source;
                    int v = e.destination;
                    int weight = e.weight;

                    if(distance[u] + weight < distance[v]){
                        distance[v] = distance[u] + weight;
                        pq.add(new Pair(v, distance[v]));
                    }
                }
            }
        }

        //print all source to vertices shortest distance
        for (int i = 0; i < distance.length; i++) {
            System.out.print(distance[i] + " ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int V = 6;

        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        int source = 0;
        dijkstra(graph, source);
    }
}
