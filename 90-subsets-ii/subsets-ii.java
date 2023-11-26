class Solution {
    private void subSet(List<Integer> temp,int index, List<List<Integer>> ans,int[] nums){
        ans.add(new ArrayList<>(temp));
        for(int i=index;i<nums.length;i++){
            if(i!=index && nums[i]==nums[i-1])
            continue;
            temp.add(nums[i]);
            subSet(temp,i+1,ans,nums);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        subSet(new ArrayList<>(),0,ans,nums);
        return ans;

    }
}