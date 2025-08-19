class Solution {
    public int maxChunksToSorted(int[] arr) {
        int maxchunks=0;
        int[] suffixmin = new int[arr.length];
        suffixmin[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            suffixmin[i]=Math.min(suffixmin[i+1],arr[i]);
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
            if(i==arr.length-1 || max<=suffixmin[i+1]){
                maxchunks+=1;          
            }         
        }
        return maxchunks;
        
    }
}