class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char[] chararray = s.toCharArray();
        

        for(int i=shifts.length-2;i>=0;i--){
            shifts[i]= (shifts[i]+shifts[i+1]) %26;
        }

        for(int i=0;i<shifts.length;i++)
        {
            int output = ((int)(chararray[i]-'a') + shifts[i])%26;
            chararray[i] = (char) (output + 'a');
        }

        String result= new String(chararray);

        return result;
        
    }
}