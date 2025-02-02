package Graphs;
import java.util.Scanner;

public class GraphMatrix {
    private int[][] adjMatrix;
    private int vertices;

    public GraphMatrix(int vertices){
        this.vertices = vertices;
        adjMatrix = new int[vertices][vertices];
    }

    public void addEdges(int edges) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + edges + " edges (format: src dest):");
        for(int i = 0; i < edges; i++) {
            int src = sc.nextInt();
            int dest = sc.nextInt();
            adjMatrix[src][dest] = 1;
            adjMatrix[dest][src] = 1;
        }
    }

    public void display() {
        System.out.println("Adjacency Matrix");
        for(int i = 0; i < vertices; i++) {
            for(int j = 0; j < vertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices:");
        int v = sc.nextInt();
        System.out.println("Enter the number of edges:");
        int e = sc.nextInt();

        GraphMatrix graph = new GraphMatrix(v);
        graph.addEdges(e);
        graph.display();

    }

}
