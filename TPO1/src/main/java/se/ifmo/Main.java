package se.ifmo;

import se.ifmo.task3.Models;

import java.util.Arrays;

import static se.ifmo.task2.DijkstraAlgorithm.dijkstra;

public class Main {
    public static void main(String[] args) {
        int[][] graph = {
                {0, 0, 7, 1, 0, 0, 0, 0},
                {0, 0, 6, 0, 0, 0, 8, 0},
                {7, 6, 0, 0, 1, 0, 5, 0},
                {1, 0, 0, 0, 0, 0, 0, 3},
                {0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 6},
                {0, 8, 5, 0, 0, 0, 0, 0},
                {0, 0, 0, 3, 0, 6, 0, 0}
        };
        System.out.println(Arrays.toString(dijkstra(graph, 4)));
   }
}