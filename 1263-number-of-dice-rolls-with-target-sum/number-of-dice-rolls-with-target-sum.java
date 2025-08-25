class Solution {
    /*private int numRolls(int dice, int face, int target,int[][] dp){
        if(dice==0 && target==0){
            return 1;
        }
        else  if(dice<=0 || target<=0){
            return 0;
        }
        else if(dp[dice][target]!=-1){
            return dp[dice][target];
        }
        int ways=0;
        for(int i=1 ;i<=face;i++){
            ways= ways +  numRolls(dice-1,face,target-i,dp);
            ways = ways % 1000_000_007;
        }
        dp[dice][target]=ways;
        return ways;

    }
    */
    public int numRollsToTarget(int n, int k, int target) {
        int[][] dp = new int[n+1][target+1];
        /*for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }
        return numRolls(n ,k ,target, dp);
        */

        dp[0][0]=1;
        for(int dice =1;dice<=n;dice++){
            for(int tar=1;tar<=target;tar++){
                int ways=0;
                for(int face=1;face<=k;face++){
                    if(tar>=face){
                        ways=ways+dp[dice-1][tar-face];
                        ways=ways%1000_000_007;
                    }
                }
                dp[dice][tar]=ways;
            }
        }
        return dp[n][target];
        
    }
}