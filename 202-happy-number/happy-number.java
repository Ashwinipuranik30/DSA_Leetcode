class Solution {
    public boolean isHappy(int n) {
        if(n==1 || n==7){
            return true;
        }
        
        else if(n<=6){
            return false;
        }
        int square=0;
        while(n!=0){
            int remainder=n%10;
            square+= remainder * remainder;
            n=n/10;
        }

        return isHappy(square);


        
    }
}