class Solution {
    public int totalMoney(int n) {
        int start=0;
        int remainder = n%7;
        int iteration = n/7;
        int money=0;

        while(start<iteration){
            int current = start+7;
            money+=((current*(current+1))/2) - ((start*(start+1))/2);
            start++;
        }
        int temp= start+remainder;

        return money + (temp*(temp+1))/2 - (start*(start+1))/2;

        

        
    }
}