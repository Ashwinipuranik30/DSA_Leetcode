class StockSpanner {
    Stack<int[]> stack1;

    public StockSpanner() {
        stack1 = new Stack<>();        
    }
    
    public int next(int price) {
        int count = 1;
        if(stack1.isEmpty()){
            stack1.push(new int[] {price , count});
        }
        else {
            while( !stack1.isEmpty() && price>=stack1.peek()[0]){
                count+=stack1.peek()[1];
                stack1.pop();
            }
        
            stack1.push(new int[] {price , count});
        }
        return count;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */