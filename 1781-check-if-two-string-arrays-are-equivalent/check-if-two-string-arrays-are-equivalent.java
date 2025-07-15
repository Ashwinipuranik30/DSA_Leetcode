class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder S= new StringBuilder();
        StringBuilder S2=new StringBuilder();

        for(String c : word1){
            S.append(c);
        }
        for(String c : word2){
            S2.append(c);
        }

        return S.toString().equals(S2.toString()) ? true : false;
        

        
    }
}