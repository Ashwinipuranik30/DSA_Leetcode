class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int[] freqs1 = new int[26];

        for(int i=0; i< s1.length(); i++){
            freqs1[s1.charAt(i)-'a']++;
        }


        for(int i=0;i<=(s2.length()-s1.length()) ; i++){
            int end=i+s1.length()-1;
            int[] count2 = new int[26];
            for(int j=i ; j<=end ;j++){
                count2[s2.charAt(j)-'a']++;
            }

            if(Arrays.equals(freqs1,count2)){
                return true;
            }

        }

        return false;


        
    }
}