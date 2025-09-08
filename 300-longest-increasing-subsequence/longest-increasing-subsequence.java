class Solution {

    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];

        int ml=0;
        
        for(int i=0;i<nums.length;i++){
            int index = Arrays.binarySearch(dp,0,ml,nums[i]);
            index=  index>=0 ? index : Math.abs(index)-1;
            dp[index]=nums[i];

            if(index==ml){
                ml++;
            }
        }
        return ml;
        
    }
}