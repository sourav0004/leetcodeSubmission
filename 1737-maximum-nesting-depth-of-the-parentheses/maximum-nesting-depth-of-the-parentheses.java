class Solution {
    public int maxDepth(String s) {
        int counter=0;
        int maxCounter=Integer.MIN_VALUE;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(')
             counter++;
             else if(ch==')')
             counter--;

             maxCounter=Math.max(counter,maxCounter);
        }
        
        return maxCounter;
    }
}