class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> frequencyMap = new HashMap<>();

        for(int num : nums){
            frequencyMap.put(num,frequencyMap.getOrDefault(num,0)+1);
        }

        List<Integer>[] heap = new List[nums.length+1];

        for(int key : frequencyMap.keySet()){
            int frequency= frequencyMap.get(key);
            if(heap[frequency]==null){
                heap[frequency]=new ArrayList<>();
            }
            heap[frequency].add(key);

        }

        int[] answer = new int[k];

        for(int index=0,i=nums.length;i>=0;i--){
            if(heap[i]==null){
                continue;
            }
            for(int j=0;index<k && j<heap[i].size();j++){
                answer[index]=heap[i].get(j);
                index++;
            }
        }

        return answer;







        
    }
}