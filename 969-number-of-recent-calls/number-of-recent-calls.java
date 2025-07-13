class RecentCounter {
    Queue<Integer> queue1;
    


    public RecentCounter() {
        queue1=new LinkedList<>();       
    }
    
    public int ping(int t) {
        queue1.offer(t);
        while(!queue1.isEmpty() && queue1.peek()<t-3000){
            queue1.poll();
        }
        return queue1.size();
        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */