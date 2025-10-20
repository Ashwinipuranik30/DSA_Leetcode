class Solution {
    public int characterReplacement(String s, int k) {
        int[] count= new int[26];
        int maxfreq=0;
        int left=0;
        int windowLength=0;

        for(int right=0; right < s.length(); right++){
            count[s.charAt(right)-'A']++;
            maxfreq=Math.max(maxfreq, count[s.charAt(right)-'A']);

            
            while(((right-left+1) - maxfreq) >k){
                count[s.charAt(left) - 'A']--;
                left++;
            }

            windowLength=Math.max(windowLength, right-left+1 );


        }

        return windowLength;
        
    }
}