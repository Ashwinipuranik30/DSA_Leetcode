class Solution {

    private int rob_bottomup(int[] nums,int[] map,int index){
        if(index>=map.length){
            return 0;
        }
        if(map[index]!=-1){
            return map[index];
        }
        int a= rob_bottomup(nums,map,index+2) + nums[index%nums.length];
        int b=rob_bottomup(nums,map,index+1);
        map[index]=Math.max(a,b);
        return map[index];

    }
    public int rob(int[] nums) {
        /*int a=0;
        int b=nums[0];
        if(nums.length==1){
            return nums[0];
        }
        for(int i=1; i<nums.length*2 ; i++){
            int c = Math.max(a+nums[i%nums.length],b);
            a=b;
            b=c;
        }


        int u= nums[0];
        int j=0;
        for(int i=1;i<nums.length;i++){
            int g=Math.max(j+nums[i],u);
            j=u;
            u=g;
        }
        
        return b-u;*/

        int[] memo = new int[nums.length];
        int [] mem = new int[nums.length*2];
        Arrays.fill(memo,-1);
        Arrays.fill(mem,-1);
        return nums.length==1 ? nums[0] : rob_bottomup(nums,mem,0)-rob_bottomup(nums,memo,0);
        
    }
}