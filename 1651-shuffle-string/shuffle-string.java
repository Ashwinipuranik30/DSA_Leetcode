class Solution {
    public String restoreString(String s, int[] indices) {
        char[] a = new char[indices.length];
        int i=0;

        for(char c : s.toCharArray()){
            a[indices[i]]=c;
            i++;
        }
        String result = new String(a);

        return result;


  }
}