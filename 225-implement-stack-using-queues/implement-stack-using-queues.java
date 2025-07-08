class MyStack {
    Queue<Integer> queue1;
    public MyStack() {
        queue1=new LinkedList<>();
        
    }
    
    public void push(int x) {
        int size=queue1.size();
        if(size==0){
            queue1.offer(x);
        }
        else{
            queue1.offer(x);
            while(size!=0){
                int b=queue1.poll();
                queue1.offer(b);
                size--;
            }
        }
        
    }
    
    public int pop() {
        return queue1.poll();
        
    }
    
    public int top() {
        return queue1.peek();

        
    }
    
    public boolean empty() {
        if(queue1.size()==0){
            return true;
        }
        else{
            return false;
        }
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */