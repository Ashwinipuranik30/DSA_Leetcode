class Solution {
    public int longestSubarray(int[] nums, int limit) {

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((arr1,arr2)->arr2[0]-arr1[0]);
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((arr1,arr2)->arr1[0]-arr2[0]);

        int left=0;
        int maxlength=0;
        for(int right=0;right<nums.length;right++){
            maxHeap.offer(new int[] {nums[right],right});
            minHeap.offer(new int[] {nums[right],right});

            while((maxHeap.peek()[0]-minHeap.peek()[0]) > limit){
                left=Math.min(maxHeap.peek()[1],minHeap.peek()[1])+1;            

                while(maxHeap.peek()[1] < left){
                    maxHeap.poll();
                }

                while(minHeap.peek()[1] < left){
                    minHeap.poll();
                }
            }
            maxlength=Math.max(maxlength,right-left+1);
            
        }

        return maxlength;

        
        
    }
}