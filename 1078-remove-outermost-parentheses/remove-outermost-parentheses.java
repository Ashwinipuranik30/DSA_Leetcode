class Solution {
    public String removeOuterParentheses(String s) {

        int count=0;
        String rel="";
        for(char c : s.toCharArray()){

            if(c=='('){
                if(count!=0){
                    rel+=c;
                }
                count++;
            }
            else{
                count--;
                if(count!=0){
                    rel+=c;
                }
                
            }

        }

        return rel;
       
    }
}