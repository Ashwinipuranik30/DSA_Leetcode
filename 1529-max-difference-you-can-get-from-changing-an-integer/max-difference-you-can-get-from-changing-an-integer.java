class Solution {
    public int maxDiff(int num) {
        String s= String.valueOf(num);
        String a= new String(s);
        String b = new String(s);

        for(int i=0; i<s.length();i++){
            if(s.charAt(i)!='9'){
                a=a.replace(s.charAt(i)+"","9");
                break;
            }
        }

        if(s.charAt(0)!='1'){
            b=b.replace(s.charAt(0)+"","1");
            return Integer.valueOf(a)-Integer.valueOf(b);
        }

        for(int i=1;i<s.length();i++){
            if((s.charAt(i)!='0') && (s.charAt(i)!='1')){
                b=b.replace(s.charAt(i)+"","0");
                break;
            }
        }

        return Integer.valueOf(a)-Integer.valueOf(b);

        
    }
}