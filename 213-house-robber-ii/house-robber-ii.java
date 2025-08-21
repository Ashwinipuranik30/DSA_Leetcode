class Solution {
    public int rob(int[] nums) {
        int a=0;
        int b=nums[0];
        if(nums.length==1){
            return nums[0];
        }
        for(int i=1; i<nums.length*2 ; i++){
            int c = Math.max(a+nums[i%nums.length],b);
            a=b;
            b=c;
        }


        int u= nums[0];
        int j=0;
        for(int i=1;i<nums.length;i++){
            int g=Math.max(j+nums[i],u);
            j=u;
            u=g;
        }
        
        return b-u;


        
    }
}