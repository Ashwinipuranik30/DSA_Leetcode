class Solution {

    //private int rob_mem(int index ,int[] map, int[] nums){
        //if(index>=map.length){
           // return 0;
        //}
        //if(map[index]!=-1){
            /*return map[index];
        }
        
        int a=rob_mem(index+2,map,nums)+ nums[index];
        int b=rob_mem(index+1,map,nums);

        map[index]=Math.max(a,b);
        return map[index];


    }*/
    public int rob(int[] nums) {
        //int[] mem= new int[nums.length];
        //Arrays.fill(mem,-1);
        //return rob_mem(0,mem,nums);

        int a= 0;
        int b=nums[0];
        for(int i=1 ; i<nums.length;i++){
            int c=Math.max(a+nums[i],b);
            a=b;
            b=c;
        }
        return b;


        
    }
}