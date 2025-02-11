package Graphs;
import java.util.*;
public class DFS {
    //DFS on list
    public static void dfs(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj,
                           ArrayList<Integer> ls) {
        vis[node] = true;
        ls.add(node);
        for(Integer it: adj.get(node)) {
            if(vis[it] == false) {
                dfs(it, vis, adj, ls);
            }
        }
    }
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[V+1];
        vis[0] = true;
        ArrayList<Integer> ls = new ArrayList<>();
        dfs(0, vis, adj, ls);
        return ls;
    }

    //DFS on Matrix
    class Solution {
        public void findCircleNum(int[][] isConnected) {
            boolean[] visited=new boolean[isConnected.length];
            int count=0;
            for(int i=0;i<isConnected.length;i++){
                if(!visited[i]) {
                    DFS(isConnected,i,visited);
                }
            }

        }
        void DFS(int[][] connected,int curr,boolean[] visited){
            visited[curr]=true;
            for(int i=0;i<connected[curr].length;i++){
                if(connected[curr][i]==1 && !visited[i]) DFS(connected,i,visited);
            }
        }
    }
    public void DFS(int[][] matrix,int curr,boolean[] visited) {
        visited[curr] = true;
        for (int i = 0; i < matrix[curr].length; i++) {
            if (matrix[curr][i] == 1 && !visited[i])
                DFS(matrix, i, visited);
        }
    }

    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(2).add(4);
        adj.get(4).add(2);

        DFS sl = new DFS();
        ArrayList<Integer> ans = sl.dfsOfGraph(5, adj);
        int n = ans.size();
        for (int i = 0; i < n; i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
