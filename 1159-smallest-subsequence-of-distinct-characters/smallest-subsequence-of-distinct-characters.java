class Solution {
    public String smallestSubsequence(String s) {
        int[] freq = new int[26];
        boolean[] presence = new boolean[26];

        for( char c : s.toCharArray()){
            freq[c-'a']++;
        }
        
        Stack<Character> stack1 = new Stack<>();

        for(char c : s.toCharArray()){
           freq[c-'a']--;
           if(presence[c-'a']==true){
            continue;
           }
           while(!stack1.isEmpty() && stack1.peek()>c && freq[stack1.peek() -'a']>0){
                    presence[stack1.peek() -'a']=false;
                    stack1.pop();                
            }
            stack1.push(c);
            presence[c-'a']=true;
        }

        StringBuilder a = new StringBuilder();
        while(!stack1.isEmpty()){
            a.insert(0,stack1.pop());
        }

        return a.toString();

        
    }
}