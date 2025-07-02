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
                a=stack1.pop();
                b=stack1.pop();
                switch(c){
                    case "+":
                        stack1.push(b+a);
                        break;
                    case "-":
                        stack1.push(b-a);
                        break;
                    case "*":
                        stack1.push(b*a);
                        break;
                    case "/":
                        stack1.push(b/a);
                        break;
                }
            }
        }

        return stack1.pop();
        


        
    }
}