class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek()==c){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }

        StringBuilder S = new StringBuilder();

        while(!stack.isEmpty()){
            S.insert(0,stack.pop());
        }
        
        return S.toString();
    }
}