class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        if(sentence1.length()>sentence2.length()){
            return areSentencesSimilar(sentence2,sentence1);
        }

        String[] s1 = sentence1.split(" ");
        String[] s2 = sentence2.split(" ");

        int n1= s1.length;
        int n2=s2.length;
        int i=0;

        while(i<n1 && s1[i].equals(s2[i])){
            i++;
        }

        int j=0;

        while(j<n1-i && s1[n1-1-j].equals(s2[n2-1-j])){
            j++;
        }

        return i+j==n1;




        
    }
}