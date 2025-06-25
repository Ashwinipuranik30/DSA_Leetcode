class Solution {
    public String makeGood(String s) {

        Stack<Character> stack1 = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(!stack1.isEmpty() && Math.abs(c-stack1.peek())==32){
                stack1.pop();
            }
            else{
                stack1.push(c);
            }      
            
        }

        StringBuilder S = new StringBuilder();
        while(!stack1.isEmpty()){
            S.insert(0,stack1.pop());
        }

        return S.toString();


        
        



        
    }
}