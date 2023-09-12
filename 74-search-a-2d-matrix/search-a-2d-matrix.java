class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int n= matrix[0].length;
        int m=matrix.length;
        
        int lrow=0;
        int hrow=m-1;
        
        while(lrow<=hrow){
            int midr=(lrow+hrow)/2;
            if(matrix[midr][0]==target)
                return true;
            else if(matrix[midr][0]>target){
                hrow=midr-1;
            }
            else{
                    int lcol=0;
                    int hcol=n-1;
                while(lcol<=hcol){
                    int midc=(lcol+hcol)/2;
                    
                    if(matrix[midr][midc]==target)
                        return true;
                    else if(matrix[midr][midc]>target){
                        hcol=midc-1;
                    }
                    else{
                        lcol=midc+1;
                    }
                }
                
                lrow=midr+1;
            }
        }
        
        return false;
        
    }
}