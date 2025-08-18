class Solution {

    private int climb(int n, int[] memo){
        if(n<=1){
            memo[n]=1;
            return 1;
        }
        else if(memo[n]!=-1){
            return memo[n];
        }
        int a =climb(n-1,memo);
        int b=climb(n-2,memo);
        memo[n]=a+b;
        return memo[n];

    }
    public int climbStairs(int n) {
        int[] map= new int[n+1];
        Arrays.fill(map,-1);
        return climb(n,map);       
    }
}