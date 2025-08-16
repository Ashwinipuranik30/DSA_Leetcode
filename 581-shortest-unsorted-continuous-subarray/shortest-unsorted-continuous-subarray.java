class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int a=-1;
        int b=-1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                a=i;
                break;
            }
        }
        if(a==-1){
            return 0;
        }
        int min=nums[a];
        for(int i=a;i<nums.length;i++){
            min=Math.min(min,nums[i]);
        }

        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]>nums[i+1]){
                b=i;
                break;
            }
        }
        int max=nums[b];
        for(int i=b;i>=0;i--){
            max=Math.max(max,nums[i]);
        }

        int low=0;
        int high=nums.length-1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>min){
                low=i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<max){
                high=i;
                break;
            }
        }

        return low<=high ? high-low+1 : 0;

        
    }
}