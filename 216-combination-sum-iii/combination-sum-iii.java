class Solution {
    public void com3(List<List<Integer>> ans,List<Integer> tp,int k,int n,int i){
        if(n==0 && tp.size()==k)
        {
            ans.add(new ArrayList<>(tp));
            return;
        }
        if(tp.size()==k || i>9)
        return;

        if(n-i>=0){
         tp.add(i);
        com3(ans,tp,k,n-i,i+1);
        tp.remove(tp.size()-1);
        }
        com3(ans,tp,k,n,i+1);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
         List<List<Integer>> ans=new ArrayList<>();
         com3(ans,new ArrayList<>(),k,n,1);
         return ans;
    }
}