class Solution {
    public int trap(int[] height) {
        int[] maxleft = new int[height.length];
        int[] maxright = new int[height.length];
    
        int trappedWaterArea=0;


        maxleft[0]=height[0];

        for(int i=1;i<height.length;i++){
            maxleft[i]=Math.max(maxleft[i-1],height[i]);
        }

        maxright[height.length-1]=height[height.length-1];

        for(int i=height.length-2; i>=0; i--){
            maxright[i]=Math.max(maxright[i+1],height[i]);
        }


        for(int i=0;i<height.length;i++){
            height[i] = Math.min(maxleft[i],maxright[i]) -  height[i];
            trappedWaterArea+=height[i];
        }

        return trappedWaterArea;






        
    }
}