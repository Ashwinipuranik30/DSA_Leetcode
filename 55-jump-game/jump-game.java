class Solution {
    public boolean canJump(int[] nums) {
        
      
        int index=0;
        int max=0;
        
        while(index<(nums.length-1)){
            if(max<index){
                break;
            }
            max=Math.max(max,index+nums[index]);
            index++;
            if (max >= nums.length - 1) return true;
        }
        if(max>=(nums.length-1)){
            return true;
        }
        else{
            return false;
        }
        
    }
}