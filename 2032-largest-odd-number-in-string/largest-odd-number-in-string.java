class Solution {
    public String largestOddNumber(String num) {
        int index=-1;
        String res="";
        for(int i=num.length()-1;i>=0;i--){
            int a= num.charAt(i)-'0';
            if(a%2!=0)
            {
                return num.substring(0,i+1);
               // index=i;
               // break;
            }
                
        }
        
        return "";
        
    }
}