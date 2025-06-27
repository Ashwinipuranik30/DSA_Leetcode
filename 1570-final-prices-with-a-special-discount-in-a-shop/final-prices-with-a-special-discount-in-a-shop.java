class Solution {
    public int[] finalPrices(int[] prices) {
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(int i=prices.length-1 ; i>=0 ; i--){
            while(!stack.isEmpty() && prices[i]<stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                stack.push(prices[i]);
                map.put(i,prices[i]);
            }
            else{
                int a=prices[i]-stack.peek();
                map.put(i,a); 
                stack.push(prices[i]);       
            }

        }

        for(int i=0; i<prices.length ; i++){
            prices[i]=map.get(i);
            
        }

        return prices;
        
    }
}