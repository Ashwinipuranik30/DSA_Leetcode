class Solution {
    public int maxProfit(int[] prices) {
        int[] dp = new int[prices.length];
        int maxprofit=0;
        int profit=0;

        int min=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            profit=Math.max(profit,prices[i]-min);
            dp[i]=profit;
        }

        int max=0;
        int profitsuffix=0;
        for(int i=prices.length-1; i>=0;i--){
            max=Math.max(max,prices[i]);
            profitsuffix=Math.max(profitsuffix,max-prices[i]);
            prices[i]=profitsuffix;  
            maxprofit=Math.max(maxprofit, prices[i]+dp[i]);
        }

        

        return maxprofit;
        
    }
}