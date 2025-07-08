class Solution {
    public int longestValidParentheses(String s) {

        int open=0;
        int close=0;
        int ml=0;
        char[] c= s.toCharArray();

        for(int i=0;i<c.length;i++){
            if(c[i]=='('){
                open++;
            }
            else if(c[i]==')'){
                close++;
            }
            if(close>open){
                open=0;
                close=0;
            }
            if(open==close){
                ml=Math.max(ml,open+close);
            }
        }

        open=0;
        close=0;

        for(int i=c.length-1;i>=0;i--){
            if(c[i]=='('){
                open++;
            }
            else if(c[i]==')'){
                close++;
            }
            if(open>close){
                open=0;
                close=0;
            }
            if(open==close){
                ml=Math.max(ml,open+close);
            }
        }

        return ml;
        
    }
}