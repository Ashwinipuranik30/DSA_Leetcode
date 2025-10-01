class Solution {
    List<Integer>[] dependent;
    boolean[] isVisited;
    boolean[] isExplored;

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
        return false;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        dependent = new List[numCourses];
        isVisited = new boolean[numCourses];
        isExplored = new boolean[numCourses];

        for(int i=0;i<numCourses;i++){
            dependent[i] = new ArrayList<>();
        }
        for(int[] courses : prerequisites ){
            dependent[courses[0]].add(courses[1]);
        }

        for(int sub=0; sub<numCourses; sub++){
            if(!isVisited[sub] && isCyclic(sub)){
                return false;
            }
        }

        return true;
        
    }
}