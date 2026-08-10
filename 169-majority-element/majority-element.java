class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> Count_Map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            Count_Map.put(nums[i], Count_Map.getOrDefault(nums[i], 0) + 1);
        }

        for(Map.Entry<Integer,Integer> entry : Count_Map.entrySet()){
            if(entry.getValue() > nums.length/2){
                return entry.getKey();
            }
        }

        return -1;
                
        
    }
}