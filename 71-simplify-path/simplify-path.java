class Solution {
    public String simplifyPath(String path) {
        String[] parts = path.split("/");
        Stack<String> stack1 = new Stack<>();

        for(String c : parts){
            if(c.equals("..") && !stack1.isEmpty()){
                stack1.pop();
            }
            else if(!c.equals("") && !c.equals("..") && !c.equals(".")){
                stack1.push(c);
            }          

        }

        StringBuilder result = new StringBuilder();

        for(String dir : stack1){
            result.append("/").append(dir);
        }

        if(result.length()==0){
            return "/";
        }
        else {
            return result.toString();
        }

        
    }
}