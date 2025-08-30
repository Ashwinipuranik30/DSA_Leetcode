class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            intersect(nums2,nums1);
        }

        Map<Integer,Integer> map1 = new HashMap<>();

        for(int i=0; i<nums1.length;i++){
            map1.put(nums1[i],map1.getOrDefault(nums1[i],0)+1);
        }

        List<Integer> answer = new ArrayList<>();

        for(int i=0;i<nums2.length;i++){
            if( map1.containsKey(nums2[i]) && map1.get(nums2[i])>0 ){
                answer.add(nums2[i]);
                map1.put(nums2[i],map1.get(nums2[i])-1);
            }
        }

        int[] result = new int[answer.size()];

        for(int i=0;i<result.length;i++){
            result[i]=answer.get(i);
        }

        return result;
        
    }
}