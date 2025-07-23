class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> wordcount = new HashMap<>();
        
        for(String word : words){
            wordcount.put(word,wordcount.getOrDefault(word,0)+1);
        }

        List<String>[] heap = new List[words.length+1];

        for(String key : wordcount.keySet()){
            int index = wordcount.get(key);
            if(heap[index]==null){
                heap[index]= new ArrayList<>();
            }
            heap[index].add(key);
            Collections.sort(heap[index]);
        }
        List<String> result = new ArrayList<>();
        

        for(int index=0, i=heap.length-1;i>=0;i--){
            if(heap[i]==null){
                continue;
            }
            else{
                for(int j=0; index<k && j<heap[i].size();j++){
                    result.add(heap[i].get(j));
                    index++;
                }
            }

        }
        return result;

        
    }
}