package se.ifmo.task2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import se.ifmo.task2.DijkstraAlgorithm;

import static org.junit.jupiter.api.Assertions.*;

public class DijkstraAlgorithmTest {

    @Test
    @DisplayName("Check positive values")
    void checkSorting() {
        assertAll(
                () -> assertArrayEquals(new int[]{0, 13, 7, 1, 8, 10, 12, 4}, DijkstraAlgorithm.dijkstra(new int[][]{
                        {0, 0, 7, 1, 0, 0, 0, 0},
                        {0, 0, 6, 0, 0, 0, 8, 0},
                        {7, 6, 0, 0, 1, 0, 5, 0},
                        {1, 0, 0, 0, 0, 0, 0, 3},
                        {0, 0, 1, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 6},
                        {0, 8, 5, 0, 0, 0, 0, 0},
                        {0, 0, 0, 3, 0, 6, 0, 0}
                }, 0)),
                () -> assertArrayEquals(new int[]{8, 7, 1, 9, 0, 18, 6, 12}, DijkstraAlgorithm.dijkstra(new int[][]{
                        {0, 0, 7, 1, 0, 0, 0, 0},
                        {0, 0, 6, 0, 0, 0, 8, 0},
                        {7, 6, 0, 0, 1, 0, 5, 0},
                        {1, 0, 0, 0, 0, 0, 0, 3},
                        {0, 0, 1, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0, 6},
                        {0, 8, 5, 0, 0, 0, 0, 0},
                        {0, 0, 0, 3, 0, 6, 0, 0}
                }, 4)),
                () -> assertArrayEquals(new int[]{0, 12, 1, 4, 9, 6, 5, 11}, DijkstraAlgorithm.dijkstra(new int[][]{
                        {0, 0, 1, 4, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 7, 0},
                        {1, 0, 0, 0, 8, 0, 4, 0},
                        {4, 0, 0, 0, 0, 2, 0, 7},
                        {0, 0, 8, 0, 0, 0, 6, 0},
                        {0, 0, 0, 2, 0, 0, 8, 7},
                        {0, 7, 4, 0, 6, 8, 0, 0},
                        {0, 0, 0, 7, 0, 7, 0, 0}
                }, 0)),
                () -> assertArrayEquals(new int[]{4, 16, 5, 0, 13, 2, 9, 7}, DijkstraAlgorithm.dijkstra(new int[][]{
                        {0, 0, 1, 4, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 7, 0},
                        {1, 0, 0, 0, 8, 0, 4, 0},
                        {4, 0, 0, 0, 0, 2, 0, 7},
                        {0, 0, 8, 0, 0, 0, 6, 0},
                        {0, 0, 0, 2, 0, 0, 8, 7},
                        {0, 7, 4, 0, 6, 8, 0, 0},
                        {0, 0, 0, 7, 0, 7, 0, 0}
                }, 3))
        );
    }


    @Test
    @DisplayName("Check non-symmetric array")
    void checkNonSymmetricArray() {
        assertThrows(IllegalArgumentException.class, () -> DijkstraAlgorithm.dijkstra(new int[][]{{0, 1, 2},{3, 0, 4},{2, 4, 0}}, 2));
    }

    @Test
    @DisplayName("Check negative element")
    void checkNegativeSquareArray() {
        assertThrows(IllegalArgumentException.class, () -> DijkstraAlgorithm.dijkstra(new int[][]{{0, 1, -2},{1, 0, 4},{-2, 4, 0}}, 2));
    }

    @Test
    @DisplayName("Check none-square array")
    void checkNoneSquareArray() {
        assertThrows(IllegalArgumentException.class, () -> DijkstraAlgorithm.dijkstra(new int[][]{{0, 1, 2},{1,2},{2, 4, 0}}, 2));
    }

    @Test
    @DisplayName("Check non-zero distance to yourself")
    void checkNonZeroDistanceToYourself() {
        assertThrows(IllegalArgumentException.class, () -> DijkstraAlgorithm.dijkstra(new int[][]{{1, 1, 2},{1, 0, 4},{2, 4, 0}}, 2));
    }

    @Test
    @DisplayName("Check empty array")
    void checkEmptyArray() {
        assertThrows(IllegalArgumentException.class, () -> DijkstraAlgorithm.dijkstra(new int[][]{}, 2));
    }

    @Test
    @DisplayName("Check all zeros in column")
    void checkAllZerosInColumn() {
        assertThrows(IllegalArgumentException.class, () -> DijkstraAlgorithm.dijkstra(new int[][]{{0, 0, 0},{1, 0, 4},{2, 4, 0}}, 2));
    }

    @Test
    @DisplayName("Check null")
    void checkNull() {
        assertThrows(IllegalArgumentException.class, () -> DijkstraAlgorithm.dijkstra(null, 0));
    }

    @Test
    @DisplayName("Check negative second argument")
    void checkNegativeSecondArgument() {
        assertThrows(IllegalArgumentException.class, () -> DijkstraAlgorithm.dijkstra(new int[][]{{0, 1, 2},{1, 0, 4},{2, 4, 0}}, -1));
    }

    @Test
    @DisplayName("Check too big second argument")
    void checkTooBigSecondArgument() {
        assertThrows(IllegalArgumentException.class, () -> DijkstraAlgorithm.dijkstra(new int[][]{{0, 1, 2},{1, 0, 4},{2, 4, 0}}, 3));
    }
}
