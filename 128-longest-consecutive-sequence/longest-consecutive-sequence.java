class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }

        int answer=1;
        int result =1;
        Arrays.sort(nums);

        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1]==1 ){
                ++answer;
            }
            if(nums[i]-nums[i-1]!=1 && nums[i]-nums[i-1]!=0){
                answer=1;
            }

            result=Math.max(result,answer);
            
 
        }

        return result;

    
        
    }
}