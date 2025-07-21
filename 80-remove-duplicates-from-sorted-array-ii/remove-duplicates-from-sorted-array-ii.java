class Solution {
    public int removeDuplicates(int[] nums) {
        int uniqueAllowed=2;

        for(int i=2;i<nums.length;i++){
            
            if(nums[i]!=nums[uniqueAllowed-2]){           
                nums[uniqueAllowed]=nums[i];
                uniqueAllowed++;           
            }            
        }

        return uniqueAllowed;
        
    }
}