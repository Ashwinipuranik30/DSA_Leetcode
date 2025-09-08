class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {

        boolean[] dp = new boolean[s.length() +1];

        dp[0]=true;

        for(int j=0;j<s.length();j++){
            for(int i=0; dp[j] && i<wordDict.size() ; i++){
                if(s.charAt(j)==wordDict.get(i).charAt(0)){
                    int length= j+ wordDict.get(i).length();
                    if(length<=s.length() && wordDict.get(i).equals(s.substring(j,length))){
                        dp[length]=true;
                    }
                    
                }
            }
        }

        return dp[s.length()];
        
    }
}