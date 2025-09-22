class Solution {
    int length;
    Map<Integer,Integer> map1;
    List<List<Integer>> answer;

    private void backtrack(List<Integer> temp){
        if(temp.size()==length){
            answer.add(new ArrayList<>(temp));
            return;
        }
        for(int num : map1.keySet()){
            int count=map1.get(num);
            if(count==0){
                continue;
            }
            temp.add(num);
            map1.put(num,count-1);

            backtrack(temp);

            temp.remove(temp.size()-1);
            map1.put(num,count);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        length=nums.length;
        map1 = new HashMap<>();
        for(int num:nums){
            map1.put(num,map1.getOrDefault(num,0)+1);
        }
        answer = new ArrayList<>();
        backtrack(new ArrayList<Integer>()); 
        return answer;      
    }
}