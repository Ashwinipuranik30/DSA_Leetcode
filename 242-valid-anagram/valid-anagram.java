class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer> map1 = new HashMap<>();

        for(int i=0;i<s.length();i++){
            map1.put( s.charAt(i) , map1.getOrDefault(s.charAt(i),0)+1 );
        }

        for(int i=0;i<t.length();i++){
            if(map1.containsKey(t.charAt(i))){
                int value=map1.get(t.charAt(i));
                value-=1;
                map1.put(t.charAt(i),value);
            }
        }

        for( char key : map1.keySet()){
            int value=map1.get(key);
            if(value!=0){
                return false;
            }
        }
        return true;



    }
}