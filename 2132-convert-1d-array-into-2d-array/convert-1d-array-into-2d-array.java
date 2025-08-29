class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] result = new int[m][n];
        if(m*n != original.length){
            return new int[0][0];
        }
        
        for(int i=0;i<original.length;i++){
            int row= i/n;
            int col = i%n;
            result[row][col]=original[i];
        }
       return result;
    }
}