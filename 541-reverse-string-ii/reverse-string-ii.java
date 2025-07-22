class Solution {
    public String reverseStr(String s, int k) {
        char[] reversearray= s.toCharArray();

        for(int i=0;i<reversearray.length;i+=2*k){
            int b=i;
            int a = Math.min(i+k-1 ,reversearray.length-1);
            while(b<a){
                char temp=reversearray[b];
                reversearray[b]=reversearray[a];
                reversearray[a]=temp;
                b++;
                a--;
            }
        }

        String result=new String(reversearray);

        return result;       
    }
}