class Solution {  
    List<Integer> [] dependent;
    boolean[] isVisited;
    boolean[] isExplored;
    Stack<Integer> stack1;

    private boolean isCyclic(int sub){
        isVisited[sub]=true;

        for(int course : dependent[sub]){
            if(!isVisited[course] && isCyclic(course)){
                return true;
            }
            else if(!isExplored[course]){
                return true;
            }

        }
        isExplored[sub]=true;
        stack1.push(sub);
        return false;
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        dependent = new List[numCourses];
        isVisited = new boolean[numCourses];
        isExplored = new boolean[numCourses];
        stack1= new Stack<>();

        for(int i=0;i<numCourses;i++){
            dependent[i] = new ArrayList<>();
        }
        for(int[] courses : prerequisites ){
            dependent[courses[1]].add(courses[0]);
        }

        for(int sub=0; sub<numCourses; sub++){
            if(!isVisited[sub] && isCyclic(sub)){
                return new int[0];
            }
        }

        int[] order = new int[numCourses];
        int index=0;

        while(!stack1.isEmpty()){
            order[index]=stack1.pop();
            index++;
        }

        return order;

        
        
    }
}