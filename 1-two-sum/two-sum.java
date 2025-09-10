class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map1= new HashMap<>();
        int[] result = new int[2];

        for(int i=0;i<nums.length;i++){
            int a= target-nums[i];
            if(map1.containsKey(a)){
                result[0]=map1.get(a);
                result[1]=i;        
            }
            map1.put(nums[i],i);
        }

        return result;
    }
}
