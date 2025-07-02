class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack1 = new Stack<>();
    
        for(int a : asteroids){
            boolean destroyed=false;        
            if(a<0){
                while(!stack1.isEmpty() && stack1.peek()>0){
                    if(Math.abs(a)>stack1.peek()){
                        stack1.pop();
                    }
                    else if(Math.abs(a)==stack1.peek()){
                        stack1.pop();
                        destroyed=true;
                        break;
                    }
                    else{
                        destroyed=true;
                        break;
                    }
                }
                

                
            }
            if(!destroyed){
                stack1.push(a);
            }
        }
    int [] result = new int[stack1.size()];

    for(int i=result.length-1;i>=0;i--){        
            result[i]=stack1.pop();
    }

    return result;
}

    
}