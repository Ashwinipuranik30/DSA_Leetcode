class Solution {
    public String minRemoveToMakeValid(String s) {
        int open = 0;
        int close = 0;
        char[] chars = s.toCharArray();


        for( int i=0 ; i<chars.length ; i++){
           if(Character.isLowerCase(chars[i])){
            continue;
           }
           else if(chars[i]=='('){
            ++open;
            }
            else if(open>0){
                --open;               
            }
            else{
                chars[i]='@';
            }

        }

        for( int i=chars.length-1 ; i>=0 ; i--){
            if(Character.isLowerCase(chars[i])){
            continue;
           }
           else if(chars[i]==')'){
            ++close;
            }
            else if(close>0){
                --close;               
            }
            else{
                chars[i]='@';
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