class Solution {
    public void combSum(int[] candidates,int index,int target,List<Integer> temp,List<List<Integer>> ans){
        if(index==candidates.length){
            if(target==0)
            ans.add(new ArrayList<>(temp));
            return;          
        }
        if(candidates[index]<=target){
            temp.add(candidates[index]);
            combSum(candidates,index,target-candidates[index],temp,ans);
            temp.remove(temp.size()-1);
        }
        combSum(candidates,index+1,target,temp,ans);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        combSum(candidates,0,target,temp,ans);
        return ans;
    }
}