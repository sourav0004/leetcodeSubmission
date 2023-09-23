class Solution {
    public boolean rotateString(String s, String goal) {

        if(s.length()==goal.length()){
            if((s+s).contains(goal))
             return true;
             else
             return false;
        }

        return false;
        
    }
}