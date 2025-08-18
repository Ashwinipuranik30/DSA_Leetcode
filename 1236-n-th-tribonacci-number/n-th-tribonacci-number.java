class Solution {

    private int trio(int n,int[] memo){
        if(n==0){
            memo[0]=0;
            return 0;
        }
        else if(n<=2){
            memo[n]=1;
            return 1;
        }
        else if(memo[n]!=-1){
            return memo[n];
        }

        int a=trio(n-1,memo);
        int b=trio(n-2,memo);
        int c= trio(n-3,memo);
        memo[n]=a+b+c;
        return memo[n];


    }
    public int tribonacci(int n) {
        int[] map = new int[n+1];
        Arrays.fill(map,-1);
        return trio(n,map);       
    }
}