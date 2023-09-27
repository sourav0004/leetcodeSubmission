class Solution {
    int st=0;
    int length=0;
    public String longestPalindrome(String s) {

        if(s.length()==1)
         return s;
         if(s.length()==0)
         return "";

        for(int i=0;i<s.length()-1;i++){
            //expand for odd
            expand(i,i,s);
            expand(i,i+1,s);

        }

        return s.substring(st,st+length);
        
    }

    private  void expand(int start,int end,String s){

        while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)){
            start--;
            end++;
        }

        if(length<(end-start)-1){
            length=(end-start)-1;
            st=start+1;
        }
    }
}