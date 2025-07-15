class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String S="";
        String S2="";

        for(String c : word1){
            S+=c;
        }
        for(String c : word2){
            S2+=c;
        }

        if(S.equals(S2)){
            return true;
        }
        else{
            return false;
        }

        
    }
}