class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int num : nums){
            sum+=num;
        }
        
        if(sum%2!=0){
            return false;
        }
        
        boolean[] dp = new boolean[sum/2 + 1];

        dp[0]=true;
        
        for(int i=1;i<dp.length;i++){
            dp[i]=false;
        }

        for(int num : nums){
            for(int i=dp.length-1 ; i>=num;i--){
                if(dp[i-num]==true){
                    dp[i]=true;
                }
            }
        }

        return dp[dp.length-1];
        
    }
}