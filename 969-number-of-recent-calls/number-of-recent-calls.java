class RecentCounter {
    Queue<Integer> queue1;
    


    public RecentCounter() {
        queue1=new LinkedList<>();       
    }
    
    public int ping(int t) {
        int count=0;
        queue1.offer(t);
        for(int value :queue1){
            if(value>= t-3000 && value<=t){
                count++;
            }
        }
        return count;
        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */