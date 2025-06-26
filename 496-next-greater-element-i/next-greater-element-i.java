class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack1 = new Stack<>();
        Map<Integer ,Integer> map1 = new HashMap<>();

        for(int i=nums2.length-1 ; i>=0 ; i--){
            while(!stack1.isEmpty() && stack1.peek()<=nums2[i]){
                stack1.pop();
            }
            int top = stack1.isEmpty() ? -1 : stack1.peek();
            map1.put(nums2[i],top);
            stack1.push(nums2[i]);
            
        }

        for(int i=0 ; i<nums1.length;i++){
            nums1[i]=map1.get(nums1[i]);
        }

        return nums1;
        
    }
}