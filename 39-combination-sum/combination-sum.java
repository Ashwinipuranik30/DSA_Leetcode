class Solution {
    private void backtrack(int[] canditates, int target, int index ,List<Integer> temp, List<List<Integer>> answer){
        if(target==0){
            answer.add(new ArrayList<>(temp));
            return;
        }
        for(int i=index;i<canditates.length && target>0;i++){
            temp.add(canditates[i]);
            backtrack(canditates,target-canditates[i],i,temp,answer);
            temp.remove(temp.size()-1);

        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        backtrack(candidates,target,0,new ArrayList<>() ,answer);
        return answer;
    }
}