class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");

        for(int i=0;i<words.length;i++){
            char[] a = words[i].toCharArray();
            int start=0;
            int end=a.length-1;
            while(start<end){
                char temp=a[start];
                a[start]=a[end];
                a[end]=temp;
                start++;
                end--;
            }
            words[i]= new String(a);
        }

        String result = String.join(" ", words ); 
        return result;
        
    }
}