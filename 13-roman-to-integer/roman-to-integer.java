class Solution {
    public int romanToInt(String s) {

        int answer=0;
        for(int i=s.length()-1;i>=0;i--){
            char ch= s.charAt(i);
            int value=0;
            switch(ch){
                case 'I':
                value=1;
                break;
                case 'V':
                value=5;
                break;
                case 'X':
                value=10;
                break;
                case 'L':
                value=50;
                break;
                case 'C':
                value=100;
                break;
                case 'D':
                value=500;
                break;
                case 'M':
                value=1000;

            }
            if(4*value<answer) answer-=value;
            else answer+=value;
        }

        return answer;
        
    }
}