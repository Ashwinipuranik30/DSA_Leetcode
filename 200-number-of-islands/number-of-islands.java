class Solution {
    private void dfs(char[][] grid, int row, int col, int rows,int cols){
        if( row<0 || row==rows || col<0 || col==cols || grid[row][col]=='0'){
            return;
        }
        grid[row][col]='0';
        dfs(grid,row-1,col,rows,cols);
        dfs(grid,row+1,col,rows,cols);
        dfs(grid,row,col-1,rows,cols);
        dfs(grid,row,col+1,rows,cols);
    }
    public int numIslands(char[][] grid) {
        int answer=0;
        int rows=grid.length;
        int cols= rows==0 ? 0 : grid[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]=='1'){
                    ++answer;
                    dfs(grid,i,j,rows,cols);
                }
            }
        }
        return answer;
        
    }
}