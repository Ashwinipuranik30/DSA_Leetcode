class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count= 0;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed.length==1 && flowerbed[0]==0){
                return true;     
            }
            if(i==0 && flowerbed[i]==0 && flowerbed[i+1]==0){
                flowerbed[i]=1;
                count++;
            }
            else if(i==flowerbed.length-1 && flowerbed[i]==0 && flowerbed[i-1]==0){
                flowerbed[i]=1;
                count++;
            }
            else if(i!=0 && i!=flowerbed.length-1 && flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0){
                flowerbed[i]=1;
                count++;
            }
           
        }
        
        if(count>=n){
            return true;
        }
        else{
            return false;
        }
        
    }
}