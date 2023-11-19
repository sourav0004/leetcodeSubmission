class Solution {
     public void combSum(int[] candidates,int index,int target,List<Integer> temp,List<List<Integer>> ans){
            if(target==0)
            {
                ans.add(new ArrayList<>(temp));
                return;          
            }
            if(index==candidates.length){
                return;
        }

        for(int i=index;i<candidates.length;i++){
        if((i>index && candidates[i-1]==candidates[i]))
        continue;
        if(candidates[i]<=target){
            temp.add(candidates[i]);
            combSum(candidates,i+1,target-candidates[i],temp,ans);
            temp.remove(temp.size()-1);
        }
        else
        break;
        }
     }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        Arrays.sort(candidates);
        combSum(candidates,0,target,temp,ans);
        return ans;
    }
}