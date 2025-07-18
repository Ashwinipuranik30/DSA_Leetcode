class Solution {
    public String reversePrefix(String word, char ch) {
        char[] wordarray = word.toCharArray();
        int index=-1;
        for(int i=0;i<wordarray.length;i++){
            if(wordarray[i]==ch){
                index=i;
                break;
            }
        }

        if(index==-1){
            return word;
        }

        else{
            int start=0;
            int end=index;
            while(start<end){
                char b=wordarray[start];
                wordarray[start]=wordarray[end];
                wordarray[end]=b;
                start++;
                end--;
            }

            String result = new String(wordarray);
            return result;
        }
        
        
       
    }
}