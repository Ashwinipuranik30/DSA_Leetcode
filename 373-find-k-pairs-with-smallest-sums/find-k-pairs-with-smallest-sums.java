class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        List<List<Integer>> result = new ArrayList<>();

        PriorityQueue<List<Integer>> minheap = new PriorityQueue<>((list1,list2)-> list1.get(3)-list2.get(3));
        
        int index=0;
        for(int i=0;i<nums1.length;i++){
            List<Integer> list = new ArrayList<>();
            list.add(nums1[i]);
            list.add(nums2[index]);
            list.add(index);
            list.add(nums1[i]+nums2[index]);
            minheap.offer(list);
        }
        int i=0;
        while(i<k){
            List<Integer> list1= new ArrayList<>();
            list1=minheap.poll();
            result.add(new ArrayList<>());
            result.get(i).add(list1.get(0));
            result.get(i).add(list1.get(1));
            i++;
            int a=list1.get(2)+1;
            if(a<nums2.length){
                int b=list1.get(0);
                List<Integer> list = new ArrayList<>();
                list.add(b);
                list.add(nums2[a]);
                list.add(a);
                list.add(b+nums2[a]);
                minheap.offer(list);
            }
                   
        }

        return result;
        
    }
}