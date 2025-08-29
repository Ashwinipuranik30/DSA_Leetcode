class Solution {
    public int[][] largestLocal(int[][] grid) {

         int[][] maxMatrix= new int[grid[0].length-2][grid[0].length-2];

         for(int i=0;i<maxMatrix[0].length;i++){
            for(int j=0;j<maxMatrix[0].length;j++){
                
                int max=0;
                for(int k=i;k<=i+2;k++){
                    for(int v=j;v<=j+2;v++){
                        max=Math.max(max,grid[k][v]);
                    }

                }
                maxMatrix[i][j]=max;
                
            }
         }

         return maxMatrix;


        
    }
}