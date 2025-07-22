class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder non_alphanumeric = new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                non_alphanumeric.append(Character.toLowerCase(s.charAt(i)));
            }            
        }

        int start=0;
        int end=non_alphanumeric.length()-1;

        if(non_alphanumeric.length()==0){
            return true;
        }

        while(start<end){
            if(non_alphanumeric.charAt(start)!=non_alphanumeric.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;       

    }
}