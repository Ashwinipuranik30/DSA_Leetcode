

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack1= new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                stack1.push(c);
            }
            else {
                if(stack1.empty()){
                    return false;
                }
                else {
                    if((c=='}' && stack1.peek()=='{') ||
                    (c==')' && stack1.peek()=='(') ||
                    (c==']' && stack1.peek()=='[')){
                        stack1.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
            
        }
        return stack1.isEmpty();
        
    }
}