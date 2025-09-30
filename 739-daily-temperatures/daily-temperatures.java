class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack1= new Stack<>();
        int[] answer = new int[temperatures.length];
        stack1.push(0);

        for(int i=1;i<temperatures.length;i++){
            while(!stack1.isEmpty() && (temperatures[i] > temperatures[stack1.peek()])){
                answer[stack1.peek()]= i-stack1.peek();
                stack1.pop();                
            }
            stack1.push(i);     
            
        }

      

        return answer;


        
    }
}