class Solution {
    public int addDigits(int num) {
        if(num%10==num){
            return num;
        }
        int sum=0;
        while(num!=0){
            int remainder=num%10;
            sum += remainder;
            num/=10;
        }

        return addDigits(sum);
        
    }
}