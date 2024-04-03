package se.ifmo.task2;

import java.util.*;

public class DijkstraAlgorithm {
    private static final int INF = Integer.MAX_VALUE;

    public static int[] dijkstra(int[][] graph, int start) {

        if (graph == null || start < 0 || graph.length == 0  || graph.length <= start){
            throw  new IllegalArgumentException();
        }

        for (int i = 0; i < graph.length; i++){
            boolean flag = false;
            for (int j = 0; i < graph.length; i++){
                if (graph[i][j] != 0){
                    flag = true;
                }
                if (graph[i][j] < 0){
                    throw  new IllegalArgumentException();
                }
                if(graph[i][j] != graph[j][i]){
                    throw  new IllegalArgumentException();
                }
            }
            if (!flag){
                throw  new IllegalArgumentException();
            }
        }

        for (int i = 0; i < graph.length; i++){
            int length = graph[0].length;
            if (graph[i][i] != 0 || length != graph[i].length){
                throw  new IllegalArgumentException();
            }
        }


        int n = graph.length;
        int[] dist = new int[n];
        Arrays.fill(dist, INF);
        dist[start] = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(v -> dist[v]));
        pq.add(start);

        while (!pq.isEmpty()) {
            int u = pq.poll();
            for (int v = 0; v < n; v++) {
                if (graph[u][v] != 0 && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                    pq.add(v);
                }
            }
        }

        // Output the shortest distances from the start node to all other nodes
//        for (int i = 0; i < n; i++) {
//
//           System.out.println("Distance from node " + start + " to node " + i + ": " + dist[i]);
//        }
        return dist;
    }



    public static int[] dijkstraOnStep(int[][] graph, int start, int step) {

        if (graph == null || start < 0 || graph.length == 0  || graph.length <= start){
            throw  new IllegalArgumentException();
        }

        for (int i = 0; i < graph.length; i++){
            boolean flag = false;
            for (int j = 0; i < graph.length; i++){
                if (graph[i][j] != 0){
                    flag = true;
                }
                if (graph[i][j] < 0){
                    throw  new IllegalArgumentException();
                }
                if(graph[i][j] != graph[j][i]){
                    throw  new IllegalArgumentException();
                }
            }
            if (!flag){
                throw  new IllegalArgumentException();
            }
        }

        for (int i = 0; i < graph.length; i++){
            int length = graph[0].length;
            if (graph[i][i] != 0 || length != graph[i].length){
                throw  new IllegalArgumentException();
            }
        }


        int n = graph.length;
        int[] dist = new int[n];
        Arrays.fill(dist, INF);
        dist[start] = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(v -> dist[v]));
        pq.add(start);

        int step1 = 0;
        while (!pq.isEmpty() && step1 != step) {
            int u = pq.poll();
            for (int v = 0; v < n; v++) {
                if (graph[u][v] != 0 && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                    pq.add(v);
                }
            }
            step1++;
        }

        // Output the shortest distances from the start node to all other nodes
//        for (int i = 0; i < n; i++) {
//
//           System.out.println("Distance from node " + start + " to node " + i + ": " + dist[i]);
//        }
        return dist;
    }
}
