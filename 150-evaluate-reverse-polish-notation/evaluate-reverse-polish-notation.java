class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack1 = new Stack<>();
        int a=0;
        int b=0;
        for(String c : tokens){
            if( !c.equals("+") && !c.equals("-") && !c.equals("/") && !c.equals("*") ){
                stack1.push(Integer.parseInt(c));
            }
            else{
                if(c.equals("*")){
                    a=stack1.pop();
                    b=stack1.pop();
                    stack1.push(a*b);
                
                }
                else if(c.equals("+")){
                    a=stack1.pop();
                    b=stack1.pop();
                    stack1.push(a+b);
                
                }
                if(c.equals("/")){
                    a=stack1.pop();
                    b=stack1.pop();
                    stack1.push(b/a);
                
                }
                if(c.equals("-")){
                    a=stack1.pop();
                    b=stack1.pop();
                    stack1.push(b-a);
                
                }
            }
        }

        return stack1.pop();
        


        
    }
}