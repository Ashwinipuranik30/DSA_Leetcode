class Solution {
    public int removeDuplicates(int[] nums) {
        int unique=0;
        
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1 || nums[i]!=nums[i+1]){
                nums[unique]=nums[i];
                unique++;
            }
        }

        return unique;
        
    }
}