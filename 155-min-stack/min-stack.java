class MinStack {
    Stack<int[]> stack1;

    public MinStack() {
        stack1 = new Stack<>();
        
    }
    
    public void push(int val) {
        int min = stack1.isEmpty() ? val : Math.min(val , stack1.peek()[1]);
        stack1.push(new int [] {val,min});        
    }
    
    public void pop() {
        stack1.pop();
        
    }
    
    public int top() {
        return stack1.isEmpty() ? -1 : stack1.peek()[0];
        
    }
    
    public int getMin() {
        return stack1.isEmpty() ? -1 : stack1.peek()[1];
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */