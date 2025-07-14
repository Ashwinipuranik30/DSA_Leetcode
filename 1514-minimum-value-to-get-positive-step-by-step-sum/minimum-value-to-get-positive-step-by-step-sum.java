class Solution {
    public int minStartValue(int[] nums) {
        for(int i=1; i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i];
        }
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            if(min>nums[i]){
                min=nums[i];
            }
        }
        if(min<0){
            return Math.abs(min)+1;
        }
        else{
            return 1;
        }
        
        
    }
}