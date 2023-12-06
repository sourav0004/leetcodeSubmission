class Solution {
    private boolean checkPalin(String s){
         StringBuilder input1 = new StringBuilder();
 
        // append a string into StringBuilder input1
        input1.append(s).reverse();

        return s.equals(new String(input1))?true:false;
    }
    private void getPartition(List<List<String>> ans,int index,List<String> temp,String s){
        if(index==s.length())
         {
             ans.add(new ArrayList<>(temp));
             return;
         }

         for(int i=index;i<s.length();i++){
             String tp=s.substring(index,i+1);
             if(checkPalin(tp))
             {
                 temp.add(tp);
                 getPartition(ans,i+1,temp,s);
                 temp.remove(temp.size()-1);
             }
         }

    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        getPartition(ans,0,new ArrayList<>(),s);
        return ans;

    }
}