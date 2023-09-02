class Solution {
    public  int calculateTotalHours(int[] v, int hourly) {
        int totalH = 0;
        int n = v.length;
        //find total hours:
        for (int i = 0; i < n; i++) {
            totalH += Math.ceil((double)(v[i]) / (double)(hourly));
        }
        return totalH;
    }
    
     private int getMax(int[] piles){
        int t=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            t=Math.max(t,piles[i]);
        }
        
        return t;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int e=getMax(piles);
        int mid=0;
        int ans=Integer.MAX_VALUE;
        
        while(l<=e){
            mid=(l+e)/2;
            int sum=calculateTotalHours(piles,mid);
            if(sum<=h)
            {
                ans=Math.min(ans,mid);
                e=mid-1;
            }
            else{
                l=mid+1;
            }
                
        }
        
        return ans;
        
    }
}