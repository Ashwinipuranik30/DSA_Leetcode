class Solution {
    public int longestConsecutive(int[] nums) {
       /* if(nums.length==0){
            return 0;
        }

        int answer=1;
        int result =1;
        Arrays.sort(nums);

        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1]==1 ){
                ++answer;
            }
            if(nums[i]-nums[i-1]!=1 && nums[i]-nums[i-1]!=0){
                answer=1;
            }

            result=Math.max(result,answer);
            
 
        }

        return result; 
        */


        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int longest=0;

        for(int num : set){
            if(!set.contains(num-1)){
                int curr=num;
                int length=1;
                while(set.contains(curr+1)){
                    curr++;
                    length++;
                }

                longest=Math.max(length,longest);

            }
        }

        return longest;        
    }
}