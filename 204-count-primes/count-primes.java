class Solution {
    public int countPrimes(int n) {
        boolean[] isPrime= new boolean[n];
        int countprime=0;


        for(int i=2; i*i<n ;i++){
            if(!isPrime[i]){
                for(int j=i+i;j<n;j+=i){
                    isPrime[j]=true;
                }
            }        
            
        }

        for(int i=2;i<n;i++){
            if(!isPrime[i]){
                ++countprime;
            }
        }

        return countprime;
        
    }
}