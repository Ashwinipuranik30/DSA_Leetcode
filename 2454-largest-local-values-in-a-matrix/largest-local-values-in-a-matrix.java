class Solution {
    public int[][] largestLocal(int[][] grid) {

        int n=grid.length;
        int[][] rowMax = new int[n][n-2];

        for(int i=0;i<n;i++){
            for(int j=0; j<n-2;j++){
                rowMax[i][j]=Math.max( grid[i][j] ,Math.max(grid[i][j+1],grid[i][j+2]));
            }
        }

        int[][] answer = new int[n-2][n-2];

        for(int i=0;i<n-2;i++){
            for(int j=0;j<n-2;j++){
                answer[i][j]=Math.max(rowMax[i][j],Math.max(rowMax[i+1][j],rowMax[i+2][j]));
            }
        }

        return answer;
        
    }
}