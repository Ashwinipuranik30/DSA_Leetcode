class Solution {
    public int scoreOfParentheses(String s) {
       int score=0;
       Stack<Integer> stack1 = new Stack<>();

       for (char c : s.toCharArray()){
        if(c=='('){
            stack1.push(score);
            score=0;
        }
        else{
            score=stack1.peek()+Math.max(2*score,1);
            stack1.pop();
        }
       }

       return score;
    }
}