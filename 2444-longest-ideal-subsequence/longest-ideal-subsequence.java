class Solution {
    public int longestIdealString(String s, int k) {
        int[] dp = new int[26];
        int result=0;

        for(int i=0; i<s.length();i++){
            int a= s.charAt(i)-'a';
            int left = a-k<0 ? 0 : a-k;
            int right=a+k>25 ? 25 :a+k;
            int ml=0;

            for(int j=left ; j<=right;j++){
                ml=Math.max(dp[j],ml);
            }

            ml=ml+1;
            dp[a]=ml;

        }

        for(int i=0; i<dp.length;i++){
            result=Math.max(result,dp[i]);
        }

        return result;

        
    }
}