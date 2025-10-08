class Solution {

    private int dfs (List<Integer>[] bom , int bomb, int length){
        int answer =0;
        boolean[] isVisited = new boolean[length];

        Deque<Integer> deque= new ArrayDeque<Integer>();

        isVisited[bomb]=true;
        deque.offer(bomb);

        while(!deque.isEmpty()){
            ++answer;
            int cur= deque.poll();

            for( int curbomb : bom[cur]){
                if(!isVisited[curbomb]){
                    isVisited[curbomb]=true;
                    deque.offer(curbomb);
                }
            }
        }

        return answer;



    }
    public int maximumDetonation(int[][] bombs) {
        int n = bombs.length;
        List<Integer>[] bom = new List[n];

        for(int i=0; i<n;i++){
            bom[i]=new ArrayList<Integer>();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    int x1 = bombs[i][0];
                    int y1 = bombs[i][1];
                    int x2 = bombs[j][0];
                    int y2 = bombs[j][1];
                    int r = bombs[i][2];

                    if((long) (x1-x2) * (x1-x2) + (long) (y1-y2) * (y1-y2) <= (long) r*r){
                        bom[i].add(j);
                    }
                }
            }
        }

        int answer=0;

        for(int bomb=0; bomb<n ;bomb++){
            int ans = dfs(bom,bomb,n);
            answer=Math.max(answer,ans);
        }

        return answer;




    



        
        
    }
}