class Task{
    int id;
    int enqueueTime;
    int processingTime;
    public Task(int id , int enqueueTime,int processingTime ) {
        this.id=id;
        this.enqueueTime=enqueueTime;
        this.processingTime=processingTime;
    }
}
class Solution {
    public int[] getOrder(int[][] tasks) {
        Task[] task= new Task[tasks.length];

        for(int i=0;i<tasks.length;i++){
            task[i]= new Task(i,tasks[i][0],tasks[i][1]);
        }

        Arrays.sort(task, (task1,task2)-> task1.enqueueTime-task2.enqueueTime);

        PriorityQueue<Task> minheap = new PriorityQueue<>((task1,task2)->{
            if(task1.processingTime==task2.processingTime){
                return task1.id-task2.id;
            }
            else{
                return task1.processingTime-task2.processingTime;
            }
        });

        int i=0;
        int time=0;
        int index=0;
        int[] taskorder = new int[tasks.length];
        while(index<tasks.length){
            while(i<tasks.length && task[i].enqueueTime<=time){
                minheap.offer(task[i]);
                i++;
            }
            if(minheap.isEmpty()){
                time=task[i].enqueueTime;
                continue;
            }

            Task currenttask =minheap.poll();
            taskorder[index]=currenttask.id;
            time+=currenttask.processingTime;
            index++;

        }

        return taskorder;


        
    }
}