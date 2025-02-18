class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result=0.0;

        int m= nums1.length;
        int n = nums2.length;

        ArrayList<Integer> mergearray = new ArrayList<>();

        for (int i=0 ; i< nums1.length ; i++){
            mergearray.add(nums1[i]);
        }
        for (int i=0 ; i< nums2.length ; i++){
            mergearray.add(nums2[i]);
        }


        Collections.sort(mergearray);

        if((m+n)%2==0){
            int b = mergearray.size() /2;
            result= ((mergearray.get(b-1) + mergearray.get(b)) / 2.0);
        }
        else{
            int b = (mergearray.size()-1)/2;
            result = mergearray.get(b);
        }
        
    return result;
        
    }
    
}