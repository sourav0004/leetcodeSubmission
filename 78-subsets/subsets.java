class Solution {
    public void generateSet(List<List<Integer>> ans,int i,int[] nums,List<Integer> temp){
        if(i==nums.length)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        generateSet(ans,i+1,nums,temp);
        temp.remove(temp.size()-1);
        generateSet(ans,i+1,nums,temp);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        generateSet(ans,0,nums,temp);

        return ans;
    }
}