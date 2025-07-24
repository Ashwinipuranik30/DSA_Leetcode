class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        List<List<Integer>> result = new ArrayList<>();

        PriorityQueue<int[]> minheap = new PriorityQueue<>(
    (a, b) -> (nums1[a[0]] + nums2[a[1]]) - (nums1[b[0]] + nums2[b[1]])
);
        
    
        for(int i=0;i<nums1.length;i++){
            minheap.offer(new int[] {i,0});
        }
        
        while(k>0 && !minheap.isEmpty()){
            int[] pair = minheap.poll();
            result.add(Arrays.asList(nums1[pair[0]],nums2[pair[1]]));
            if(pair[1]+1 < nums2.length){
                minheap.offer(new int[] {pair[0],pair[1]+1});
            }
            k--;
        }

        return result;
        
    }
}