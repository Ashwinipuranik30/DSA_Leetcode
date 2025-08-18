class Solution {

    private int fibo(int n , int[] map){
        if(n<=1){
            map[n]=n;
            return n;
        }
        else if(map[n]!=-1){
           return map[n];
        }
        
        int a= fibo(n-1,map);
        int b = fibo(n-2,map);
        map[n]=a+b;
        return map[n];
    }


    public int fib(int n) {
        int[] map = new int[n+1];
        Arrays.fill(map,-1);
        return fibo(n,map);        
    }
}