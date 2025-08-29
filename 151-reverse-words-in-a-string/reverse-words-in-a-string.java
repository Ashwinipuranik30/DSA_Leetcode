class Solution {
    public String reverseWords(String s) {
        String[] string1 = s.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();

        for(int i=string1.length-1 ; i>=0 ; i--){
            sb.append(string1[i]);
            if(i>0) sb.append(" ");
        }

        return sb.toString();
    }
}