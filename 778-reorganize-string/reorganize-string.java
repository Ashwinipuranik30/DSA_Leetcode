class Solution {
    public String reorganizeString(String s) {
        int[] freq= new int[26];

        for(char ch : s.toCharArray()){
            ++freq[ch-'a'];            
        }

        PriorityQueue<Character> maxheap = new PriorityQueue<>((a,b)-> freq[b-'a']- freq[a-'a']);

        for(char ch='a'; ch<='z';ch++ ){
            if(freq[ch-'a']>0){
                 maxheap.offer(ch);
            }
        }

        
        char[] result = new char[s.length()];
        int index=0;
        while(!maxheap.isEmpty()){
            char c = maxheap.poll();
            int frequency= freq[c-'a'];        
            while(frequency!=0){
                result[index]=c;
                index+=2;
                if(index>=s.length()){
                    index=1;
                }
                frequency--;
            }

        }

        for(int i=1;i<result.length;i++){
            if(result[i-1]==result[i]){
                return "";
            }
        }
        return new String(result);


     
        
    }
}