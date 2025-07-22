class Solution {
    private boolean isVowel(char ch){
        char character = Character.toLowerCase(ch);
        return character=='a' || character=='e' || character=='i' || character=='o' || character=='u';
    }
    public String reverseVowels(String s) {
        char[] chararray = s.toCharArray();
        int start=0;
        int end=chararray.length-1;

        while(start<end){
            while( start<end && !isVowel(chararray[start])){
                start++;
            }
            while(start<end && !isVowel(chararray[end])){
                end--;
            }           
            char temp=chararray[start];
            chararray[start]=chararray[end];
            chararray[end]=temp;
            start++;
            end--;  
        }

        String result = new String(chararray);
        return result;
        
    }
}