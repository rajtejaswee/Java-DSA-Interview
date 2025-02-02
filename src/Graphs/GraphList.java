package Graphs;
import java.util.*;

public class GraphList {
    private int vertices;
    private List<List<Integer>> adjList;

    public GraphList(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>();
        for(int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdges(int edges) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + edges + " edges (format: src dest):");
        for (int i = 0; i < edges; i++) {
            int src = sc.nextInt();
            int dest = sc.nextInt();
            adjList.get(src).add(dest);
            adjList.get(dest).add(src);
        }
    }

    public void printGraph() {
        System.out.println("Adjacency List:");
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            for (int neighbor : adjList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int v = sc.nextInt();
        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        GraphList graph = new GraphList(v);
        graph.addEdges(e);
        graph.printGraph();
    }

}
