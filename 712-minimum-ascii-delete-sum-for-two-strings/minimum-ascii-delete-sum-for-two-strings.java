class Solution {
    private int solve(int s1, int s2, char[] string1, char[] string2, int[][] dp){
        if(s1>=string1.length && s2>=string2.length){
            return 0;
        }
        if(s1>=string1.length && s2<string2.length){
            int sum=0;
            for(int i=s2;i<string2.length ;i++){
                sum+= (int) string2[i];
            }
            return sum;       
        }

        if(s1<string1.length && s2>=string2.length){
            int sum=0;
            for(int i=s1;i<string1.length;i++){
                sum+=(int) string1[i];
            }
            return sum; 
        }

        if(dp[s1][s2]!=-1){
            return dp[s1][s2];
        }
        
        if(string1[s1]==string2[s2]){
            return dp[s1][s2]=solve(s1+1,s2+1,string1,string2,dp);
        }
        else{
            int delete1 = string1[s1] + solve(s1+1,s2,string1,string2,dp);
            int delete2 = string2[s2] + solve(s1,s2+1,string1,string2,dp);
            return dp[s1][s2]= Math.min(delete1,delete2);

        }
    }
    public int minimumDeleteSum(String s1, String s2) {
        char[] string1= s1.toCharArray();
        char[] string2 = s2.toCharArray();
        int[][] dp = new int[string1.length][string2.length];
        for(int i=0;i<string1.length;i++){
            Arrays.fill(dp[i],-1);
        }

        return solve(0,0,string1,string2,dp);
        
    }
}