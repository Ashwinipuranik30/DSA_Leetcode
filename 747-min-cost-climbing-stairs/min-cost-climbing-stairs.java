class Solution {
    private int minCost(int index, int[] cost,int[] memo){
        if(index>=cost.length){
            return 0;
        }
        else if(index>=0 && memo[index]!=-1){
            return memo[index];
        }
        else if(index==cost.length-1){
            memo[index]=cost[index];
            return cost[index];
        }

        int a = minCost(index+1,cost,memo);
        int b= minCost(index+2,cost,memo);
        if(index==-1){
            return Math.min(a,b);
        }
        memo[index]=cost[index] + Math.min(a,b);
        return memo[index];
    }
    public int minCostClimbingStairs(int[] cost) {
        int[] mem = new int[cost.length];
        Arrays.fill(mem,-1);
        return  minCost(-1, cost,mem);       
    }
}