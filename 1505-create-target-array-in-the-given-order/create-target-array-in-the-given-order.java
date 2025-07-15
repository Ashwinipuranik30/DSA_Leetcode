class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        int count=0;

        for(int i=0;i<nums.length;i++){
            if(index[i]==count){
                target[index[i]]=nums[i];
                count++;
            }
            if(count>index[i]){
                int j=i;
                while(j!=index[i]){
                    target[j]=target[j-1];
                    j--;
                }
                target[index[i]]=nums[i];
                count++;

            }
        }

        return target;
        
    }
}