class Solution {
    public long numberOfWeeks(int[] milestones) {
        long max=milestones[0];
        long sum=0;
        for(int i=0;i<milestones.length;i++){
            max=Math.max(max,milestones[i]);
            sum+=milestones[i];
        }

        sum=sum-max;

        
        if(max-sum<=1){
            return max+sum;
        }
        else{
            return sum*2+1;
        }
        
    }
}