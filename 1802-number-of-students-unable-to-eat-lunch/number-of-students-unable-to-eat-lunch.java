class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int circle=0;
        int square=0;
        for(int a : students){
            if(a==1){
                square++;
            }
            else{
                circle++;
            }
        }
        int count=0;
        for(int b :sandwiches  ){
            if(b==0 && circle>0){
                circle--;
                count++;
            }
            else if(b==1 && square>0){
                square--;
                count++;
            }
            else{
                break;
            }
        }

        return sandwiches.length-count;
        
    }
}