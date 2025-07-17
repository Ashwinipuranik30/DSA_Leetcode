class Solution {
    public int largestAltitude(int[] gain) {

        int[] netgain= new int[gain.length+1];

        netgain[0]=0;
        for(int i =0;i<gain.length;i++){
            netgain[i+1]=gain[i]+netgain[i];
        }

        int highest_altitude=netgain[0];
        for(int i =0;i<netgain.length;i++){
            if(highest_altitude<netgain[i]){
                highest_altitude=netgain[i];
            }
        }

        return highest_altitude;


        
    }
}