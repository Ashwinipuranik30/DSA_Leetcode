class CustomStack {
    int[] stack1;
    int stacksize=-1;
    int maxSize;

    public CustomStack(int maxSize) {  
        stack1 = new int [maxSize];   
        this.maxSize=maxSize; 
    }
    
    public void push(int x) {
        if(stacksize+1<maxSize){
            stacksize++;
            stack1[stacksize]=x;
        }    
    }
    
    public int pop() {
        if(stacksize==-1){
            return -1;
        }
        else{
            stacksize--;
            return stack1[stacksize+1];
            
            
        }
        
    }
    
    public void increment(int k, int val) {
     
        for(int i=0;i<k && i<=stacksize ;i++){
                stack1[i]=val+stack1[i];
        }

            
        
        
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */