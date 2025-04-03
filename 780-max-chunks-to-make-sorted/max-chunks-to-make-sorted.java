class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n=arr.length;
        int chunks=0;
        int maxEle=-1;
        for(int i=0;i<n;i++){
            maxEle = Math.max(arr[i],maxEle);
            if(i==maxEle){
            chunks++;
            }
        }
        return chunks;
    }
}