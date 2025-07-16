class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] rows= new int[m];
        int[] cols= new int[n];
        int count =0;

        for(int[] a : indices){
            rows[a[0]]++;
            cols[a[1]]++;
        }

        int[][] finalmatrix= new int[m][n];

        for(int i =0;i<finalmatrix.length;i++){
            for(int j = 0; j<finalmatrix[i].length; j++){
                if((rows[i]+cols[j])%2!=0){
                    count++;
                };
            }
        }


        return count;

        
    }
}