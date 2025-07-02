class Solution {
    public List<String> buildArray(int[] target, int n) {
        Stack<Integer> stack1 = new Stack<>();
        List<String> result = new ArrayList<>();
        int j=0;

        for(int i=target.length-1 ; i >=0 ;i--){
            stack1.push(target[i]);
        }

        for(int i =1 ; i<=n; i++){
            result.add("Push");
            ++j;
            if(target[target.length-1]==j){
                break;
            }
            else if(!stack1.isEmpty() && stack1.peek()==i){
                stack1.pop();
            }
            else{
                result.add("Pop");
            }
        }

        return result;
        
    }
}