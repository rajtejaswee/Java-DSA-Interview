package Graphs.BFS_DFS_Questions;
import java.util.*;

public class UndirectedGraphCycleDFS {
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V]; // To track visited nodes

        // Run DFS from every unvisited node (handles disconnected components)
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfs(i, -1, adj, visited)) {  // Start DFS
                    return true;
                }
            }
        }
        return false;
    }
    private boolean dfs(int node, int parent, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
        visited[node] = true;  // Mark the current node as visited

        for (int neighbor : adj.get(node)) {  // Traverse all neighbors
            if (!visited[neighbor]) {
                if (dfs(neighbor, node, adj, visited)) {
                    return true;  // Cycle detected in the DFS path
                }
            } else if (neighbor != parent) {
                return true;  // If visited and not the parent → Cycle found
            }
        }
        return false;  // No cycle found in this path
    }
}
