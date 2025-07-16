class Solution {
    public int minOperations(int[] nums) {
        int incrementcount=0;

        if(nums.length==1){
            return incrementcount;
        }
        

        for(int i=1;i<nums.length;i++){
            int a=0;
            if(nums[i]<=nums[i-1]){
                a=(nums[i-1]-nums[i])+1;
                nums[i]=nums[i]+a;
                incrementcount+=a;
            }
        }

        return incrementcount;


        
    }
}