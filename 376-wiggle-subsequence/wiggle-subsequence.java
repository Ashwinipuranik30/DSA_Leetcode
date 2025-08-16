class Solution {
    public int wiggleMaxLength(int[] nums) {

        int positive=1;
        int negative=1;

        for(int i=1;i<nums.length;i++){
            if((nums[i]-nums[i-1])<0){
                negative=positive+1;
            }
            else if((nums[i]-nums[i-1])>0){
                positive=negative+1;
            }
        }

        return Math.max(positive,negative);
        
    }
}