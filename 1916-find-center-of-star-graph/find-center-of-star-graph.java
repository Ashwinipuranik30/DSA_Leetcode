class Solution {
    public int findCenter(int[][] edges) {
        int n=edges.length+1;

        int[] nodeedge = new int[n+1];

        for(int[] edge : edges){
            nodeedge[edge[0]]++;
            nodeedge[edge[1]]++;
        }
        
        for(int i=1;i<=n;i++){
            if(nodeedge[i]==n-1){
                return i;
            }
        }

        return -1;

    }
}