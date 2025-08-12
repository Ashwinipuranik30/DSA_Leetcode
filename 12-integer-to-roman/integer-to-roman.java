class Solution {
    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();

        if(num>=1000){
            int quo=num/1000;
            num=num%1000;
            while(quo>0){
                result.append("M");
                quo--;
            }
        }
        if(num>=900){
            num=num%900;
            result.append("CM");
        }
        if(num>=500){
            num=num%500;
            result.append('D');
        }
        if(num>=400){
            num=num%400;
            result.append("CD");
        }
        if(num>=100){
            int quo=num/100;
            num=num%100;
            while(quo>0){
                result.append('C');
                quo--;
            }
        }
        if(num>=90){
            num=num%90;
            result.append("XC");
        }
        if(num>=50){
            num=num%50;
            result.append('L');
        }
        if(num>=40){
            num=num%40;
            result.append("XL");
        }
        if(num>=10){
            int quo=num/10;
            num=num%10;
            while(quo>0){
                result.append('X');
                quo--;
            }
        }
        if(num>=9){
            num=num%9;
            result.append("IX");
        }
        if(num>=5){
            num=num%5;
            result.append('V');
        }
        if(num>=4){
            num=num%4;
            result.append("IV");
        }
        if(num<4){
            while(num>0){
                result.append('I');
                num--;
            }
        }

        return result.toString();





        
    }
}