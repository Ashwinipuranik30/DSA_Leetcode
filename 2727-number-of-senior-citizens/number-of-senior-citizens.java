class Solution {
    public int countSeniors(String[] details) {
        int count=0;

        for(String c : details){
            int a = Integer.parseInt(c.substring(11,13));

            if(a>60){
                count++;
            }
        }

        return count;
        
    }
}