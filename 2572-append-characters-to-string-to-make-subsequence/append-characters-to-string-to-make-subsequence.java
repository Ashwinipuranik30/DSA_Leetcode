class Solution {
    public int appendCharacters(String s, String t) {
        int i=0;
        int j=0;

        while(i<t.length() && j<s.length()){
            if(t.charAt(i)!=s.charAt(j)){
                j++;
            }
            else{
                i++;
                j++;
            }
        }

        if(i==t.length()){
            return 0;
        }
        int count=0;

        for(int sum=i;sum<t.length();sum++){
            count++;
        }

        return count;


       
        
    }
}