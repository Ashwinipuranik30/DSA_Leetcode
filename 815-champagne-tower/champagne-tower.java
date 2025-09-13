class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[] row1 = new double[query_row+1];
        row1[0]=poured;

        for(int i=1;i<=query_row;i++){
            for(int j=i-1;j>=0;j--){
                if(row1[j]>1){
                    double value= (row1[j]-1)/2;
                    row1[j]=value;
                    row1[j+1]+=value;
                }
                else{
                    row1[j]=0;
                }
            }

        }

        return Math.min(1,row1[query_glass]);
    }
}