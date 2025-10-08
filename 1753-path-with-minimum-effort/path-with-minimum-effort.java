class Solution {
    public int minimumEffortPath(int[][] heights) {
        int rowLength = heights.length;
        int colLength = rowLength==0 ? 0 : heights[0].length;

        int[][] efforts = new int[rowLength][colLength];

        for(int i=0 ; i<rowLength ; i++){
            Arrays.fill(efforts[i],Integer.MAX_VALUE);
        }

        efforts[0][0]=0;

        PriorityQueue<int[]> mineffort = new PriorityQueue<>((a,b)-> a[2]-b[2]);

        mineffort.offer(new int[] {0,0,0});

        int[][] direction = {{1,0}, {-1,0}, {0,1}, {0,-1}};

        while(!mineffort.isEmpty()){
            int[] mat = mineffort.poll();

            if(mat[0]==rowLength-1 && mat[1]==colLength-1){
                return mat[2];
            }

            for(int[] direct : direction){
                int row = mat[0] + direct[0];
                int col = mat[1] + direct[1];

                if(row<0 || row==rowLength || col<0 || col==colLength){
                    continue;
                }

                int eff= Math.max(mat[2] , Math.abs(heights[row][col]-heights[mat[0]][mat[1]]));
                if(eff<efforts[row][col]){
                    efforts[row][col]=eff;
                    mineffort.offer(new int[] {row,col,eff});
                }
            }
        }

        return efforts[rowLength-1][colLength-1]; 
        
    }
}