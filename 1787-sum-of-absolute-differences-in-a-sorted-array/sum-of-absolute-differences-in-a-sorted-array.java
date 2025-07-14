class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] sum = new int[nums.length];
        int[] result = new int[nums.length];
        sum[0]=nums[0];
        for(int i=1; i<nums.length;i++){
            sum[i]=sum[i-1]+nums[i];
        }

        int right=0;
        int left=0;

        for(int i=0;i<nums.length;i++){
            if(i==0){
                left=sum[nums.length-1]-nums[i]*(nums.length-i);
                right=nums[i]*(i+1)-sum[0];
            }
            else{
                left=(sum[nums.length-1]-sum[i-1])-(nums[i]*(nums.length-i));
                right=nums[i]*(i+1)-sum[i];
            }
            result[i]=left+right;
        }

        return result;
        
    }
}