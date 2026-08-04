class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        int m=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                m++;
            }
        }

        k=nums.length-m;

        int p= nums.length-1;
        int p1=0;
        for(int i=0 ;i<k;i++){
            while(nums[i]==val){
                if(nums[p]!=val){
                    nums[i]=nums[p];
                    p--;
                }
                else{
                    p--;
                }
                
            }
        }

        return k;
        
    }
}