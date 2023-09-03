class Solution {
    
    
    private int totaldays(int[] weights,int wt){
        int sum=0;
        int td=0;
        
        for(int i=0;i<weights.length;i++){
            
            if(sum+weights[i]<=wt){
                sum+=weights[i];
            }
            else{
                sum=weights[i];
                td++;
            }
            
        }
        return ++td;
       
    }
    
    public int shipWithinDays(int[] weights, int days) {
        
        int maxWeight=Integer.MIN_VALUE;
        int sum=0;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
            maxWeight=Math.max(weights[i],maxWeight);
        }
        while(maxWeight<=sum){
            int midWeight=(maxWeight+sum)/2;
            int res= totaldays(weights,midWeight);
            if(res<=days){
                ans=Math.min(ans,midWeight);
                sum=midWeight-1;
            }
            else{
                maxWeight=midWeight+1;
            
            }
            
        }
        
        return ans;
        
    }
}