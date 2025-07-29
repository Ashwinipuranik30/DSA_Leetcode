class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int[][] array = new int[speed.length][2];

        for(int i=0;i<speed.length;i++){
            array[i][0]=speed[i];
            array[i][1]=efficiency[i];        
        }

        Arrays.sort(array,(array1,array2)->array2[1]-array1[1]);

        PriorityQueue<Integer>minheap = new PriorityQueue<>((a,b)-> a-b);

        int i=0;
        long MaxPerformance=0;
        long sum=0;
        for(int[] arr : array){
            if(minheap.size()==k){
                sum=sum-minheap.poll();
            }
            minheap.offer(arr[0]);
            sum+=arr[0];            
            int eff=arr[1];
            MaxPerformance=Math.max(MaxPerformance,sum*eff);

        }

        return (int) (MaxPerformance%1000_000_007);
        


        




        
        
    }
}