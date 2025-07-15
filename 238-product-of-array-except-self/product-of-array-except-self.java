class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int p =1;
        prefix[0]=p;

        for(int i=1; i<nums.length;i++){
            prefix[i]=p*nums[i-1];
            p=prefix[i];            
        }

        int prod=1;

        for(int i=nums.length-1 ; i>=0;i--){
            prefix[i]=prod*prefix[i];
            prod=prod*nums[i];           
        }

        return prefix;

        
    }
}