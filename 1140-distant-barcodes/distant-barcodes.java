class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {

        int[] frequency = new int[10001];
        PriorityQueue<Integer> maxheap = new PriorityQueue<>((barcode1,barcode2)->frequency[barcode2]-frequency[barcode1]) ;

        for(int i=0; i<barcodes.length;i++){
            ++frequency[barcodes[i]];
        }

        for(int i=1; i<=10000;i++){
            if(frequency[i]!=0){
                maxheap.offer(i);
            }
        }

        int index=0;
        while(!maxheap.isEmpty()){
            int barcode=maxheap.poll();
            int freq=frequency[barcode];
            while(freq!=0){
                barcodes[index]=barcode;
                index+=2;

                if(index>=barcodes.length){
                    index=1;
                }
                freq--;

            }
            
        }

        return barcodes;

        
    }
}