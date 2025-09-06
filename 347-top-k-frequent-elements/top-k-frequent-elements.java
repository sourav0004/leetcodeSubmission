class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.merge(nums[i],1,(a,b)->a+b);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(var entry : map.entrySet()){
            pq.offer(new int[]{entry.getValue(),entry.getKey()});
            if(pq.size()>k)
            pq.poll();
        }
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=pq.poll()[1];
        }
        return res;
    }
}