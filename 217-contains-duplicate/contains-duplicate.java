class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> count = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
        }

        for(int key : count.keySet()){
            if(count.get(key)>1){
                return true;
            }
        }

        return false;
        
    }
}