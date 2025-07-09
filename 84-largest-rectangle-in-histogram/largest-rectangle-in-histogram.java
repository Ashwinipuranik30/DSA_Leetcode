class Solution {
    public int largestRectangleArea(int[] heights) {
        int max =0;
        Stack<Integer> stack1 = new Stack<>();
        int h=0;
        int l=0;

        for(int i=0; i<=heights.length ;i++){
            while(!stack1.isEmpty() && (i==heights.length || heights[i]<heights[stack1.peek()]))   {
                h=heights[stack1.pop()];
                l=stack1.isEmpty() ? i : i-stack1.peek()-1;
                max=Math.max(max,l*h);
            }
            stack1.push(i);
        }

        return max;
        
    }
}