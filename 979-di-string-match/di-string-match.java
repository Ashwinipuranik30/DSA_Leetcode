class Solution {
    public int[] diStringMatch(String s) {
        int i_prem=0;
        int d_prem=s.length();
        int[] premutation =  new int[s.length()+1];
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                premutation[i]=i_prem;
                i_prem++;
            }
            else{
                premutation[i]=d_prem;
                d_prem--;
            }
        }
        premutation[s.length()]=d_prem;
        

        return premutation;
    }
}