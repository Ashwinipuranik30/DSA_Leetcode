class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> left = new Stack<>();
        Stack<Integer> right = new Stack<>();

        char[] char1 = s.toCharArray();

        for(int i=0; i<char1.length ;i++){
            if(char1[i]=='('){
                left.push(i);
            }
            if(char1[i]=='*'){
                right.push(i);
            }
            if(char1[i]==')'){
                if(!left.isEmpty() && char1[left.peek()]=='(' && i>left.peek()){
                    left.pop();
                }
                else if(!right.isEmpty() && i>right.peek()){
                    right.pop();
                }
                else{
                    return false;
                }
            }
        }

        while(!left.isEmpty() && !right.isEmpty()){
            if(left.peek()<right.peek()){
                left.pop();
                right.pop();
            }
            else{
                return false;
            }
        }


        return left.isEmpty();
        


        



        

        
    }
}