class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        int counterzero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
            else{
                counterzero++;
            }
        }
        while(counterzero!=0){
            nums[j]=0;
            j++;
            counterzero--;
        }


        


        
    }
}