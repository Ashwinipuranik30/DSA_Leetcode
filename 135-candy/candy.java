class Solution {
    public int candy(int[] ratings) {
        int[] candyPerChild = new int[ratings.length];
        for(int i=0;i<ratings.length;i++){
            candyPerChild[i]=1;
        }
        for(int i=1;i<ratings.length;i++){
            if(ratings[i]>ratings[i-1]){
                candyPerChild[i]=candyPerChild[i-1]+1;
            }
        }

        for(int i=candyPerChild.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                if(candyPerChild[i]<=candyPerChild[i+1]){
                    candyPerChild[i]=candyPerChild[i+1]+1;
                }
            }
        }


        int candies=0;
        for(int i=0;i<ratings.length;i++){
            candies+=candyPerChild[i];
        }

        return candies;
        
    }
}