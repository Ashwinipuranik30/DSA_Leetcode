class Solution {
    public boolean isPossible(int[] target) {
        long sum=0;
        PriorityQueue<Integer> maxheap = new PriorityQueue<>((a,b)->b-a);

        for(int nums :target){
            maxheap.offer(nums);
            sum+=nums;
        }

        while(maxheap.peek()!=1){
            int a=maxheap.poll();
            sum-=a;
            if(sum==1){
                return true;
            }
            if(sum==0 || sum>=a || a%sum==0){
                return false;
            }
            a%=sum;
            sum+=a;
            maxheap.offer(a);
        }
        return true;
        
    }
}