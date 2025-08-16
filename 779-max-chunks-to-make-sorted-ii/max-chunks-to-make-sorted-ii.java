class Solution {
    public int maxChunksToSorted(int[] arr) {
        int[] suffixMin = new int[arr.length];

        suffixMin[arr.length-1]=arr[arr.length-1];

        for(int i=suffixMin.length-2;i>=0;i--){
            suffixMin[i]=Math.min(arr[i],suffixMin[i+1]);
        }

        int max=arr[0];
        int maxChunks=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
            if((i==arr.length-1) || max<=suffixMin[i+1]){
                maxChunks+=1;
            }
        }
        return maxChunks;
        
    }
}