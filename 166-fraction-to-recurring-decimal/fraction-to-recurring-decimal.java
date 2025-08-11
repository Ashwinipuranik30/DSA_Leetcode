class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator==0){
            return "0";
        }
        long num= Math.abs((long) numerator);
        long den= Math.abs((long) denominator);
        long remainder=num%den *10;

        StringBuilder result = new StringBuilder();
        if((numerator<0) ^ (denominator<0)){
            result.append("-");
        }

        result.append(num/den);
        if(remainder!=0){
            result.append(".");
        }

        Map<Long, Integer> map1= new HashMap<>();

        while(remainder!=0){
            if(map1.containsKey(remainder)){
                int index= map1.get(remainder);
                result.insert(index,"(");
                result.append(")");
                break;
            }

            map1.put(remainder,result.length());
            result.append(remainder/den);
            remainder=remainder%den *10;
        }

        return result.toString();
        

        
    }
}