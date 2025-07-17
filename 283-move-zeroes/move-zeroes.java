class Solution {
    public void moveZeroes(int[] nums) {
        int[] temp=new int[nums.length];
        int j=0;
        int counterzero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                temp[j]=nums[i];
                j++;
            }
            else{
                counterzero++;
            }
        }
        for(int i=1;i<=counterzero;i++){
            temp[j]=0;
            j++;
        }

        for(int i=0;i<nums.length;i++){
            nums[i]=temp[i];
        }

        
    }
}