class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack1 = new Stack<>();
        int[] answer = new int[nums.length*2];
               
        for(int i=(nums.length*2)-1;i>=0;i--){
            while(!stack1.isEmpty() && nums[i%nums.length]>=stack1.peek()){
                stack1.pop();
            }
            if(!stack1.isEmpty() && nums[i%nums.length]<stack1.peek()){
                answer[i]=stack1.peek();
                stack1.push(nums[i%nums.length]);
            }
            else{
                answer[i]=-1;
                stack1.push(nums[i%nums.length]);
            }
            
        }

        
    int[] sliced = Arrays.copyOfRange(answer, 0, nums.length);

        return sliced;
        
        
    }
}