class Solution {
    public String minRemoveToMakeValid(String s) {
        int open = 0;
        int close = 0;
        char[] chars = s.toCharArray();
        for( int i=0 ; i<chars.length ; i++){
            if(chars[i]=='('){
                ++open;
            }
            else if(chars[i]==')'){
                if(open>0){
                    --open;
                }
                else{
                    chars[i]='@';
                }

            }
            else{
                continue;
            }
        }

        for( int i=chars.length-1 ; i>=0 ; i--){
            if(chars[i]==')'){
                ++close;
            }
            else if(chars[i]=='('){
                if(close>0){
                    --close;
                }
                else{
                    chars[i]='@';
                }

            }
            else{
                continue;
            }
        }

        String b ="";
        for(int i=0 ; i<chars.length ;i++){
            if(chars[i]!='@'){
                b+=chars[i];
            }
            else{
                continue;
            }
        }

        return b;


        
    }
}