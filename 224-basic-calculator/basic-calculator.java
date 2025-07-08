class Solution {
    public int calculate(String s) {
        int eva=0;
        int sign=1;
        int op=0;
        Stack<Integer> stack1 = new Stack<>();
        char[] c= s.toCharArray();

        for(int i=0;i<c.length;i++){
            if(c[i] >='0' && c[i] <= '9'){
                op = 10*op + (c[i]-'0');
            }
            else if(c[i]=='+'){
                eva+=sign*op;
                sign=1;
                op=0;
            }
            else if(c[i]=='-'){
                eva+=sign*op;
                sign=-1;
                op=0;
            }
            else if(c[i]=='('){
                stack1.push(eva);
                stack1.push(sign);
                eva=0;
                sign=1;
                
            }
            else if(c[i]==')'){
                eva+=sign*op;
                eva*=stack1.pop();
                eva+=stack1.pop();
                sign=1;
                op=0;
            }
        }

        return eva+=sign*op;
        
    }
}