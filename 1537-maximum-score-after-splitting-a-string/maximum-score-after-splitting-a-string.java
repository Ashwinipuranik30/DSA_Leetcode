class Solution {
    public int maxScore(String s) {
        char[] chararray = s.toCharArray();

        int[] sumofone= new int[chararray.length];
        int counterone=0;
        int max=0;
        int countzero=0;
        int score=0;

        for(int i=chararray.length-1;i>=0;i--){
            if(chararray[i]=='1'){
                counterone++;
                sumofone[i]=counterone;
            }
            else{
                sumofone[i]=counterone;
            }
        }

        for(int i=0;i<chararray.length-1;i++){
            if(chararray[i]=='0'){
                countzero++;
            }
            score=countzero+sumofone[i+1];
            max=Math.max(max,score);
        }

        return max;

        
    }
}