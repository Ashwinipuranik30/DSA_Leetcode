class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        int[] answer= new int[k];
        int index=0;

        for(int i=0;i<nums.length;i++){
            while(index!=0 && nums[i]<answer[index-1] && nums.length-1+index-i>=k ){
                index--;
            }
            if(index<k){
                answer[index++]=nums[i];
            }
        }

        return answer;
    }
}