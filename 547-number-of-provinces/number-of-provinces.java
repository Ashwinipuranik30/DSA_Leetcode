class Solution {
    private void dfs(int index,int[][] grid,boolean[] isvisited){
        if(isvisited[index]){
            return;
        }
        isvisited[index]=true;
        for(int i=0;i<grid[0].length;i++){
            if(!isvisited[i] && grid[i][index]==1){
                dfs(i,grid,isvisited);
            }
        }
        
    }
    public int findCircleNum(int[][] isConnected) {
        int length= isConnected.length;
        boolean[] isvisited = new boolean[length];
        int answer=0;

        for(int i=0;i<length;i++){
            if(isvisited[i]==false){
                ++answer;
                dfs(i,isConnected,isvisited);
            }
        }
        return answer;        
    }
}