class Solution {
    public double myPow(double x, int n) {
        long m=n;
        if(m<0){
            m=-m;
            x=1/x;
        }

        double pow=1;

        while(m!=0){
            if(m%2==1){
                pow*=x;
            }
            x*=x;
            m/=2;
        }

        return pow;
        
    }
}