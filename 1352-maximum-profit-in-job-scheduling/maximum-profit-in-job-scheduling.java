class Solution {

    private int binarySearch(int[] arr,int length,int searchValue){
        int start=0;
        int end=length-1;
        int result=0;

        while(start<=end){
            int mid= (start+end) /2;

            if(arr[mid]<=searchValue){
                result=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return result;
    }
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int[][] array = new int[startTime.length][3];

        for(int i=0;i<startTime.length;i++){
            array[i]= new int[3];
            array[i][0]=startTime[i];
            array[i][1]=endTime[i];
            array[i][2]=profit[i];
        }

        Arrays.sort(array , (a,b) -> Integer.compare(a[1],b[1]));

        int[] dp = new int[startTime.length+1];
        int[] endarray = new int[startTime.length+1];


        for(int i=0;i<array.length;i++){
            endarray[i+1]=array[i][1];
            int index = binarySearch(endarray,i+1,array[i][0]);
            int currProfit = dp[index] + array[i][2];

            
            dp[i+1]=Math.max(dp[i],currProfit);
          
        }


        return dp[dp.length-1];




        
        
    }
}