class MyCircularQueue {
    int[] circular;
    int front=-1;
    int rear=-1;
    int count=0;

    public MyCircularQueue(int k) {
        circular=new int[k];        
    }
    
    public boolean enQueue(int value) {
        if(front==-1 && rear==-1){
            front=0;
            rear=(rear+1)%circular.length;
            circular[rear]=value;
            count++;
            return true;
        }
        if(count<circular.length){
            rear=(rear+1)%circular.length;
            circular[rear]=value;
            count++;
            return true;
        }
        else{
            return false;
        }
       
    }
    
    public boolean deQueue() {
        if(count==0){
            return false;
        }
        else{
            front=(front+1)%circular.length;
            count--;
            return true;
        }
       
    }
    
    public int Front() {
        if(count>0){
            return circular[front];
        }
        else{
            return -1;

        }
        
        
    }
    
    public int Rear() {
        if(count>0){
            return circular[rear];
        }
        else{
            return -1;

        }
        
        
        
    }
    
    public boolean isEmpty() {
        if(count==0){
            return true;
        }
        else{
            return false;

        }
        
       
        
    }
    
    public boolean isFull() {
        if(count==circular.length){
            return true;
        }
        else{
            return false;
        }
        
        
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */