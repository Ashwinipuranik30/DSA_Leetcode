class Solution {
    public String reverseWords(String s) {
       /* String[] words = s.split(" ");

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

        StringBuilder result = String.join(" ", words ); 
        return result; */



        StringBuilder result = new StringBuilder();
        int start=0;

        for(int end=0;end<=s.length();end++){
            if(end==s.length() || s.charAt(end)==' '){
                for(int j=end-1;j>=start;j--){
                    result.append(s.charAt(j));
                }
                if(end!=s.length()){
                    result.append(" ");
                }
                start=end+1;
            }
        }

        return result.toString();
        
    }
}