package KruskalsAlgorithm;

import java.util.ArrayList;
import java.util.Collections;

public class Graph {
    public static class Edge implements Comparable<Edge>{
        int source;
        int destination;
        int weight;

        public Edge(int source, int destination, int weight){
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge o) {
            return this.weight - o.weight;
        }
    }

    public static void createGraph(ArrayList<Edge> edges){
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 15));
        edges.add(new Edge(0, 3, 30));

        edges.add(new Edge(1, 3, 40));

        edges.add(new Edge(2, 3, 50));
    }

    static int n = 4;
    static int[] parent = new int[n];
    static int[] rank = new int[n];

    public static void init(){
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    public static int find(int x){
        if(parent[x] == x){
            return x;
        }

        return parent[x] = find(parent[x]);
    }

    public static void union(int a, int b) {
        int parentA = parent[a];
        int parentB = parent[b];

        if(rank[parentA] == rank[parentB]){
            parent[parentB] = parentA;
            rank[parentA]++;
        }
        else if(rank[parentA] < rank[parentB]){
            parent[parentA] = parentB;
        }
        else{
            parent[parentB] = parentA;
        }
    }

    public static void kruskals(ArrayList<Edge> edges, int V){
        init();
        Collections.sort(edges);
        int mstCost = 0;
        int count = 0;

        for (int i = 0; count < V - 1; i++) {
            Edge e = edges.get(i);

            int parentA = find(e.source); //source = A
            int parentB = find(e.destination); //Destination = B

            if(parentA != parentB){
                union(e.source, e.destination);
                mstCost += e.weight;
                count++;
            }
        }

        System.out.println("Final(min) cost of MST = " + mstCost);
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> edges = new ArrayList<>();
        createGraph(edges);

        kruskals(edges, V);

    }
}
