class Solution {
    public long atoi(int j,String s,long res,int neg){
        if(j>=s.length() || !Character.isDigit(s.charAt(j)))
         return res*neg;
         res=10*res+s.charAt(j)-'0';
         if(neg==-1 && (-1)*res<Integer.MIN_VALUE)
         return Integer.MIN_VALUE;
         if(neg==1 && res>Integer.MAX_VALUE)
         return Integer.MAX_VALUE;
         
         return atoi(j+1,s,res,neg);
    }
    public int myAtoi(String s) {

        int neg=1;
        long res=0;
        int i=0;
        while(i<s.length() && s.charAt(i)==' ')
         i++;
         if(i<s.length() && s.charAt(i)=='-'){
          neg=-1;
          i++;
         }
         else if(i<s.length() && s.charAt(i)=='+'){
          neg=1;
          i++;
         }
         if(i<s.length() && s.charAt(i)-'0'>=65)
         return 0;

     /*   for(int j=i;j<s.length();j++){
            char ch=s.charAt(j);
             if(ch-'0'>=0 && ch-'0'<=9){
                 res=10*res+ch-'0';
             }
             else{
                 return (int) res*neg;
             }

         if(neg==-1 && (-1)*res<Integer.MIN_VALUE)
         return Integer.MIN_VALUE;

         if(neg==1 && res>Integer.MAX_VALUE)
         return Integer.MAX_VALUE;

        }*/
         return (int)atoi(i,s,res,neg);

        
    }
}