class Solution {

    public boolean isPosible(int[] tasks, int[] workers, int pills, int strength,int k){
        Arrays.sort(tasks);
        Arrays.sort(workers);
        int j=workers.length-1;
        Deque<Integer> queue1 = new ArrayDeque<>();
        for(int i=k-1; i>=0;i--){
            while(j>=workers.length-k && workers[j]+strength>=tasks[i]){
                queue1.offer(workers[j]);
                j--;
            }
            if(queue1.isEmpty()){
                return false;
            }
            if(queue1.getFirst()>=tasks[i]){
                queue1.pollFirst();
            }
            else{
                if(pills==0){
                    return false;
                }
                else{
                    pills--;
                    queue1.pollLast();
                }
            }
        }

        return true;


    }


    public int maxTaskAssign(int[] tasks, int[] workers, int pills, int strength) {
        int min= 0;
        int max=Math.min(tasks.length,workers.length);

        while(max>=min){
            int mid=(min+max)/2;
            if (isPosible(tasks, workers, pills,strength,mid)){
                min=mid+1;
            }
            else{
                max=mid-1;
            }

        }

        return max;
        
    }
}