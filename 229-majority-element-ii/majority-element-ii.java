class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> ans=new ArrayList<>();
        int cnt1=0;
        int cnt2=0;
        int el1=0,el2=0;
        
        for(int i=0;i<nums.length;i++){
            if(cnt1==0 && nums[i]!=el2){
                el1=nums[i];
                cnt1++;
            }
            else if(cnt2==0 && nums[i]!=el1){
                el2=nums[i];
                cnt2++;
            }
            else if(el1==nums[i])
                cnt1++;
            else if(el2==nums[i])
                cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        
        long threshHold=(nums.length/3);
        int ct1=0;
        int ct2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==el1)
                ct1++;
            else if(nums[i]==el2)
                ct2++;
        }
        
        if(ct1>threshHold)
            ans.add(el1);
        if(ct2>threshHold)
            ans.add(el2);
        
        return ans;
        
    }
}