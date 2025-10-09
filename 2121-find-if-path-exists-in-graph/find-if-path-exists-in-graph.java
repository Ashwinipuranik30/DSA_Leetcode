class Solution {
    private boolean dfs(int source, boolean[] isConnected,int destination, List<Integer>[] adj){
        if(source==destination){
            return true;
        }

        isConnected[source]=true;

        for(int node : adj[source]){
            if(!isConnected[node]){
                if(dfs(node,isConnected,destination,adj)){
                    return true;
                };
            }
        }

        return false;
     
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] isConnected= new boolean[n];
        List<Integer>[] adj = new List[n];

        for(int i=0;i<n;i++){
            adj[i]= new ArrayList<>();
        }
        
        for(int[] edge :edges){
            adj[edge[0]].add(edge[1]);
            adj[edge[1]].add(edge[0]);
        }

        return dfs(source,isConnected,destination,adj);
        
    }
}