class Solution {
    public int[] productExceptSelf(int[] nums) {

        int prod=0;
        int flag=0;
        int zeroCount=0;
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                if(prod==0)
                prod=1;
            prod=prod*nums[i];
            }
            if(nums[i]==0){
                zeroCount++;
            flag=1;
            }
        }

        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0 && zeroCount==1)
            ans[i]=prod;
            else if(flag==1 || zeroCount>1)
            ans[i]=0;
            else{
                //System.out.println(flag);
             ans[i]=prod/nums[i];
            }

        }

        return ans;
        
    }
}