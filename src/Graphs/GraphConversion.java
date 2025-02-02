package Graphs;
import java.util.*;

public class GraphConversion {
    //Adjacency Matrix to list
    public static void matrixToList(int[][] matrix) {
        int n = matrix.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 1) {
                    adj.get(i).add(j);
                }
            }
        }
    }
    //Adjacency List to Adjacency Matrix
    public static void listToMatrix(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        int[][] matrix = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int neighbour: adj.get(i)) {
                matrix[i][neighbour] = 1;
            }
        }
    }
}
