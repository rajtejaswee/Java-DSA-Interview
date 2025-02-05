package Graphs.BFS_DFS_Questions;
import java.util.*;

class UndirectedGraphCycleBFS {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size();
        boolean[] vis = new boolean[V];
        for(int i = 0; i < V; i++) {
            if(!vis[i]) {
                if(bfs(i, adj, vis)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean bfs(int start, ArrayList<ArrayList<Integer>> adj, boolean[] vis){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start,-1});
        vis[start] = true;
        while(!queue.isEmpty()) {
            int[] pair = queue.poll();
            int node = pair[0];
            int parent = pair[1];
            for(int neighbours: adj.get(node)){
                if(!vis[neighbours]) {
                    vis[neighbours] = true;
                    queue.add(new int[]{neighbours, node});
                }
                else if(neighbours != parent) {
                    return true;
                }
            }
        }
        return false;

    }
}
