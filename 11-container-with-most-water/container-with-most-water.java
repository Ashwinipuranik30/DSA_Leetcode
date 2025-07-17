class Solution {
    public int maxArea(int[] height) {
       int start=0;
       int end=height.length-1;
       int area=0;
       int maxarea=0;

       while(start<end){
        if(height[start]<=height[end]){
            area=height[start]*(end-start);
            maxarea=Math.max(maxarea,area);
            start++;
        }
        else{
            area=height[end]*(end-start);
            maxarea=Math.max(maxarea,area);
            end--;
        }

       }
       return maxarea;
    }
}