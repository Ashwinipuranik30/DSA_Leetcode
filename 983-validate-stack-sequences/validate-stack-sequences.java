class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        
        Stack<Integer> stack1 = new Stack<>();
        int j =0;
        for(int a : pushed){
            stack1.push(a);
            while(!stack1.isEmpty() && stack1.peek()==popped[j]){
                stack1.pop();
                j++;
            }                     
        } 
        

        if(stack1.isEmpty()){
            return true;
        }   
        else{
            return false;
        }  
    }
}