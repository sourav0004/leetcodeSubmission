class Solution {
    
    private int possible(int[] bloomDay,int k,int day){
        int cnt=0;
        int t=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=day){
                cnt++;
            }
            else{
               t+=cnt/k;
                cnt=0;
                
            }
        }
        
        t+=cnt/k;
        return t;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int ans=Integer.MAX_VALUE;
        if(m*k>bloomDay.length)
            return -1;
        

        
        for(int i=0;i<bloomDay.length;i++){
            min=Math.min(bloomDay[i],min);
            max=Math.max(bloomDay[i],max);
        }
        
        int low=min;
        int high=max;
        
        while(low<=high){
            int mid=(low+high)/2;
              int d=possible(bloomDay,k,mid);
            if(d>=m){
                ans=Math.min(ans,mid);
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        
        return ans==Integer.MAX_VALUE?-1:ans;
        
    }
}