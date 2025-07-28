class Solution {
    public int minimumDeviation(int[] nums) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>((a,b)-> b-a);
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                maxheap.offer(nums[i]);
                min=Math.min(min,nums[i]);
            }
            else{
                maxheap.offer(nums[i]*2);
                min=Math.min(min,nums[i]*2);
            }
            
        }
        
        int max_deviation = Integer.MAX_VALUE;

        while(!maxheap.isEmpty()){
            int max = maxheap.poll();
            max_deviation= Math.min(max_deviation,max-min);
            if(max%2==0){
                maxheap.offer(max/2);
                min=Math.min(min,max/2);
            }
            else{
                break;
            }
        }

        return max_deviation;

        






        
    }
}