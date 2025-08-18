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
        if(n<=1){
            return n;
        } 
        map[0]=0; 
        map[1]=1;
        for(int i=2;i<map.length;i++){
            int a=map[i-1];
            int b=map[i-2];
            map[i]=a+b;
        }
        return map[n]; 

    }
}