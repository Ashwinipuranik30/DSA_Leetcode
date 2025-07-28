class LRUCache {
    int capacity;
    LinkedHashMap<Integer,Integer> map1;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        this.map1=new LinkedHashMap<>();    
    }
    
    public int get(int key) {
        int value=-1;
        if(map1.containsKey(key)){
            value= map1.remove(key);
            map1.put(key,value);
        }
        return value;   
    }
    
    public void put(int key, int value) {
        if(map1.containsKey(key)){
            map1.remove(key);
            map1.put(key,value);
        }
        else if(capacity>0){
                map1.put(key,value);
                capacity--;
        }
        else{
            Map.Entry<Integer,Integer> entry = map1.entrySet().iterator().next();
            map1.remove(entry.getKey());
            map1.put(key,value);
        }
        
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */