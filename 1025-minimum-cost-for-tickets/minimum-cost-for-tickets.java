class Solution {
    private int linearSearch(int[] days, int start,int search){
        while(start<days.length){
            if(days[start]>=search){
                return start;
            }
            start++;
        }
        return start;
    }
    private int solve(int index, int[] days, int[] costs ,int[] dp){
        if(index>=days.length){
            return 0;
        }
        else if(dp[index]!=-1){
            return dp[index];
        }
        int day1Pass = costs[0] + solve(index+1,days,costs,dp);

        int seventhDay = days[index]+7;
        int ind= linearSearch(days,index,seventhDay);
        int day7Pass= costs[1] + solve(ind,days,costs,dp);

        int thirtyDay = days[index]+30;
        ind= linearSearch(days,index,thirtyDay);
        int day30Pass= costs[2] + solve(ind,days,costs,dp);

        dp[index]=Math.min(day1Pass, Math.min(day7Pass,day30Pass));
        return dp[index];



        


    }
    public int mincostTickets(int[] days, int[] costs) {
        int[] dp = new int[days.length+1];
        Arrays.fill(dp,-1);
        return solve(0,days,costs,dp);
    }
}