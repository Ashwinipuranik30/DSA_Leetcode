class Solution {
    public int minSwaps(int[] nums) {

        int totalones =0;
        int groupedOnes=0;

        for(int i=0; i<nums.length;i++){
            if(nums[i]==1){
                totalones++;
            }
        }
        if(totalones==0 || totalones==nums.length) return 0;
        int currentone=0;

        for(int i=0; i<nums.length*2; i++){
            currentone += nums[i%nums.length];
            if(i>=totalones){
                currentone-=nums[ (i- totalones)%nums.length];
            }
            groupedOnes=Math.max(groupedOnes,currentone);
        }

        return totalones-groupedOnes;
        
    }
}