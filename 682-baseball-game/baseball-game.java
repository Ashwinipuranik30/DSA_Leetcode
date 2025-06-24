class Solution {
    public int calPoints(String[] operations) {
        int[] result = new int[operations.length];
        int index = 0; 
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                result[index] = result[index-1]+ result[index-2];
                ++index;
            }
            else if (operations[i].equals("C")){
                --index;
            }
            else if (operations[i].equals("D")){
                result[index]=2*result[index-1];
                ++index;
            }
            else{
                result[index]=Integer.parseInt(operations[i]);
                ++index;
            }

            

        }

        int answer = 0;

        while(--index!=-1){
            answer+=result[index];
        }
        return answer;

       

        


        
    }
}