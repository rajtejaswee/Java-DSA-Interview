package Graphs.BFS_DFS_Questions;

class Provinces {
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited=new boolean[isConnected.length];
        int count=0;
        for(int i=0;i<isConnected.length;i++){
            if(!visited[i]) {
                count++;
                DFS(isConnected,i,visited);
            }
        }
        return count;
    }
    void DFS(int[][] connected,int curr,boolean[] visited){
        visited[curr]=true;
        for(int i=0;i<connected[curr].length;i++){
            if(connected[curr][i]==1 && !visited[i]) DFS(connected,i,visited);
        }
    }
}
