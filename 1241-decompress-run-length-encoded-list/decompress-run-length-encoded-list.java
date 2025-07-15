class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int freq=0;
        int val=0;
        for(int i=0;i<nums.length;i=i+2){
            freq=nums[i];
            val=nums[i+1];

            while(freq!=0){
                list.add(val);
                freq--;
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();

    }
}